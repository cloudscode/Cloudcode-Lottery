<!DOCTYPE html>
<html lang="en">
<head>
    <#include "classpath:com/cloudcode/framework/common/ftl/head.ftl"/>
</head>

<body data-spy="scroll" data-target=".bs-docs-sidebar" data-twttr-rendered="true">
<div id="dialogDiv">
<div class="container" id="layout">
<div class="col-lg-9 col-sm-9" id="article">
<section id="button">
        <#--<button id="openwindow" class="ui-button-success">预测</button>
        <button id="edit" class="ui-button-primary">查询</button>
        <button id="view" class="ui-button-warning">查看</button>-->
        <button id="delete" class="ui-button-danger">删除</button>
        <button id="refresh" class="ui-button-info">刷新</button>
</section></div></div>
<div class="container" id="layoutinfo" style="text-align: center;">

</div>
<div class="row">
    <div class="col-lg-12 col-sm-12">
        <table id="jqGrid01" style="width:100%;"></table>
        <div id="jqGridPager01"></div>
    </div>
</div>
<#include "classpath:com/cloudcode/framework/common/ftl/vendor.ftl"/>
<!--jqGrid-->
<script src="${request.getContextPath()}/static/jquery/ui/bootstrap/third-party/jqGrid/jqGrid/js/i18n/grid.locale-cn.js" type="text/javascript"></script>
<script src="${request.getContextPath()}/static/jquery/ui/bootstrap/third-party/jqGrid/jqGrid/js/jquery.jqGrid.js" type="text/javascript"></script>
<!--end jqGrid-->
<script src="${request.getContextPath()}/static/jquery/framework/ajaxframework.js" type="text/javascript"></script>
<script type="text/javascript">
var grid = null;

$(function(){
    if ($.fn.jqGrid){
       grid =  $("#jqGrid01").jqGrid({
           url:"${request.getContextPath()}/forecastIssue/query",
            datatype: "json",
            height: 250,
            rowNum: 20,
            rowList: [10,20,30,50,100,200,500,1000,5000],
            colNames:['Id', '期号','创建时间','记录数'],
            colModel:[
                {name:'id',index:'id', width:30, hidden:true},
                {name:'issue',  width:30},
                {name:'drawtime',index:'exchange', width:100,formatter:function(cellvalue, options, rowObject){
                	return new Date(cellvalue).Format("yyyy-MM-dd");
                }},
                {name:'forecastcount',index:'groupType', width:0,formatter:function(cellvalue, options, rowObject){
                	var html='<a href="javascript:void(0);" onclick="showCount(\''+rowObject.id+'\')">'+cellvalue+'</a>';
                	return html;
                }}
            ],
            autowidth: true,
            height: "auto",            
            pager: "#jqGridPager01",
            viewrecords: true,
            caption: "预测信息",
            hidegrid:false,
            multiselect: true,
            altRows: true
        });
        jQuery("#jqGrid01").jqGrid('navGrid','#pager2',{edit:true,add:false,del:false});
       
    }

$( "#openwindow" ).click(function(){
	 window.location.href='${request.getContextPath()}/forecastIssue/toSearch';
});
$( "#edit" ).click(function(){
	window.location.href='${request.getContextPath()}/forecastIssue/toCalcSearch';
}); 
$( "#delete" ).click(function(){
var id;
	     id = grid.jqGrid('getGridParam','selrow');
	     if(id.toString() != null && id.toString() != ""){
		    $.ajax({
			        url: '${request.getContextPath()}/forecastIssue/0/deleteAll',
			        type: 'post',
			        dataType: 'json',
			        data: {'ids':id.toString()},
			        success: function(data) {
 						grid.trigger("reloadGrid");
			        }
			    });
			    }else{
			    	ajaxframework.createDialog("操作提示！","请选择要删除的数据！",{});
			    }
	});
	$( "#view" ).click(function(){
		
		var id; 
	id = grid.jqGrid('getGridParam','selarrrow');
	$( "#divInDialog" ).dialog({
	 	 modal: true,
	 	 width:800,
		open: function(event, ui) {
  			$('#divInDialog').load('${request.getContextPath()}/forecastIssue/'+id+'/toView', function() {
 		 	 });
	  },	   
    close: function (event, ui) {  
       grid.trigger("reloadGrid");
    }  
	});
	});
	$( "#refresh" ).click(function(){
		grid.trigger('reloadGrid');
	});
	 $("#layout button,.button,#sampleButton").button();
	 
var p= $('<p class="bg-success">正在计算预测信息...</p>');
$("#layoutinfo").append(p);
 		
 		
});
function showCount(id){
	window.location.href='${request.getContextPath()}/forecast/toList?issueid='+id;
}
Date.prototype.Format = function(fmt) 
{ //author: meizz 
var o = { 
 "M+" : this.getMonth()+1,                 //月份 
 "d+" : this.getDate(),                    //日 
 "h+" : this.getHours(),                   //小时 
 "m+" : this.getMinutes(),                 //分 
 "s+" : this.getSeconds(),                 //秒 
 "q+" : Math.floor((this.getMonth()+3)/3), //季度 
 "S"  : this.getMilliseconds()             //毫秒 
}; 
if(/(y+)/.test(fmt)) 
 fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
for(var k in o) 
 if(new RegExp("("+ k +")").test(fmt)) 
fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length))); 
return fmt; 
} 
</script>
<div id="divInDialog" style="display:none"></div>
</div>
 <script src="http://cdn.sockjs.org/sockjs-0.3.min.js"></script>

    <script type="text/javascript">
        var ws = null;
       $(function(){
       	connect();
       });
      
        function connect() {
         	var url = '/cloudcode/sockjs/websocket';
            if (!url) {
                alert('Select whether to use W3C WebSocket or SockJS');
                return;
            }
            //ws = (url.indexOf('sockjs') != -1) ?new SockJS(url, undefined, {protocols_whitelist: transports}) : new WebSocket(url);
            if ('WebSocket' in window) {
                ws= new WebSocket("ws://${ip}:${port}/${request.getContextPath()}/websck?type=fissue");
            }else {
                ws = new SockJS("http://${ip}:${port}/${request.getContextPath()}/sockjs/websck?type=fissue");
            }
            //websocket = new SockJS("http://localhost:8080/cloudcode/sockjs/websck");
            ws.onopen = function () {
                //alert('open');
                //setConnected(true);
                //log('Info: connection opened.');
            };
            ws.onmessage = function (event) {
                alert( event.data);
                //log('Received: ' + event.data);
            };
            ws.onclose = function (event) {
                //setConnected(false);
                //log('Info: connection closed.');
               // log(event);
            };
        }
          </script>
</body>
</html>