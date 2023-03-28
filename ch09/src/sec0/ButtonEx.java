package sec0;

public class ButtonEx {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");				
			}
		}
		btnOk.setClickListener(new OkListener());
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");				
			}			
		}
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click();
	}
}
