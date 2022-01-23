package io.github.maple8192.monsterspawncontroller

import io.github.maple8192.monsterspawncontroller.listener.MobSpawnListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class MonsterSpawnController : JavaPlugin() {
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(MobSpawnListener(), this)
    }
}