package com.cloudcode.lottery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cloudcode.lottery.ProjectConfig;
import com.cloudcode.lottery.model.base.Base;

@Entity//(name = ProjectConfig.NAME + "lottery")
@Table(name = ProjectConfig.NAME + "_lottery4")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Lottery4 extends Base{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5582857310410148747L;
 
	

}
