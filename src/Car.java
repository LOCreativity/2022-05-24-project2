abstract class Car {
	protected String name; // �ڵ��� �̸�
	protected int price; // �ڵ��� ����
	
	public void printInfo() {
		//�ڵ��� ���� ��� �޼ҵ�
		System.out.println("�� �̸��� " + this.name + "�̰� ������ " + this.price + "�� �Դϴ�.");
	}
	abstract void printSignature();
}
