package com.shop.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.model.AttachImageVO;
import com.shop.model.BookVO;
import com.shop.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AuthorMapperTests {

	

	@Autowired
	private AdminService service;
	
	
	/* 상품 등록 & 상품 이미지 등록 테스트 */
	@Test
	public void bookEnrollTEsts() {

		BookVO book = new BookVO();
		// 상품 정보
		book.setBookName("mapper 테스트");
		book.setAuthorId(18);
		book.setPubleYear("2021-03-18");
		book.setPublisher("출판사");
		book.setCateCode("2020012");
		book.setBookPrice(20000);
		book.setBookStock(300);
		book.setBookDiscount(0.23);
		book.setBookIntro("책 소개 ");
		book.setBookContents("책 목차 ");

		// 이미지 정보
		List<AttachImageVO> imageList = new ArrayList<AttachImageVO>(); 
		
		AttachImageVO image1 = new AttachImageVO();
		AttachImageVO image2 = new AttachImageVO();
		
		image1.setFileName("test Image 123");
		image1.setUploadPath("test image 123");
		image1.setUuid("test111123");
		
		image2.setFileName("test Image 223");
		image2.setUploadPath("test image 223");
		image2.setUuid("test222223");
		
		imageList.add(image1);
		imageList.add(image2);
		
		
		book.setImageList(imageList);
		
		// bookEnroll() 메서드 호출
		service.bookEnroll(book);
		
		System.out.println("등록된 VO : " + book);
		
		
	}
	/*
	 * 작가 등록 테스트
	 * 
	 * @Test public void authorEnroll() throws Exception{
	 * 
	 * AuthorVO author = new AuthorVO();
	 * 
	 * author.setNationId("01"); author.setAuthorName("테스트");
	 * author.setAuthorIntro("테스트 소개");
	 * 
	 * mapper.authorEnroll(author);
	 * 
	 * }
	 */

	/* 작가 목록 테스트 */
	/*
	 * @Test public void authorGetListTest() throws Exception {
	 * 
	 * Criteria cri = new Criteria(); // cri.setKeyword("일런");
	 * 
	 * List<AuthorVO> list = mapper.authorGetList(cri);
	 * 
	 * 
	 * for (int i = 0; i < list.size(); i++) { System.out.println("list" + i +
	 * ".........." + list.get(i)); }
	 * 
	 * }
	 */
	
	/*
	 * @Test public void authorGetTotalTest() throws Exception {
	 * 
	 * Criteria cri = new Criteria(); cri.setKeyword("유ㅜ재현");
	 * 
	 * int total = mapper.authorGetTotal(cri);
	 * 
	 * System.out.println("total....." + total); }
	 */
	
	/* 작가 상세 페이지 */

	

	
	
	

}
