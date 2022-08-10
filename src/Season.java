/**
 * 
 * @author <font size='7' color='green'>yeon</font>
 * @version <b>1.0</b>
 * @since <i>2022-08-01</i>
 *
 */
public enum Season {
	SPRING(100), SUMMER(500), FALL(1000), WINTER(10000);	//java의 enum에서 값을 지정하려면 괄호안에 값 넣어주고 생성자 필요
	private int value;
	Season(int value){	//Constructor(public x)
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}


