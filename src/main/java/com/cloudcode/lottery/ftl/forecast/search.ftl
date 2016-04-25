<!DOCTYPE html>
<html lang="en">
<head>
   <#include "classpath:com/cloudcode/framework/common/ftl/head.ftl"/>
</head>
<style>
#updateButton{
	width:80px;
	margin: 2px;
}
select{
    width: 100px;
    height: 35px;
}
</style>
<body data-spy="scroll" data-target=".bs-docs-sidebar" data-twttr-rendered="true"> 
<div id="dialogDiv">
<div class="container" id="layout">
<form role="form" class="form-horizontal" id="myFormId" >
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2">预测期号：${issue!''}</label><input type="hidden"  name="issue" value="${issue!''}">
  </div>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">奇偶比</label>
    <div class="col-sm-4 content">
	     <select id="oddeven" name="oddeven" class="form-control">
		  <option value =""></option>
		  <option value ="0:7">0:7</option>
		  <option value ="1:6">1:6</option>
		  <option value="2:5">2:5</option>
		  <option value="3:4">3:4</option>
		  <option value="4:3">4:3</option>
		  <option value="5:2">5:2</option>
		  <option value="6:1">6:1</option>
		  <option value="7:0">7:0</option>
		</select>
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">连号个数</label>
    <div class="col-sm-4 content">
	    <select id="consecutiveNumber" name="consecutiveNumber" class="form-control">
		<option value =""></option>
		<option value ="0">无连号</option>
		<option value ="2">2</option>
	    <option value ="2+2">2+2</option>
	    <option value ="2+3">2+3</option>
	    <option value ="2+4">2+4</option>
	    <option value ="2+2+2">2+2+2</option>
	    <option value ="2+2+3">2+2+3</option>
	    <option value ="2+3+2">2+3+2</option>
	    <option value ="3">3</option>
	    <option value ="3+2">3+2</option>
	    <option value ="3+2+2">3+2+2</option>
	    <option value ="3+3">3+3</option>
	    <option value ="4">4</option>
	    <option value ="4+2">4+2</option>
	    <option value ="5">5</option>
		</select>
    </div>
 </div>
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">总和(81-180)</label>
    <div class="col-sm-2">
	    <input type="text" class="form-control" id="totalStrart" name="totalStrart" placeholder="">
	    </div>
	<div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span><input type="text" class="form-control" id="totalEnd" name="totalEnd" placeholder=""></div>
	 </div>
	<label for="inputEmail3" class="col-sm-2 control-label">T值(6-12)</label>
    <div class="col-sm-2">
	    <input type="text" class="form-control" id="tStrart" name="tStrart" placeholder="">
	    </div>
	<div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span><input type="text" class="form-control" id="tEnd" name="tEnd"placeholder=""></div>
	 </div>
 </div>

<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">长度(16-35)</label>
    <div class="col-sm-2">
	    <input type="text" class="form-control" id="lengthStart" name="lengthStart" placeholder="">
	    </div>
	<div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span><input type="text" class="form-control" id="lengthEnd" name="lengthEnd" placeholder=""></div>
	 </div>
	<label for="inputEmail3" class="col-sm-2 control-label">横向间隔和(11-30)</label>
    <div class="col-sm-2">
	    <input type="text" class="form-control" id="thanTheHorizontalSpacingAddStart" name="thanTheHorizontalSpacingAddStart" placeholder="">
	    </div>
	<div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span><input type="text" class="form-control" id="thanTheHorizontalSpacingAddEnd" name="thanTheHorizontalSpacingAddEnd"placeholder=""></div>
	 </div>
 </div>
