package toh;

import java.util.Stack;

/**
 * Tower of Hanoi Problem
 * Transfer a set of 3 rings from Tower A (Source) to Tower B (Destination)
 * - Only 1 ring must be moved at a time
 * - A larger ring cannot be placed on a smaller ring in any move
 * - For transferring a disk temporarily, Tower C (temporary tower) can be used
 * - No ring can be set upon a smaller ring on any move
 * 
 */
public class TohRunner
{

	public static void main(String[] args)
	{
		Ring ring1 = new Ring("1", 1);
		Ring ring2 = new Ring("2", 2);
		Ring ring3 = new Ring("3", 3);
		
		Stack<Ring> towerA = new Stack<Ring>();
		Stack<Ring> towerB = new Stack<Ring>();
		Stack<Ring> towerC = new Stack<Ring>();
		
		towerA.push(ring3);
		towerA.push(ring2);
		towerA.push(ring1);
		
		int n = 3;
		
		towerOfHanoi(n, towerA, towerB, towerC);
		
		System.out.println("Tower A");
		System.out.println("Bottom-" + towerA + "-Top");
		System.out.println("Tower B");
		System.out.println("Bottom-" + towerB + "-Top");
		System.out.println("Tower C");
		System.out.println("Bottom-" + towerC + "-Top");
	}
	
	public static void towerOfHanoi(int n, Stack<Ring> sourceTower, Stack<Ring> destTower, Stack<Ring> tempTower)
	{
		if (n == 0)
            return;
		
		tempTower.push(sourceTower.pop());
		towerOfHanoi(n-1, sourceTower, tempTower, destTower);
		
		destTower.push(tempTower.pop());
		towerOfHanoi(n-1, tempTower, destTower, sourceTower);
	}
}
