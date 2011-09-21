package org.zonedabone.ihateexp;

import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.plugin.java.JavaPlugin;

public class IHateExp extends JavaPlugin {

	@Override
	public void onDisable() {
		System.out.println("IHateExp disabled!");

	}

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvent(Event.Type.ENTITY_DEATH, new EntityListener(){
			@Override
			public void onEntityDeath(EntityDeathEvent e){
				e.setDroppedExp(0);
			}
		}, Event.Priority.Normal, this);
		System.out.println("IHateExp enabled!");

	}

}
