package org.zonedabone.ihateexp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class IHateExp extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e){
		e.setDroppedExp(0);
	}

}
