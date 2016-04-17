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
<form role="form" class="form-horizontal" id="myFormId" action="${request.getContextPath()}/menus/createMenu" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">号码</label>
    <div class="col-sm-2 content">
      ${forecast.strnum}
    </div>
    
   </div>
   
   <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">长度</label>
    <div class="col-sm-2 content">
      ${forecast.length}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">间隔和</label>
    <div class="col-sm-2 content">
      ${forecast.integerervaland!''}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">总和</label>
    <div class="col-sm-2 content">
      ${forecast.total}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">新 边重</label>
    <div class="col-sm-2 content">
      ${forecast.newno!'0'}:${forecast.noside!'0'}:${forecast.repeatno!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">尾数值</label>
    <div class="col-sm-2 content">
      ${forecast.lastvalueappears}
    </div>
   </div>
   
   <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">奇偶比</label>
    <div class="col-sm-2 content">
      ${forecast.odd}:${forecast.even}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">上下区比</label>
    <div class="col-sm-2 content">
      ${forecast.upperareas}:${forecast.lowerareas}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">4区</label>
    <div class="col-sm-2 content">
      ${forecast.fourtharea1!'0'}:${forecast.fourtharea2!'0'}:${forecast.fourtharea3!'0'}:${forecast.fourtharea4!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">6区</label>
    <div class="col-sm-2 content">
      ${forecast.sixarea1!'0'}:${forecast.sixarea2!'0'}:${forecast.sixarea3!'0'}:${forecast.sixarea4!'0'}:${forecast.sixarea5!'0'}:${forecast.sixarea6!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">9区</label>
    <div class="col-sm-2 content">
      ${forecast.ninearea1!'0'}:${forecast.ninearea2!'0'}:${forecast.ninearea3!'0'}:${forecast.ninearea4!'0'}:${forecast.ninearea5!'0'}:${forecast.ninearea6!'0'}:${forecast.ninearea7!'0'}:${forecast.ninearea8!'0'}:${forecast.ninearea9!'0'}
    </div>
   </div>
   
    <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">余3</label>
    <div class="col-sm-2 content">
      ${forecast.thanthreeratio0!'0'}:${forecast.thanthreeratio1!'0'}:${forecast.thanthreeratio2!'0'}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">余5</label>
    <div class="col-sm-2 content">
      ${forecast.thanfiveratio0!'0'}:${forecast.thanfiveratio1!'0'}:${forecast.thanfiveratio2!'0'}:${forecast.thanfiveratio3!'0'}:${forecast.thanfiveratio4!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">余7</label>
    <div class="col-sm-2 content">
      ${forecast.thansevenratio0!'0'}:${forecast.thansevenratio1!'0'}:${forecast.thansevenratio2!'0'}:${forecast.thansevenratio3!'0'}:${forecast.thansevenratio4!'0'}:${forecast.thansevenratio5!'0'}:${forecast.thansevenratio6!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">连号</label>
    <div class="col-sm-2 content">
      ${forecast.consecutivenumber}
    </div>
   </div>
   
   
    <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">横向间隔比</label>
    <div class="col-sm-2 content">
      ${forecast.thanthehorizontalspacing}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">与上三期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.ratioonthethreenumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上五期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.upperareas}:${forecast.lowerareas}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上七期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.upperareas}:${forecast.lowerareas}
    </div>
   </div>
   
    <div class="form-group">
   
    <label for="inputEmail3" class="col-sm-2 control-label">与上三期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.ratioonthethreenumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上五期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.ratioonthefivenumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上七期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.ratioonthesevennumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上十期号码数比</label>
    <div class="col-sm-2 content">
      ${forecast.ratioonthetennumbers}
    </div>
   </div>
   
</form>

</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<script type="text/javascript">
 
</script>
</div>
</body>
</html>