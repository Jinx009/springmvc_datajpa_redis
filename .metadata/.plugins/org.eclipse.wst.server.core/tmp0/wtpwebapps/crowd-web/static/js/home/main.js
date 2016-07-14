/**
 * 更变导航状态
 * @param id
 * @param _id
 */
function changeClass(id,_id){
	$('.nav-list li').each(function(){
		$(this).removeClass('active');
	})
	$('#'+id).addClass('active');
	$('#'+_id).addClass('active');
}