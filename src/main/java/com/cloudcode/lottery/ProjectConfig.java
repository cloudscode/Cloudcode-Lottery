package com.cloudcode.lottery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.cloudcode.framework.annotation.ModuleConfig;
import com.cloudcode.framework.bean.ProjectBeanNameGenerator;
import com.cloudcode.framework.dao.ModelObjectDao;
import com.cloudcode.framework.dao.impl.BaseDaoImpl;
import com.cloudcode.lottery.model.Forecast;
import com.cloudcode.lottery.model.ForecastIssue;
import com.cloudcode.lottery.model.History;
import com.cloudcode.lottery.model.Lottery;
import com.cloudcode.lottery.model.Lottery1;
import com.cloudcode.lottery.model.Lottery2;
import com.cloudcode.lottery.model.Lottery3;
import com.cloudcode.lottery.model.Lottery4;


@ModuleConfig(name=ProjectConfig.NAME,domainPackages={"com.cloudcode.lottery.model"})
@ComponentScan(basePackages={"com.cloudcode.lottery.*"},nameGenerator=ProjectBeanNameGenerator.class)
@PropertySource(name="cloudcode.evn",value={"classpath:proj.properties"})
public class ProjectConfig {
	public static final String NAME="lottery";
	public static final String PREFIX=NAME+".";

	@Bean(name=PREFIX+"lotteryDao")
	public ModelObjectDao<Lottery> generateLotteryDao(){
		return new BaseDaoImpl<Lottery>();
	}
	@Bean(name=PREFIX+"historyDao")
	public ModelObjectDao<History> generateHistoryDao(){
		return new BaseDaoImpl<History>();
	}
	@Bean(name=PREFIX+"forecastDao")
	public ModelObjectDao<Forecast> generateForecastDao(){
		return new BaseDaoImpl<Forecast>();
	}
	@Bean(name=PREFIX+"forecastIssueDao")
	public ModelObjectDao<ForecastIssue> generateForecastIssueDao(){
		return new BaseDaoImpl<ForecastIssue>();
	}
	@Bean(name=PREFIX+"lotteryDao1")
	public ModelObjectDao<Lottery1> generateLotteryDao1(){
		return new BaseDaoImpl<Lottery1>();
	}
	@Bean(name=PREFIX+"lotteryDao2")
	public ModelObjectDao<Lottery2> generateLotteryDao2(){
		return new BaseDaoImpl<Lottery2>();
	}
	@Bean(name=PREFIX+"lotteryDao3")
	public ModelObjectDao<Lottery3> generateLotteryDao3(){
		return new BaseDaoImpl<Lottery3>();
	}
	@Bean(name=PREFIX+"lotteryDao4")
	public ModelObjectDao<Lottery4> generateLotteryDao4(){
		return new BaseDaoImpl<Lottery4>();
	}
}
