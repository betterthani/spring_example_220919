<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
		<%-- AJAX를 사용할 때는 jquery가 원본이어야 한다. --%>
		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"	crossorigin="anonymous"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원가입</h1>
		
		<form action="/lesson06/ex01/add_user" method="post">
			<div class="form-group">
				<label for="name">이름</label>
				<input type="text" id="name" name="name" class="form-control col-3" placeholder="이름을 입력하세요.">
			</div>
			
			<div class="form-group">
				<label for="yyyymmdd">생년월일</label>
				<input type="text" id="yyyymmdd" name="yyyymmdd" class="form-control col-3" placeholder="예) 19881120">
			</div>
			
			<div class="form-group">
				<label for="email">이메일</label>
				<input type="text" id="email" name="email" class="form-control col-3" placeholder="이메일을 입력하세요">
			</div>
			
			<div class="form-group">
				<label for="introduce">자기소개</label>
				<textarea id="introduce" name="introduce" class="form-control col-5" rows=6></textarea>
			</div>
			
			<!-- form태그를 위한 submit버튼 -->
			<!-- <input type="submit" class="btn btn-success" value="회원가입"> -->
			
			<%-- AJAX를 위한 버튼 --%>
			<input type="button" class="btn btn-success" value="회원가입" id="join">
			<!-- <button type="button"></button> 버튼 태그 사용시 type꼭 button으로 명시해줘야함.-->
		</form>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function(){
			// 1) jquery의 submit 기능 이용하기
			
			//            이벤트명            e(이벤트객체) = event
			/* $('form').on('submit', function(e){
				//alert("서브밋");
				//e.preventDefault(); // 태그의 기본 수행을 막아준다.(여기선 서브밋되는 것을 막는것)
				
				// validation
				let name = $('#name').val().trim();
				if(name.length == ''){
					alert("이름을 입력하세요.");
					return false; // return false 써야만 서브밋되지 않는다.(submit의 경우만)
				}
				
				let yyyymmdd = $('#yyyymmdd').val().trim();
				if(yyyymmdd.length < 1){
					alert("생년월일을 입력하세요");
					return false;
				}
				
				// 여기까지 도달하면 submit
				alert("서브밋");
			}); */
			
			// 2) jquery의 AJAX 통신 이용하기
			$('#join').on('click',function(){
				// alert("aaaa");
				
				// validation
				let name = $('#name').val().trim();
				if(name.length == ''){
					alert("이름을 입력하세요.");
					return;
				}
				
				let yyyymmdd = $('#yyyymmdd').val().trim();
				if(yyyymmdd.length < 1){
					alert("생년월일을 입력하세요");
					return;
				}
				
				if(isNaN(yyyymmdd)) { // 모두 숫자가 아닌 경우 참
					alert("숫자만 입력해주세요");
					return;
				}
				
				let email = $('#email').val().trim();
				console.log(email); // 체크포인트
				
				let introduce = $('#introduce').val().trim();
				console.log(introduce); // 체크포인트
				
				// AJAX : request도 일어나고 response도 일어난다. -> 잘 구분해야함.
				$.ajax({
					// Request (요청 정보)
				//  key명(소문자) : ""
					type:"POST" // method부분
					, url:"/lesson06/ex01/add_user" //form태그상 action
					, data:{"name":name, "yyyymmdd":yyyymmdd, "email":email, "introduce":introduce} //"@RequestParam 파라미터명(value)":"let 변수"
					
					// Response postmapping return 이후 발생
					, success:function(data){
						alert(data);
						// 화면 이동
						location.href="/lesson06/ex01/after_add_user_view";
					}
					
					, complete:function(data){ // 생략 가능 (성공해도 뜨고, 실패해도 뜸)
						alert("완료");
					}
					
					, errer:function(e){
						alert("에러");
					}
					
				});
				
			});
			
		});
	</script>
</body>
</html>