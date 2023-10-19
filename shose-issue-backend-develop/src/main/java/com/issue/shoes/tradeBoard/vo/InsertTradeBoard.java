package com.issue.shoes.tradeBoard.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertTradeBoard {
	private String tradeId;
	private String tradeTitle;
	private String tradeContents;
	private int tradeLike;
	private String tradeStatus;
	private int tradePrice;
	private String tradeImage;
	private String goodsCategory;
	private String userId;
	private String tradeUpdateDate;
}
