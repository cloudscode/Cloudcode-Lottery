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
    <label for="inputEmail3" class="col-sm-2 control-label">期号</label>
    <div class="col-sm-2 content">
      ${forecastIssue.issue}
    </div>
   </div>
   <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">记录数</label>
    <div class="col-sm-2 content">
      ${forecastIssue.forecastcount}
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">创建时间</label>
    <div class="col-sm-2 content">
      ${forecastIssue.drawtime!''}
    </div>
</form>

</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<script type="text/javascript">
 
</script>
</div>
</body>
</html>