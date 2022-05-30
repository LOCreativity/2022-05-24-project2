abstract class Car {
	protected String name; // 자동차 이름
	protected int price; // 자동차 가격
	
	public void printInfo() {
		//자동차 정보 출력 메소드
		System.out.println("차 이름은 " + this.name + "이고 가격은 " + this.price + "원 입니다.");
	}
	abstract void printSignature();
}
