package io.github.maple8192.monsterspawncontroller.listener

import org.bukkit.entity.*
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.CreatureSpawnEvent

class MobSpawnListener : Listener {
    @EventHandler
    fun onCreatureSpawn(event: CreatureSpawnEvent) {
        if (event.entity is Monster
            || event.entity is Slime
            || event.entityType == EntityType.GHAST
            || event.entityType == EntityType.SHULKER
            || event.entityType == EntityType.PHANTOM) {
            if (event.spawnReason == CreatureSpawnEvent.SpawnReason.NATURAL) {
                event.isCancelled = true
            }
        }
    }
}