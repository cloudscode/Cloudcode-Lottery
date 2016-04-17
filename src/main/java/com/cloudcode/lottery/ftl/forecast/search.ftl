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
    <label for="inputEmail3" class="col-sm-2 control-label">奇偶比</label>
    <div class="col-sm-2 content">
	     <select id="oddeven" name="oddeven">
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
 		
	  /*$.post('${request.getContextPath()}/forecast/search',$('form#myFormId').serialize(),function(result){
      		 window.location.href='${request.getContextPath()}/forecast/toList';
     });*/
     
       $.ajax({
			        url: '${request.getContextPath()}/forecast/search',
			        type: 'post',
			        dataType: 'json',
			        data: $('form#myFormId').serialize(),
			        success: function(data) {
 						 window.location.href='${request.getContextPath()}/historyLottery/toList';
			        }
			    });
});
$( "#cancel" ).click(function(){
	 
});
</script>
</div>
</body>
</html>