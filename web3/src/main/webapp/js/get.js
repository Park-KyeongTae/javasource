/**
 *  목록으로 클릭 시 : list.jsp
 *  수정 클릭 시 : form 안에 no값 가져오기
 *                modify.jsp 이동
 *                modify.jsp?no = 가져온 값
 * 
 *  삭제 클릭 시 : form 안에 no값 가져오기
 * 				  remove.jsp?no = 가져온 값
 */
//form 안에 hidden 사용 시
//const no = document.querySelector("#no").value;

 document.querySelector(".btn-primary").addEventListener("click",()=>{
	  location.href="listPro.jsp";
 })
 
  document.querySelector(".btn-success").addEventListener("click",()=>{
	 location.href="modifyPro.jsp?no="+no;
 })
 
  document.querySelector(".btn-danger").addEventListener("click",()=>{
	 location.href="removePro.jsp?no="+no;
 })
 