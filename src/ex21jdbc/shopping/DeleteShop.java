package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class DeleteShop extends IConnectImpl{

	public DeleteShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?,?)}");
			
			csmt.setString(1, scanValue("상품일련번호"));			
			csmt.registerOutParameter(2, Types.NUMERIC);
			
			csmt.execute();
			
			int affected = csmt.getInt(2);
			if(affected==0){				
				System.out.println("해당상품이 없습니다.");	
			}
			else{
				System.out.println(affected +"개의 제품이 삭제되었습니다.");	
			}					
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}		
	}
	
	public static void main(String[] args) {
		 new DeleteShop().execute();
	}

}
