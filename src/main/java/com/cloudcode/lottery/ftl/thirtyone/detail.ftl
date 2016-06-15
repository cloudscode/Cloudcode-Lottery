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
		 <#if entityAction=="create">
		  <input type="hidden" value="${serialnum!''}" id="serialnum" name="serialnum" >
		  <button type="button" id="generate" name="generate" class="btn btn-primary" >自动获取</button>
		 </#if>
     	<button type="button" id="calc" name="calc" class="btn btn-primary" >保存</button>
     	<button type="button" id="random" name="random" class="btn btn-warning" >取消</button>
     	 </div>
     </div>
     
</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<script type="text/javascript">
$(function(){
 

});
  $('button[name="generate"]').click( function() {
  
  $.ajax({
        url: '${request.getContextPath()}/thirtyOneHistory/generate',
        type: 'post',
        dataType: 'json',
        data:{},
        success: function(data) {
       		 if(data.result){
       		 	var obj = data.result;
       		 	$("input[name='a']").val(obj.a);
       		 	$("input[name='b']").val(obj.b);
       		 	$("input[name='c']").val(obj.c);
       		 	$("input[name='d']").val(obj.d);
       		 	$("input[name='e']").val(obj.e);
       		 	$("input[name='f']").val(obj.f);
       		 	$("input[name='g']").val(obj.g);
       		 	$("input[name='issue']").val(obj.issue);
       		 	$("input[name='specialnum']").val(obj.specialnum);
       		 	$("input[name='serialnum']").val(obj.serialnum);
       		 }
      }
});
 });
  $('button[name="calc"]').click( function() {
  	 if('${entityAction!''}' =='update'){
	  		
				   
	      		   $.ajax({
				        url: '${request.getContextPath()}/thirtyOneHistory/'+$("#id").val()+'/update',
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
			        url: '${request.getContextPath()}/thirtyOneHistory/create?',
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
       $('.ui-dialog-titlebar-close').trigger('click');
  });
</script>
</div>
</body>
</html>