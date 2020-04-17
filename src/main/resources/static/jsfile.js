function sendJsonData() {
	console.log("function called");
	$.ajax({
		type: "POST",
		url : "/addemployee",
		data : {
			"data": "spring data"
		},
		dataType : "json",
		
		success : function(serverResponse) {
			alert("data");
		}
	});
	
	//	var employee = new Object();
//	var form = $('form[name="addForm"]');
//	employee.name = form.find('#empname').val();
//	employee.mobile = form.find('#empmobile').val();
//	$.ajax({
//		type : "POST",
//		url : "/addemployee",
//		data : {jsonData : JSON.stringify(employee)},
//		dataType : "json",
//		
//		success : function(data) {
//			alert(data);
//		}
//	});
}


$(function(){
	setInterval(function(){
		var imageplaceholder = $("#imgplaceholder");
		var source = imageplaceholder.attr("src");
		
		if(source == "./header.jpg") {
			source = "./employee.jpg";
		} else {
			source = "./header.jpg";
		}
		imageplaceholder.fadeIn("slow");
		imageplaceholder.attr("src",source);
		
		
	}, 3000);
});