//����һ����ά���飬�������鲢���
public class ArrayDemo1
{
	public static void main(String[] args)
		{
			//������ά����
			int [][] arr = {{1,3,2},{32,56},{7,8,9,10}};
			//��������sum����ֵ
			int sum = 0;
			//��������
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