package myday01_Test;

import java.util.ArrayList;

/*
 * 	在控制台打印如下的信息:
	-----------------------传智播客超市--------------------------
	商品编号	商品名称	生产厂家	商品单价	购买数量
	1			可乐		百事		3.0			6		
	2			冰红茶		康师傅		2.5     	5
	3			脉动		乐百氏		4.0         12 
	-------------------------------------------------------------
	您购买的商品总金额为: 78.5 元 

 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//创建集合
		ArrayList<Supermarket> list = new ArrayList<Supermarket>();
		list.add(new Supermarket(1,"可乐","百事",3.0,6));
		list.add(new Supermarket(2,"冰红茶","康师傅",2.5,5));
		list.add(new Supermarket(1,"脉动","乐百氏",4.0,12));
		
		for (Supermarket supermarket : list) {
			System.out.println(supermarket);
		}
	}

}
