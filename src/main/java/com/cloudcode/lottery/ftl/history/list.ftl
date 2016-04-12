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
        <button id="openwindow" class="ui-button-success">添加</button>
        <button id="edit" class="ui-button-primary">编辑</button>
        <button id="view" class="ui-button-warning">查看</button>
        <button id="delete" class="ui-button-danger">删除</button>
        <button id="refresh" class="ui-button-info">刷新</button>
</section></div></div>
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
<script type="text/javascript">
var grid = null;
function formatterV(num,rowObject){
	var value='';
	if(num==rowObject.a){
		value= rowObject.a;
	}else if(num==rowObject.b){
		value= rowObject.b;
	}else if(num==rowObject.c){
		value= rowObject.c;
	}else if(num==rowObject.d){
		value= rowObject.d;
	}else if(num==rowObject.e){
		value= rowObject.e;
	}else if(num==rowObject.f){
		value= rowObject.f;
	}else if(num==rowObject.g){
		value= rowObject.g;
	}
	if(value){
		return '<font style="color:red;">'+value+'</font>';
	}
	return "";
}
function addCellAttr1(rowId, val, rawObject, cm, rdata) {
    return "style='background-color:LavenderBlush;color:red'";
}
function addCellAttr2(rowId, val, rawObject, cm, rdata) {
    return "style='background-color:AliceBlue;color:red'";
}
function addCellAttr3(rowId, val, rawObject, cm, rdata) {
    return "style='background-color:OldLace;color:red'";
}
$(function(){
    if ($.fn.jqGrid){
       grid =  $("#jqGrid01").jqGrid({
           url:"${request.getContextPath()}/historyLottery/query",
            datatype: "json",
            height: 250,
            rowNum: 10,
            rowList: [10,20,30],
            colNames:['Id', '期号', '1','2','3','4','5','6','7','8','9','10','11','12','13','14'
            , '15', '16', '17', '18', '19','20','21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36'
           ,'总和','距离','奇偶','重号','横纵'
            ,'a','b','c','d','e','f','g'],
            colModel:[
                {name:'id',index:'id', width:30, hidden:true},
                {name:'issue',  width:30},
                {name:'1',index:'exchange', width:10,
                    cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(1,rowObject);
                }},
                {name:'2',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(2,rowObject);
                }},
                {name:'3',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(3,rowObject);
                }},
                {name:'4',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(4,rowObject);
                }},
                {name:'5',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(5,rowObject);
                }},
                {name:'6',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(6,rowObject);
                }},
                {name:'7',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(7,rowObject);
                }},
                {name:'8',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(8,rowObject);
                }},
                {name:'9',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(9,rowObject);
                }},
                {name:'10',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(10,rowObject);
                }},
                {name:'11',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(11,rowObject);
                }},
                {name:'12',index:'exchange', width:10, cellattr: addCellAttr1,formatter:function(cellvalue, options, rowObject){
                	return formatterV(12,rowObject);
                }},
                {name:'13',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(13,rowObject);
                }},
                {name:'14',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(14,rowObject);
                }},
                {name:'15',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(15,rowObject);
                }},
                {name:'16',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(16,rowObject);
                }},
                {name:'17',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(17,rowObject);
                }},
                {name:'18',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(18,rowObject);
                }},
                {name:'19',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(19,rowObject);
                }},
                 {name:'20',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(20,rowObject);
                }},
                 {name:'21',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(21,rowObject);
                }},
                 {name:'22',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(22,rowObject);
                }},
                 {name:'23',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(23,rowObject);
                }},
                 {name:'24',index:'exchange', width:10, cellattr: addCellAttr2,formatter:function(cellvalue, options, rowObject){
                	return formatterV(24,rowObject);
                }},
                 {name:'25',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(25,rowObject);
                }},
                 {name:'26',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(26,rowObject);
                }},
                 {name:'27',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(27,rowObject);
                }},
                 {name:'28',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(28,rowObject);
                }},
                 {name:'29',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(29,rowObject);
                }},
                 {name:'30',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(30,rowObject);
                }},
                 {name:'31',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(31,rowObject);
                }},
                 {name:'32',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(32,rowObject);
                }},
                 {name:'33',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(33,rowObject);
                }},
                 {name:'34',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(34,rowObject);
                }},
                 {name:'35',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(35,rowObject);
                }},
                 {name:'36',index:'exchange', width:10, cellattr: addCellAttr3,formatter:function(cellvalue, options, rowObject){
                	return formatterV(36,rowObject);
                }},
                 {name:'total',  width:20 },
                 {name:'length',  width:20 },
                 {name:'oddeven',  width:20 },
                {name:'repeat',  width:20 },
                {name:'horVer',  width:20 },
                {name:'a',index:'exchange', width:0, hidden:true,formatter:function(cellvalue, options, rowObject){
                	return cellvalue;
                }},
                {name:'b',index:'groupType', width:0, hidden:true},
                {name:'c',index:'code', width:0, hidden:true},
                {name:'d',index:'code', width:0, hidden:true},
                {name:'e',index:'code', width:0, hidden:true},
                {name:'f',index:'code', width:0, hidden:true},
                {name:'g',index:'code', width:0, hidden:true}
                
            ],
            autowidth: true,
            height: "auto",            
            pager: "#jqGridPager01",
            viewrecords: true,
            caption: "Sample jqGrid Table",
            hidegrid:false,
            multiselect: true,
            altRows: true
        });
        jQuery("#jqGrid01").jqGrid('navGrid','#pager2',{edit:true,add:false,del:false});
        jQuery("#jqGrid01").jqGrid('setGroupHeaders', {
  useColSpanStyle: false, 
  groupHeaders:[
	{startColumnName: '1', numberOfColumns: 12, titleText: '<em>红球一区</em>'},
	{startColumnName: '13', numberOfColumns: 12, titleText: '<em>红球二区</em>'},
	{startColumnName: '25', numberOfColumns: 12, titleText: '<em>红球三区</em>'}
  ]	
});
    }

$( "#openwindow" ).click(function(){
	$( "#divInDialog" ).dialog({
	 	 modal: true,
	 	 width:800,
		open: function(event, ui) {
  			 $('#divInDialog').load('${request.getContextPath()}/futurestypes/create', function() {
   				
 		 	 });
	 	 },	   
	    close: function (event, ui) {  
	       grid.trigger("reloadGrid");
	    }  
	});
});
$( "#edit" ).click(function(){
	var id; 
	id = grid.jqGrid('getGridParam','selarrrow');
	$( "#divInDialog" ).dialog({
	 	 modal: true,
	 	 width:800,
		open: function(event, ui) {
  			$('#divInDialog').load('${request.getContextPath()}/futurestypes/'+id+'/update', function() {
 		 	 });
	  },	   
    close: function (event, ui) {  
       grid.trigger("reloadGrid");
    }  
	});
}); 
$( "#delete" ).click(function(){
var id;
	     id = grid.jqGrid('getGridParam','selrow');
	     if(id.toString() != null && id.toString() != ""){
		    $.ajax({
			        url: '${request.getContextPath()}/futurestypes/deleteAll',
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
  			$('#divInDialog').load('${request.getContextPath()}/historyLottery/'+id+'/toView', function() {
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
}); 
</script>
<div id="divInDialog" style="display:none"></div>
</div>
</body>
</html>