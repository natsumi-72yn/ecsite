package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;


public class HistoryDto {
	
    private int id;
    private int userid;
    private int goodsid;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
	
	public HistoryDto() {}
	
	public HistoryDto(TblPurchase entity) {
		this.id = entity.getId();
		this.userid = entity.getUserId();
		this.goodsid = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getTotal();
		
		
		
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.createdAt = f.format(d);
		
				
	}

}
