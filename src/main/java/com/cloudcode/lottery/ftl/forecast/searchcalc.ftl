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
   <label for="inputEmail3" class="col-sm-2 control-label">间隔和</label>
   <div class="col-sm-2">
	    <input type="text" class="form-control" id="intervalAndTotalStrart" name="intervalAndTotalStrart" placeholder="">
	    </div>
	<div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span><input type="text" class="form-control" id="intervalAndTotalEnd" name="intervalAndTotalEnd" placeholder=""></div>
	 </div>
    <label for="inputEmail3" class="col-sm-2 control-label">横纵比</label>
    <div class="col-sm-2 content">
	     <select id="horVer" name="horVer" class="form-control">
		    <option value =""></option>
		    <option >0:0</option>
            <option >0:1</option>
            <option >0:2</option>
            <option >0:3</option>
            <option >0:4</option>
            <option >1:0</option>
            <option >1:1</option>
            <option >1:2</option>
            <option >1:3</option>
            <option >1:4</option>
            <option >2:0</option>
            <option >2:1</option>
            <option >2:2</option>
            <option >2:3</option>
            <option >2:4</option>
            <option >3:0</option>
            <option >3:1</option>
            <option >3:2</option>
            <option >3:3</option>
            <option >3:4</option>
            <option >4:0</option>
            <option >4:1</option>
            <option >4:2</option>
            <option >4:3</option>
            <option >4:4</option>
		</select>
    </div>
   </div>

<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">重号</label>
    <div class="col-sm-2 content">
	     <select id="repeatStart" name="repeatStart" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
     <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="repeatEnd" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
	    </div>
	 </div>
    <label for="inputEmail3" class="col-sm-2 control-label">边号</label>
    <div class="col-sm-2 content">
	     <select id="noSideStart" name="noSideStart" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
     <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="noSideEnd" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
	    </div>
	 </div>
 </div>
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">新号</label>
    <div class="col-sm-2 content">
	     <select id="newNoStart" name="newNoStart" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
    <div class="col-sm-2">
	    <div class="input-group">
	    <span class="input-group-addon">到</span>
	    <select  name="newNoEnd" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
	    </div>
	 </div>
	  <label for="inputEmail3" class="col-sm-2 control-label">出现尾数值</label>
    <div class="col-sm-2 content">
	     <select id="lastValueAppears" name="lastValueAppears" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		  <option value="8">8</option>
		  <option value="9">9</option>
		  <option value="无尾数">无尾数</option>
		</select>
    </div>
 </div>
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">与上三期号码数比</label>
    <div class="col-sm-4 content">
	     <select name="ratioOnTheThreeNumbers" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上五期号码数比</label>
    <div class="col-sm-4 content">
	     <select name="ratioOnTheFiveNumbers" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
</div>
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">与上七期号码数比</label>
    <div class="col-sm-4 content">
	     <select name="ratioOnTheSevenNumbers" class="form-control">
		   <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上十期号码数比</label>
    <div class="col-sm-4 content">
	     <select name="ratioOnTheTenNumbers" class="form-control">
		  <option value =""></option>
		  <option value ="0">0</option>
		  <option value ="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4">4</option>
		  <option value="5">5</option>
		  <option value="6">6</option>
		  <option value="7">7</option>
		</select>
    </div>
</div>
<div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">一定出</label>
	    <div class="col-sm-4 content">
	    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="1">1&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="2">2&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="3">3&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="4">4&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="5">5&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="6">6&nbsp;
			    </label>
			   </div>
			    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="7">7&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="8">8&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="9">9&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="10">10
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="11">11
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="12">12
			    </label>
			   </div>
			    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="13">13
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="14">14
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="15">15
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="16">16
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="17">17
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="18">18
			    </label>
			    </div>
			    <div class="row">
			   
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="19">19
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="20">20
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="21">21
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="22">22
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="23">23
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="24">24
			    </label>
			    </div>
			    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="25">25
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="26">26
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="27">27
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="28">28
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="29">29
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="30">30
			    </label>
			    </div>
			    <div class="row">
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="31">31
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="32">32
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="33">33
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="34">34
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="35">35
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="yes" value="36">36
			    </label>
			    </div>
	    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">一定不出</label>
    <div class="col-sm-4 content">
	     <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="1">1&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="2">2&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="3">3&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="4">4&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="5">5&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="6">6&nbsp;
			    </label>
			   </div>
			    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="7">7&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="8">8&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="9">9&nbsp;&nbsp;
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="10">10
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="11">11
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="12">12
			    </label>
			   </div>
			    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="13">13
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="14">14
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="15">15
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="16">16
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="17">17
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="18">18
			    </label>
			    </div>
			    <div class="row">
			   
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="19">19
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="20">20
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="21">21
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="22">22
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="23">23
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="24">24
			    </label>
			    </div>
			    <div class="row">
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="25">25
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="26">26
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="27">27
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="28">28
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="29">29
			    </label>
			    <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="30">30
			    </label>
			    </div>
			    <div class="row">
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="31">31
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="32">32
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="33">33
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="34">34
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="35">35
			    </label>
			     <label class="checkbox-inline">
			      <input type="checkbox" name="no" value="36">36
			    </label>
			    </div>
    </div>
</div>
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
 $( "#search" ).click(function(){

     /*  $.ajax({
			        url: '${request.getContextPath()}/forecast/search',
			        type: 'post',
			        dataType: 'json',
			        data: $('form#myFormId').serialize(),
			        success: function(data) {
 						 
			        }
			    });*/
			    
 window.location.href='${request.getContextPath()}/forecast/toForecastList?issueid=${issueid!''}&'+$('form#myFormId').serialize();
});
$( "#cancel" ).click(function(){
	 window.location.href='${request.getContextPath()}/forecast/toList';
});
</script>
</div>
</body>
</html>