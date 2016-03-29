package com.cloudcode.lottery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.base.Model;

@Entity(name = ProjectConfig.NAME + "lottery")
@Table(name = ProjectConfig.NAME + "_lottery")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Lottery extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = -741903476235031192L;
	

}
