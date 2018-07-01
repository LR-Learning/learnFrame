
// 调用后台批量删除方法
function DeleteBatch(basePath){
	$("#mainForm").attr("action",basePath+"deleteBatchServlet" );
	$("#mainForm").submit();
}

// 修改当前页码， 调用后天重新查询
function changeCurrentPage(currentPage){
	$("#currentPage").val(currentPage);
	$("#mainForm").submit();
}