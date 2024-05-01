package com.amr.Products;

public class ProductCls {

	private int ProductId;
		private String ProductName;
		private int ProductQnty;
		private double Pprice;
		
//		public productCls(int productid, String productname,int productQnty,double Pprice)
//		{
//			this.ProductId=productid;
//			this.ProductName=productname;
//			this.ProductQnty=productQnty;
//			this.Pprice=Pprice;
//		}
		
		public ProductCls(){
			
		}
		 public void setProductId(int ProductId){
			this.ProductId=ProductId;
		 }
		 public void setProductName(String ProductName){
			 this.ProductName=ProductName;
		 }
		 public void setProductQnty(int ProductQnty) {
			 this.ProductQnty=ProductQnty;
		 }
		 public void setPprice(double Pprice) {
			 this.Pprice=Pprice;
		 }
		    
		    public int  getProductId()
		    {
				return this.ProductId;
			 }
			 public String getProductName()
			 {
				 return this.ProductName;
			 }
			 public int getProductQnty()
			 {
				 return this.ProductQnty;
			 }
			 public double getPprice()
			 {
				  return this.Pprice;
			 }
				public void print() {
					System.out.println(ProductId);
					System.out.println(ProductName);
					System.out.println(ProductQnty);
					System.out.println(Pprice);
				}
	}

