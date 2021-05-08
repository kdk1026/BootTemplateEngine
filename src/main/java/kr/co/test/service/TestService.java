package kr.co.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.test.model.Member;

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
@Service
public class TestService {

	public List<Member> getList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		
		member = new Member(1, "홍길동");
		list.add(member);
		
		member = new Member(2, "임꺽정");
		list.add(member);
		
		return list;
	}
	
}
