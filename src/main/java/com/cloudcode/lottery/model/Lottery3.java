package com.cloudcode.lottery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.base.Base;

@Entity//(name = ProjectConfig.NAME + "lottery")
@Table(name = ProjectConfig.NAME + "_lottery3")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Lottery3 extends Base{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7998327559773741674L;
 
	

}
