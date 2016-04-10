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
      ${history.Integerervaland}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">总和</label>
    <div class="col-sm-2 content">
      ${history.total}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">新 边重</label>
    <div class="col-sm-2 content">
      ${history.newno!'0'}:${history.noside!'0'}:${history.repeatno!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">尾数值</label>
    <div class="col-sm-2 content">
      ${history.lastvalueappears}
    </div>
   </div>
   
   <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">奇偶比</label>
    <div class="col-sm-2 content">
      ${history.odd}:${history.even}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">上下区比</label>
    <div class="col-sm-2 content">
      ${history.upperareas}:${history.lowerareas}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">4区</label>
    <div class="col-sm-2 content">
      ${history.fourtharea1!'0'}:${history.fourtharea2!'0'}:${history.fourtharea3!'0'}:${history.fourtharea4!'0'}
    </div>
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
     <label for="inputEmail3" class="col-sm-2 control-label">余7</label>
    <div class="col-sm-2 content">
      ${history.thansevenratio0!'0'}:${history.thansevenratio1!'0'}:${history.thansevenratio2!'0'}:${history.thansevenratio3!'0'}:${history.thansevenratio4!'0'}:${history.thansevenratio5!'0'}:${history.thansevenratio6!'0'}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">连号</label>
    <div class="col-sm-2 content">
      ${history.consecutivenumber}
    </div>
   </div>
   
   
    <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">横向间隔比</label>
    <div class="col-sm-2 content">
      ${history.thanthehorizontalspacing}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">与上三期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthethreenumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上五期号码数比</label>
    <div class="col-sm-2 content">
      ${history.upperareas}:${history.lowerareas}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上七期号码数比</label>
    <div class="col-sm-2 content">
      ${history.upperareas}:${history.lowerareas}
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
     <label for="inputEmail3" class="col-sm-2 control-label">与上七期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthesevennumbers}
    </div>
     <label for="inputEmail3" class="col-sm-2 control-label">与上十期号码数比</label>
    <div class="col-sm-2 content">
      ${history.ratioonthetennumbers}
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