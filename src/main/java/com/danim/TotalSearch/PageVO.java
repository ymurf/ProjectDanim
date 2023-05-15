package com.danim.TotalSearch;

public class PageVO {
	private int startPage;	//첫 페이지 번호
	private int endPage;	//마지막 페이지 번호(페이지 가장 끝이 아닌 10, 20, 30 등의 끝번호)
	private boolean next;	//다음 버튼 활성화
	private boolean prev;	//이전 버튼 활성화
	
	private int total;		//총 게시글 수
	private int pageNum;	//조회하는 페이지번호(cri애도 존재)
	private int amount;		//보여질 데이터 개수
	
	private Criteria cri;

	public PageVO(int total, int pageNum, int amount, Criteria cri) {
		this.total = total;
//		this.pageNum = cri.getPageNum();
//		this.amount = cri.getAmount();
		this.cri = cri;
		
		this.endPage = (int)Math.ceil(this.pageNum / 10.0) * 10;
		/*
		 pageNum이 5번 -> 끝 페이지번호는 10, pageNum이 11번 -> 끝 페이지번호는 20
		 => (int)Math.ceil(pageNum / 보여질 페이지 수) * 보여질 페이지 수
		 */
		
		
	}
	
	
}
