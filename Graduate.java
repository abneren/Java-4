import java.util.Scanner;
public class Graduate implements Student,Teacher{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	@Override
	public void setPay(double pay) {
	this.pay = pay * 12;
	System.out.println("����������Ϊ��" + this.pay + "Ԫ");
	}
	@Override
	public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("����������Ϊ��" + this.pay + "Ԫ");
		}
	@Override
	public void setFee(double fee) {
		this.fee = fee; 
		System.out.println("����ѧ��Ϊ��" + this.fee + "Ԫ");
		}
	@Override
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("����ѧ��Ϊ��" + this.fee);
		}
	public boolean Loan(){
		if ((this.pay - this.fee) <42000) {
			System.out.println("����������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
			return true;
			}
		System.out.println("����������" + this.pay + "Ԫ,��ȥѧ��" + this.fee +"Ԫ,��ȥ"+ 42000 + "Ԫ,��" + 0.03 + "����" + (this.pay - this.fee - 3500)*0.03 + "Ԫ");
		return false;
		}
	public static void main(String[] args) {
		Graduate graduate = new Graduate();
		graduate.name = "����";
		System.out.println("����:" + graduate.name);
		try {
		  Scanner input = new Scanner(System.in);
		   System.out.println("�����������¹��ʣ�");
		   double pay = input.nextDouble();
		   graduate.setPay(pay);
		   System.out.println("����������ѧ�ѣ�");
		   double fee = input.nextDouble();
		   graduate.setFee(fee);
		      input.close();
		  boolean flag = graduate.Loan();
		  if (flag) {
		   System.out.println("�������˰��");
		  }else {
		   System.out.println("����Ҫ��˰"+(pay*12 - fee - 3500)*0.03+("Ԫ"));
		  }
		}catch(Exception e){
			System.out.println("�������ݸ�ʽ����!�����봿���֡�");
		  	}		 
		}
}