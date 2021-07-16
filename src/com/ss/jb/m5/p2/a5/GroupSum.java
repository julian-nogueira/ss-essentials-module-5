package com.ss.jb.m5.p2.a5;

import java.util.ArrayList;
import java.util.List;

public class GroupSum {

	// Check the list for adjacent identical integers. If there are such
	// adjacent integers, store them separately in a list, then check if their
	// combined sum totals to the target. Otherwise, check if we can reach the
	// target without any of these adjacent integers.
	public boolean groupSum(List<Integer> list, Integer target) {
		List<Integer> listIdenticalIntegers = new ArrayList<Integer>();
		List<Integer> listNoIdenticalIntegers = new ArrayList<Integer>();
		Boolean result = false;
		Boolean adding = false;
		Integer size = list.size();
		Integer prev = 0;
		Integer curr = 0;
		Integer sum = 0;

		// The loop begins with the second element in the list. Get the first
		// element if it exists.
		if(size > 0) {
			prev = list.get(0);
		}

		// Store adjacent identical integers in a separate list. Store adjacent
		// non-identical integers in a separate list.
		for(int i = 1; i < size; i++) {
			curr = list.get(i);
			if(adding & prev == curr) {
				listIdenticalIntegers.add(curr);
			} else if(!adding && prev == curr) {
				listIdenticalIntegers.add(prev);
				listIdenticalIntegers.add(curr);
				adding = true;
			} else {
				if(!adding) {
					listNoIdenticalIntegers.add(prev);
				}
				adding = false;
			}
			prev = curr;
		}
	
		// The loop does not allow us to get the last identical integer. Check
		// if it is valid, then add it to the list accordingly.
		if(size > 0 && !adding) {
			listNoIdenticalIntegers.add(prev);
		}
		
		// If there were adjacent identical integers, check if the target can
		// be reached with their summation or with their omission. Otherwise,
		// proceed normally.
		if(listIdenticalIntegers.size() > 1) {
			sum = listIdenticalIntegers.stream().reduce(0, (x, y) -> x + y);
			result = (sum == target) || (groupSum(listNoIdenticalIntegers, target, 0));
		} else {
			// Recursively check for group sum.
			result = groupSum(list, target, 0);
		}
		
		return result;
	}

	// Recursively subtract integers in the passed list from the target. Return
	// true if we can subtract from the target evenly, such that the
	// subtraction results in 0, as we know some combination of integers can
	// add up to the target. Otherwise, return false.
	public boolean groupSum(List<Integer> list, Integer target, Integer index) {
		Boolean result = false;
		
		if(index > list.size() - 1) {
			return target == 0;
		}
		
		if(groupSum(list, target - list.get(index), index + 1)) {
			return true;
		}
		
		if(groupSum(list, target, index + 1)) {
			return true;
		}
		
		return result;
	}
}
