package com.weshopify.platform.features.categories.bean;

import java.io.Serializable;

import lombok.Data;


@Data
public class CategoryBean implements Serializable{
		
	private static final long serialVersionUID = 2257087925467627525L;

	private int id;

	private String name;
	
	private String alias;
	
	private String image;
	
	private boolean enabled;
	
	private String allParentIDs;
	
		
}
