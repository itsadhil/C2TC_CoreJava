package entity.classassignment2;

public class ItemDetails {
	private int itemid;
	private String itemName;
	private String itemStore;
	private String itemLocation;
	
	public String getItemLocation() {
		return itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemStore() {
		return itemStore;
	}
	public void setItemStore(String itemStore) {
		this.itemStore = itemStore;
	}
	@Override
	public String toString() {
		return "ItemDetails [itemid=" + itemid + ", itemName=" + itemName + ", itemStore=" + itemStore
				+ ", itemLocation=" + itemLocation + "]";
	}
	

}
