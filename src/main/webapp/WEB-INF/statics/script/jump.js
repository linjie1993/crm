$(document).ready(function(){
	function jump(){
		var url=$("#url").attr("href");
		var time=setInterval (showTime, 1000);
		var second=5;
		function showTime()
		{ 
		if(second==0)
		{
		window.location.href=url;
		clearInterval(time);
		}
		$("#sub-text").html('<font>'+second+'s</font> 后将自动跳转到系统入口。');
		second--;
		}
	}
	
	jump();
});