package com.cjm721.forgetobukkitpermissions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.server.permission.PermissionAPI;
import org.apache.logging.log4j.Logger;

@Mod(modid = ForgeToBukkitPermissions.MODID, name = ForgeToBukkitPermissions.NAME, version = ForgeToBukkitPermissions.VERSION, serverSideOnly = true, acceptableRemoteVersions = "*")
public class ForgeToBukkitPermissions
{
  static final String MODID = "forgetobukkitpermissions";
  static final String NAME = "Forge To Bukkit Permissions";
  static final String VERSION = "1.0";

  private static Logger logger;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    logger = event.getModLog();
    PermissionAPI.setPermissionHandler(new BukkitPermissionsHandler());
    logger.info("Registered Forge API Permission Handler");
  }
}
