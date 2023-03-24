package inheritance;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		// 부모 클래스 객체 생성
		CellPhone cellPhone = new CellPhone();
		

		// 자식 클래스 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		dmbCellPhone.model = "자바폰";
		dmbCellPhone.color = "black";
		dmbCellPhone.channel = 7;
		
		dmbCellPhone.powerOn();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(8);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요");
		dmbCellPhone.hangUp();
	}
}














