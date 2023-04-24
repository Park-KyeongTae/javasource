/**
 *  newaddr, newmobile 둘 중에 하나는 값이 있어야 함
 * 
 *  둘다 빈칸일때 submit 막고, 메세지 띄위기
 */
document.querySelector(".btn-primary").addEventListener("click",()=>{
	  location.href="listPro.jsp";
 })
const form = document.querySelector("form"); // 왜 폼으로 설정 => 어짜피 form찾아서 submit을 해야되서
form.addEventListener("submit",(e)=>{
	e.preventDefault(); // 조건을 넣고 사용해야되지 않을까? => submit 일단 막고 밑에 조건문 실행하여 다시 form.submit() 실행
const addr = document.querySelector("#newaddr")
const mobile = document.querySelector("#newmobile")

if(addr.value.length > 0||mobile.value.length >0){
	form.submit();
}else{
	alert("변경된 값을 입력하거나 수정을 취소하려면 목록으로 버튼 클릭")
}	
})







 /*const naddr = document.querySelector("#newaddr")
 const nmobile = document.querySelector("#newmobile")
 
 document.querySelector(".btn-success").addEventListener("click",(e)=>{
	 if(naddr == null && nmobile == null){
		 e.preventDefault
		 alert("입력해주세요");
		 return
	 }
	 else if(naddr != null || nmobile == null){
		 naddr.value;
	 }else if(naddr == null || nmobile != null){
		 nmobile.value;
	 }
	 
	 document.querySelector("form").submit();
	 
 })*/