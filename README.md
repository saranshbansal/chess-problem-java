Problem
=======

The problem is to find all unique configurations of a set of normal chess pieces on a chess board with dimensions M×N where none of the pieces is in a position to take any of the others. Providing the number of results is useful, but not enough to complete the assignment. Assume the colour of the piece does not matter, and that there are no pawns among the pieces.

Write a program which takes as input:
1. The dimensions of the board: M, N
2. The number of pieces of each type (King, Queen, Bishop, Rook and Knight) to try
and place on the board.

As output, the program should list all the unique configurations to the console for which all of the pieces can be placed on the board without threatening each other. When returning your solution, please provide with your answer the total number of unique configurations for a **7 ×7 board with 2 Kings, 2 Queens, 2 Bishops and 1 Knight**. Also provide the time it took to get the final score. Needless to say, the lower the time, the better.

Example
-------

Input: 3×3 board containing 2 Kings and 1 Rook.

| **K** | **-** | **K** |  
| **-** | **-** | **-** |  
| **-** | **R** | **-** |  
  
| **K** | **-** | **-** |  
| **-** | **-** | **R** |  
| **K** | **-** | **-** |  

| **-** | **-** | **K** |  
| **R** | **-** | **-** |  
| **-** | **-** | **K** |   
  
| **-** | **R** | **-** |  
| **-** | **-** | **-** |  
| **K** | **-** | **K** |   

To Run
-------
1. Import the project on your local IDE.
2. Right Click on the project root and run as a standard Java Application.