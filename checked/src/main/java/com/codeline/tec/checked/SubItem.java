package com.codeline.tec.checked;

import java.util.ArrayList;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SubItem {
	
	private String des;
	private boolean checked;
	private ArrayList subsubitens;
	
	public SubItem(String desc) {
		this.des = desc;
		this.checked = false;
	}
	
	public String getDes() {
		return des;
	}
	
	public void setDes(String des) {
		this.des = des;
	}
	
	public ArrayList getSubsubitens() {
		return subsubitens;
	}
	
	public void setSubsubitens(ArrayList subsubitens) {
		this.subsubitens = subsubitens;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
}
