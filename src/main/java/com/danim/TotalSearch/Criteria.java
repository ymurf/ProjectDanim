package com.danim.TotalSearch;

public class Criteria {
	private int pageNum; //조회할 페이지 번호
	private int amount; //페이지당 출력할 게시글 개수
	
	//검색에 필요한 키워드
	private String keyword; //검색 키워드 
	private String searchType; //검색 유형
	private int searchDo; // 검색창의 도 id
	private int searchSi; // 검색창의 시 id
	
	//생성자
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}





	//getter()/setter()
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public int getSearchDo() {
		return searchDo;
	}

	public void setSearchDo(int searchDo) {
		this.searchDo = searchDo;
	}
	public int getSearchSi() {
		return searchSi;
	}
	public void setSearchSi(int searchSi) {
		this.searchSi = searchSi;
	}
}
