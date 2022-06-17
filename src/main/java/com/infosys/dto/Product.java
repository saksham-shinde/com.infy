package com.infosys.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prd_tbl")
public class Product {
     
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column (name="pid")
	int productId;
	@Column (name="pname",length=20)
    String productName;
    @Column (name="prate")
    int productRate;
    @Column (name="pqnt")
    int productQnt;
	
    public Product() {
		super();
	}

	public Product(int productId, String productName, int productRate, int productQnt) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRate = productRate;
		this.productQnt = productQnt;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductRate() {
		return productRate;
	}

	public void setProductRate(int productRate) {
		this.productRate = productRate;
	}

	public int getProductQnt() {
		return productQnt;
	}

	public void setProductQnt(int productQnt) {
		this.productQnt = productQnt;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productRate=" + productRate
				+ ", productQnt=" + productQnt + "]";
	}
    
    
    
     

}
