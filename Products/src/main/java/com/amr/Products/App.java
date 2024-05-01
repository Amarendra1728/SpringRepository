package com.amr.Products;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
//        productCls prod=new productCls(10,"iphone",1,50000);
//        orderCls ord=new orderCls();

    	ProductCls prod=new ProductCls();
    	OrderCls ord=new OrderCls();
    	
    	prod.setProductId(101);
    	prod.setProductName("iphone");
    	prod.setProductQnty(1);
    	prod.setPprice(50000);
    
    	ord.setOid(101);
    	ord.setOname("vivo");
    	ord.setproduct(prod);
    	ord.print();
    	//prod.print();
    }
}