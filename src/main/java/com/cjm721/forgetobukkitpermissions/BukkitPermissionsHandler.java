package com.cjm721.forgetobukkitpermissions;

import com.mojang.authlib.GameProfile;
import net.minecraftforge.server.permission.DefaultPermissionLevel;
import net.minecraftforge.server.permission.IPermissionHandler;
import net.minecraftforge.server.permission.context.IContext;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.*;

public class BukkitPermissionsHandler implements IPermissionHandler {

  private final Map<String, String> registeredNodes = new HashMap<>();

  @Override
  public void registerNode(String node, DefaultPermissionLevel level, String desc) {
    registeredNodes.put(node, desc);
  }

  @Override
  public Collection<String> getRegisteredNodes() {
    return registeredNodes.keySet();
  }

  @Override
  public boolean hasPermission(GameProfile profile, String node, @Nullable IContext context) {
    Player player = Bukkit.getServer().getPlayer(profile.getId());

    return player != null && player.hasPermission(node);
  }

  @Override
  public String getNodeDescription(String node) {
    return registeredNodes.getOrDefault(node, "No Description Set");
  }
}
