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
.content{
padding-top: 9px;
}
</style>
<body data-spy="scroll" data-target=".bs-docs-sidebar" data-twttr-rendered="true"> 
<div id="dialogDiv">
<div class="container" id="layout">
<form role="form" class="form-horizontal">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">号码</label>
    <div class="col-sm-2 content">
      ${history.strnum}
    </div>
    
   </div>
   
   <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">长度</label>
	    <div class="col-sm-2 content">
	      ${history.length}
	    </div>
	    <label for="inputEmail3" class="col-sm-2 control-label">间隔和</label>
	    <div class="col-sm-2 content">
	      ${history.integerervaland!''}
	    </div>
    </div>
    <div class="form-group">
	     <label for="inputEmail3" class="col-sm-2 control-label">总和</label>
	    <div class="col-sm-2 content">
	      ${history.total}
	    </div>
	     <label for="inputEmail3" class="col-sm-2 control-label">新 边重</label>
	    <div class="col-sm-2 content">
	      ${history.newno!'0'}:${history.noside!'0'}:${history.repeatno!'0'}
	    </div>
     </div>
    <div class="form-group">
	     <label for="inputEmail3" class="col-sm-2 control-label">尾数值</label>
	    <div class="col-sm-2 content">
	      ${history.lastvalueappears}
	    </div>
	    <label for="inputEmail3" class="col-sm-2 control-label">奇偶比</label>
	    <div class="col-sm-2 content">
	      ${history.odd}:${history.even}
	    </div>
   </div>
   
   <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">上下区比</label>
	    <div class="col-sm-2 content">
	      ${history.upperareas}:${history.lowerareas}
	    </div>
	     <label for="inputEmail3" class="col-sm-2 control-label">4区</label>
	    <div class="col-sm-2 content">
	      ${history.fourtharea1!'0'}:${history.fourtharea2!'0'}:${history.fourtharea3!'0'}:${history.fourtharea4!'0'}
	    </div>
     </div>
     <div class="form-group">
	     <label for="inputEmail3" class="col-sm-2 control-label">6区</label>
	    <div class="col-sm-2 content">
	      ${history.sixarea1!'0'}:${history.sixarea2!'0'}:${history.sixarea3!'0'}:${history.sixarea4!'0'}:${history.sixarea5!'0'}:${history.sixarea6!'0'}
	    </div>
	     <label for="inputEmail3" class="col-sm-2 control-label">9区</label>
	    <div class="col-sm-2 content">
	      ${history.ninearea1!'0'}:${history.ninearea2!'0'}:${history.ninearea3!'0'}:${history.ninearea4!'0'}:${history.ninearea5!'0'}:${history.ninearea6!'0'}:${history.ninearea7!'0'}:${history.ninearea8!'0'}:${history.ninearea9!'0'}
	    </div>
   </div>
   
    <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">余3</label>
	    <div class="col-sm-2 content">
	      ${history.thanthreeratio0!'0'}:${history.thanthreeratio1!'0'}:${history.thanthreeratio2!'0'}
	    </div>
	    <label for="inputEmail3" class="col-sm-2 control-label">余5</label>
	    <div class="col-sm-2 content">
	      ${history.thanfiveratio0!'0'}:${history.thanfiveratio1!'0'}:${history.thanfiveratio2!'0'}:${history.thanfiveratio3!'0'}:${history.thanfiveratio4!'0'}
	    </div>
	   </div>
	<div class="form-group">
	     <label for="inputEmail3" class="col-sm-2 control-label">余7</label>
	    <div class="col-sm-2 content">
	      ${history.thansevenratio0!'0'}:${history.thansevenratio1!'0'}:${history.thansevenratio2!'0'}:${history.thansevenratio3!'0'}:${history.thansevenratio4!'0'}:${history.thansevenratio5!'0'}:${history.thansevenratio6!'0'}
	    </div>
	    <label for="inputEmail3" class="col-sm-2 control-label">横纵比</label>
	    <div class="col-sm-2 content">
	      ${history.horver!''}
	    </div>
   </div>

    <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">连号</label>
    <div class="col-sm-2 content">
      ${history.consecutivenumber}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">横向间隔比</label>
    <div class="col-sm-2 content">
      ${history.thanthehorizontalspacing}
    </div>
    
   </div>
   
    <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">与上三期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthethreenumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上五期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthefivenumbers}
    </div>
     </div>
    <div class="form-group">
     <label for="inputEmail3" class="col-sm-2 control-label">与上七期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthesevennumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上十期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthetennumbers}
    </div>
   </div>
   <div class="form-group">
      <div class="col-sm-2 content">
      </div>
         <div class="col-sm-10 content">
     <div class="row">
     		<button name="num"  class="btn ui-button-primary" value="1">1&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="2">2&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="3">3&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="4">4&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="5">5&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="6">6&nbsp;&nbsp;</button>
      </div>
      <div class="row">
     		<button name="num"  class="btn ui-button-primary" value="7">7&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="8">8&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="9">9&nbsp;&nbsp;</button>
     		<button name="num"  class="btn ui-button-primary" value="10">10</button>
     		<button name="num"  class="btn ui-button-primary" value="11">11</button>
     		<button name="num"  class="btn ui-button-primary" value="12">12</button>
      </div>
      <div class="row">
	      <button name="num"  class="btn ui-button-primary" value="13">13</button>
	      <button name="num"  class="btn ui-button-primary" value="14">14</button>
	      <button name="num"  class="btn ui-button-primary" value="15">15</button>
	      <button name="num"  class="btn ui-button-primary" value="16">16</button>
	      <button name="num"  class="btn ui-button-primary" value="17">17</button>
	      <button name="num"  class="btn ui-button-primary" value="18">18</button>
      </div>
       <div class="row">
       <button name="num"  class="btn ui-button-primary" value="19">19</button>
      <button name="num"  class="btn ui-button-primary" value="20">20</button>
      <button name="num"  class="btn ui-button-primary" value="21">21</button>
      <button name="num"  class="btn ui-button-primary" value="22">22</button>
      <button name="num"  class="btn ui-button-primary" value="23">23</button>
      <button name="num"  class="btn ui-button-primary" value="24">24</button>
       
       </div>
       <div class="row">
       <button name="num"  class="btn ui-button-primary" value="25">25</button>
       <button name="num"  class="btn ui-button-primary" value="26">26</button>
       <button name="num"  class="btn ui-button-primary" value="27">27</button>
       <button name="num"  class="btn ui-button-primary" value="28">28</button>
       <button name="num"  class="btn ui-button-primary" value="29">29</button>
       <button name="num"  class="btn ui-button-primary" value="30">30</button>
       </div>
       <div class="row">
       <button name="num"  class="btn ui-button-primary" value="31">31</button>
       <button name="num"  class="btn ui-button-primary" value="32">32</button>
       <button name="num"  class="btn ui-button-primary" value="33">33</button>
       <button name="num"  class="btn ui-button-primary" value="34">34</button>
       <button name="num"  class="btn ui-button-primary" value="35">35</button>
       <button name="num"  class="btn ui-button-primary" value="36">36</button>
       </div>
    </div>
     </div> 
</form>
<div class="form-group">
 <div class="col-sm-9" style="text-align: center;"> 
     	<button type="button" id="updateButton" name="cancle" class="btn btn-warning" >取消</button>
 </div>
</div>
</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<script type="text/javascript">
   $('button[name="cancle"]').click( function() {
       $('.ui-dialog-titlebar-close').trigger('click');
  });
  $(function(){
  		$("button[value='${history.a}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  		$("button[value='${history.b}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  		$("button[value='${history.c}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  		$("button[value='${history.d}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  		$("button[value='${history.e}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  		$("button[value='${history.f}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  		$("button[value='${history.g}']").removeClass("btn ui-button-primary").addClass("btn ui-button-danger");
  });
</script>
</div>
</body>
</html>