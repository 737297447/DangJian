package com.lingdian.dangjian.view.tree;

import com.lingdian.dangjian.ui.bean.Zuzhichaxun;

public class Bean
{
	@TreeNodeId
	private int id;
	@TreeNodePid
	private int pId;
	@TreeNodeLabel
	private String label;

	private Zuzhichaxun zuzhichaxun;

	public Bean()
	{
	}

	public Bean(int id, int pId, String label,Zuzhichaxun zuzhichaxun)
	{
		this.id = id;
		this.pId = pId;
		this.label = label;
		this.zuzhichaxun = zuzhichaxun;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getpId()
	{
		return pId;
	}

	public void setpId(int pId)
	{
		this.pId = pId;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public Zuzhichaxun getZuzhichaxun() {
		return zuzhichaxun;
	}

	public void setZuzhichaxun(Zuzhichaxun zuzhichaxun) {
		this.zuzhichaxun = zuzhichaxun;
	}
}
