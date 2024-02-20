package basic_intro.array;
/*
every index == seperate memory block //index represents a memory block in cpu
-> 2D basic_intro.array
new int[row][column] == new int[3][5]
{row1,row2,row3} == {index0,index1,index2}

row1(index 0) ->  have column1 indexes from 0 to 4
row2(index 1) ->  have column2 indexes from 0 to 4
row3(index 2) ->  have column3 indexes from 0 to 4

row index 0 = {column index 0, column index 1, column index 2}

Row index holds respective first column index. based on first index other consecutive column indexes are accessed
arr[0] -> points first row index memory block
arr[0][0] -> points first row index. -> then points first column index
arr[0][1] -> points first row index. -> then points second column index. it means second memory block of row1
 */
public class TwoDimensionalArray {
    int[][] arr = new int[3][5];
}