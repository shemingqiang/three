//创建一个二维数组，遍历数组并求和
public class ArrayDemo1
{
	public static void main(String[] args)
		{
			//创建二维数组
			int [][] arr = {{1,3,2},{32,56},{7,8,9,10}};
			//创建变量sum并赋值
			int sum = 0;
			//遍历数组
			for (int x =0;x <arr.length ;x++ )
			{
				for (int y = 0;y < arr[x].length ;y++ )
				{
					System.out.println(arr[x][y]);
					sum = sum +arr[x][y];
				}
			}
			System.out.println("sum="+sum);
	
		}
}