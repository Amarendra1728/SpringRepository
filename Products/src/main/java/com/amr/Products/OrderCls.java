package com.amr.Products;

public class OrderCls {
	
		private int Oid;
		private String Oname;
		private ProductCls product;
		
//		public orderCls(int Oid,String Oname,productCls produ)
//		{
//			this.Oid=Oid;
//			this.Oname=Oname;
//			this.product=produ;
//		}
		public OrderCls() {
			
		}
		public void setOid(int Oid) {
			this.Oid=Oid;
		}
		public void setOname(String Oname) {
			this.Oname=Oname;
		}
		public void setproduct(ProductCls prd) {
			this.product=prd;
		}
		public int getOId() {
			return this.Oid;
		}
		public String getOName() {
			return this.Oname;
		}
		public  ProductCls getpProduct() {
			return this.product;
		}
		public void print() {
			System.out.println(Oid);
			System.out.println(Oname);
			product.print();
		}
	  }

