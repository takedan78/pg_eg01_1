package count_up;


public class Main {

	public static void main(String[] args) {

		//数字出力メソッド実行
		 Countnumber();
	}
	//1～100までの数字出力メソッド
	public static void Countnumber() {
		int left = 3;
		int right =4;
		int product = left*right;

		for (int i=1; i<=100; i++){

			if(i%product==0){
				System.out.print("◆ ");
			}else if(i%left==0){
				System.out.print("△ ");
			}else if(i%right==0){
				System.out.print("□ ");
			}else
				System.out.print(i+" ");
		}

	}//Countnumber()

}//class
