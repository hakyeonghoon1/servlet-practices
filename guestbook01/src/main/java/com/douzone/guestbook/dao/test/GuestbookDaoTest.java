package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		//insert();
		findList();
		//deletTest();

	}

	private static void deletTest() {
		GuestbookVo vo =new GuestbookVo();
		vo.setNo(4L);
		vo.setPassword("1234");
		new GuestbookDao().delete(vo);
		
	}

	private static void findList() {
		GuestbookDao dao = new GuestbookDao();
		
		List<GuestbookVo> list = dao.findList();
		
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
		
	}

	private static void insert() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("하경훈");
		vo.setPassword("1234");
		vo.setMessage("안녕하세요11111");
		new GuestbookDao().insert(vo);
		
	}

}
