package me.badbones69.blockparticles.multisupport;

import me.badbones69.blockparticles.api.BlockParticles;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class Events_v1_11_R1_Down implements Listener {
	
	private BlockParticles bp = BlockParticles.getInstance();
	
	@EventHandler
	public void onItemPickUp(PlayerPickupItemEvent e) {
		if(bp.getFountainItem().contains(e.getItem())) {
			e.setCancelled(true);
		}
	}
	
}