<p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">上下区个数比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">上区（1-18）</label>
    <div class="col-sm-2 content">
	     <select  name="upperAreasStart" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="upperAreasEnd" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">下区（19-36）</label>
    <div class="col-sm-2 content">
	     <select  name="lowerAreasStart" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="lowerAreasEnd" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		</select>
	    </div>
	 </div>
 </div>
 </p>
 <p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">4区之比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">1区（1-9）</label>
    <div class="col-sm-2 content">
	     <select  name="fourthArea1Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="fourthArea1End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">2区（10-18）</label>
     <div class="col-sm-2 content">
	     <select  name="fourthArea2Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="fourthArea2End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">3区（19-27）</label>
    <div class="col-sm-2 content">
	     <select  name="fourthArea3Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="fourthArea3End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">4区（28-36）</label>
     <div class="col-sm-2 content">
	     <select  name="fourthArea4Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="fourthArea4End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
 </div>
 </p>
 
 <p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">6区之比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">1区（1-6）</label>
    <div class="col-sm-2 content">
	     <select  name="sixArea1Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="sixArea1End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">2区（7-12）</label>
     <div class="col-sm-2 content">
	     <select  name="sixArea2Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="sixArea2End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">3区（13-18）</label>
    <div class="col-sm-2 content">
	     <select  name="sixArea3Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="sixArea3End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">4区（19-24）</label>
     <div class="col-sm-2 content">
	     <select  name="sixArea4Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="sixArea4End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">5区（25-30）</label>
    <div class="col-sm-2 content">
	     <select  name="sixArea5Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="sixArea5End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">6区（31-36）</label>
     <div class="col-sm-2 content">
	     <select  name="sixArea6Start" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="sixArea6End" class="form-control">
		  <option value =""></option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 </p>
 
 <p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">9区之比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">1区（1-4）</label>
    <div class="col-sm-2 content">
         <select  name="nineArea1Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea1End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
     <label for="inputEmail3" class="col-sm-2 control-label">2区（5-8）</label>
     <div class="col-sm-2 content">
         <select  name="nineArea2Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea2End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">3区（9-12）</label>
    <div class="col-sm-2 content">
         <select  name="nineArea3Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea3End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
     <label for="inputEmail3" class="col-sm-2 control-label">4区（13-16）</label>
     <div class="col-sm-2 content">
         <select  name="nineArea4Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea4End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label"> 5区（17-20）</label>
    <div class="col-sm-2 content">
         <select  name="nineArea5Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea5End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
     <label for="inputEmail3" class="col-sm-2 control-label">6区（21-24）</label>
     <div class="col-sm-2 content">
         <select  name="nineArea6Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea6End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label"> 7区（25-28）</label>
    <div class="col-sm-2 content">
         <select  name="nineArea7Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea7End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
     <label for="inputEmail3" class="col-sm-2 control-label">8区（29-32）</label>
     <div class="col-sm-2 content">
         <select  name="nineArea8Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea8End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">9区（33-36）</label>
    <div class="col-sm-2 content">
         <select  name="nineArea9Start" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
    </div>
   <div class="col-sm-2">
        <div class="input-group">
        <span class="input-group-addon">到</span>
        <select  name="nineArea9End" class="form-control">
          <option value =""></option>
          <option value ="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        </div>
     </div>
 </div>    
 </p>
 
 
 <p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余3个数比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余0</label>
    <div class="col-sm-2 content">
	     <select  name="thanThreeRatio0Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		   <option value="5">5</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanThreeRatio0End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		   <option value="5">5</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">余1</label>
    <div class="col-sm-2 content">
	     <select  name="thanThreeRatio1Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		   <option value="5">5</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanThreeRatio1End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		   <option value="5">5</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余2</label>
    <div class="col-sm-2 content">
	     <select  name="thanThreeRatio2Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		   <option value="5">5</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanThreeRatio2End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		   <option value="5">5</option>
		</select>
	    </div>
	 </div>
 </div>
 </p>
 
 <p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余5个数比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余0</label>
    <div class="col-sm-2 content">
	     <select  name="thanFiveRatio0Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanFiveRatio0End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">余1</label>
    <div class="col-sm-2 content">
	     <select  name="thanFiveRatio1Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanFiveRatio1End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余2</label>
    <div class="col-sm-2 content">
	     <select  name="thanFiveRatio2Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanFiveRatio2End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">余3</label>
    <div class="col-sm-2 content">
	     <select  name="thanFiveRatio3Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanFiveRatio3End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余4</label>
    <div class="col-sm-2 content">
	     <select  name="thanFiveRatio4Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanFiveRatio4End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		</select>
	    </div>
	 </div>
 </div>
 </p>
 
 <p class="bg-info">
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余7个数比</label>
</div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余0</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio0Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio0End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">余1</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio1Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio1End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余2</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio2Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio2End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">余3</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio3Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio3End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余4</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio4Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio4End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
	 <label for="inputEmail3" class="col-sm-2 control-label">余5</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio5Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio5End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余6</label>
    <div class="col-sm-2 content">
	     <select  name="thanSevenRatio6Start" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
    </div>
   <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="thanSevenRatio6End" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		</select>
	    </div>
	 </div>
 </div>
 </p>
 
</form>
 <div class="container" id="layout" style="text-align: center;">
   <div class="col-lg-12 col-sm-12">

        <button id="search" class="btn btn-primary">查询</button>
       
        <button id="cancel" class="btn btn-warning">取消</button>
         
</div>
</div>

</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<script type="text/javascript">
 $( "#search").click(function(){
 		
	 $( "#search").attr("disabled","disabled");
       $.ajax({
			        url: '${request.getContextPath()}/forecast/search',
			        type: 'post',
			        dataType: 'json',
			        data: $('form#myFormId').serialize(),
			        success: function(data) {
 						 window.location.href='${request.getContextPath()}/forecastIssue/toList';
			        }
			    });
});
$( "#cancel" ).click(function(){
	 window.location.href='${request.getContextPath()}/forecast/toList';
});
</script>
</div>
</body>
</html>