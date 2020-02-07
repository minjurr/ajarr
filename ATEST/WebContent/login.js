

$(document).ready(function() {

      $('#btnLogin').click(function() {
    	
    	 var action = $('#frmLogin').attr("action");
    	
         var user_id = $('#id').val();                 	
         var user_pw = $('#pw').val();

        $.ajax({

                  type: "post",
                 // type : 통신타입을 설정 POST 또는 GET을 선택

                  url: ".//Auser",
                  // url : 요청할 URL을 기입
                 
                  data: {"id":user_id, "pw":user_pw},
                  //data : 서버에 요청시 보낼 파라미터를 기입
                  dataType: "text",
                  
                  success: function(data) {
                 
                	  $('body').html(data);
                	
                  }
                	  

                
  
                  
  //                 type : 통신타입을 설정 POST 또는 GET을 선택

//                 	 url : 요청할 URL을 기입
//
//                 	 data : 서버에 요청시 보낼 파라미터를 기입

//                   dataType : 응답받을 데이터의 타입을 선택(XML, TEXT, HTML, JSON 등)

 //                 success : 요청 및 응답에 성공하였을 때에 행위를 기입

  //                error : 요청 또는 응답에 실패하였을 때에 행위를 기입 생략가능 



        });

   });

    });





