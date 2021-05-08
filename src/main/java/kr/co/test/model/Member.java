package kr.co.test.model;

/**
 * <pre>
 * 개정이력
 * -----------------------------------
 * 2021. 5. 8. 김대광	최초작성
 * </pre>
 * 
 *
 * @author 김대광
 */
public class Member {

	private int id;
	private String name;
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
