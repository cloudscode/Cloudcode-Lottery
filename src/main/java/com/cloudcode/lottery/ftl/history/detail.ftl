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
</style>
<body data-spy="scroll" data-target=".bs-docs-sidebar" data-twttr-rendered="true"> 
<div id="dialogDiv">
<div class="container" id="layout">
<form role="form" class="form-horizontal" id="myFormId" >
  <div class="form-group">
   <label for="inputEmail3" class="col-sm-2 control-label">期号</label>
    <div class="col-sm-2">
	    <input type="text" class="form-control"  name="issue" placeholder="" value="${history.issue!''}">
	</div>
	<label for="inputEmail3" class="col-sm-2 control-label">特别号码</label>
    <div class="col-sm-3">
	    <input type="text" class="form-control"  name="specialnum" placeholder="" value="${history.specialnum!''}">
	</div>
  </div>
  <div class="form-group">
   <label for="inputEmail3" class="col-sm-2 control-label">开奖号码</label>
    <div class="col-sm-1">
	    <input type="text" class="form-control"  name="a" placeholder="" value="${history.a!''}">
	</div>
	 <div class="col-sm-1">
	    <input type="text" class="form-control"  name="b" placeholder="" value="${history.b!''}">
	</div>
	 <div class="col-sm-1">
	    <input type="text" class="form-control"  name="c" placeholder="" value="${history.c!''}">
	</div>
	 <div class="col-sm-1">
	    <input type="text" class="form-control"  name="d" placeholder="" value="${history.d!''}">
	</div>
	 <div class="col-sm-1">
	    <input type="text" class="form-control"  name="e" placeholder="" value="${history.e!''}">
	</div>
	 <div class="col-sm-1">
	    <input type="text" class="form-control"  name="f" placeholder="" value="${history.f!''}">
	</div>
	 <div class="col-sm-1">
	    <input type="text" class="form-control"  name="g" placeholder="" value="${history.g!''}">
	</div>
  </div>
</form>
  <div class="form-group">
 <div class="col-sm-9" style="text-align: center;"> <input type="hidden" value="${history.id!''}" id="id" name="id" >
     	<button type="button" id="updateButton" name="calc" class="btn btn-primary" >保存</button>
     	<button type="button" id="updateButton" name="random" class="btn btn-primary" >取消</button>
     	 </div>
     </div>
     
</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<script type="text/javascript">
  $('button[name="calc"]').click( function() {
  	 if('${entityAction!''}' =='update'){
	  		
				   
	      		   $.ajax({
				        url: '${request.getContextPath()}/historyLottery/'+$("#id").val()+'/update',
				        type: 'post',
				        dataType: 'json',
				        data:$('form#myFormId').serialize(),
				        success: function(data) {
				       		 $('body').wHumanMsg('theme', 'black').wHumanMsg('msg', '数据保存成功！', {fadeIn: 300, fadeOut: 300});
				        	 $('.ui-dialog-titlebar-close').trigger('click');
				           }
			    });
		
   }else{
	  
			    $.ajax({
			        url: '${request.getContextPath()}/historyLottery/create',
			        type: 'post',
			        dataType: 'json',
			        data: $('form#myFormId').serialize(),
			        success: function(data) {
			       		 $('body').wHumanMsg('theme', 'black').wHumanMsg('msg', '数据保存成功！', {fadeIn: 300, fadeOut: 300});
			       		 $('.ui-dialog-titlebar-close').trigger('click');
			         }
			    });
		
    }
  });
  $('button[name="random"]').click( function() {
       
  });
</script>
</div>
</body>
</html>