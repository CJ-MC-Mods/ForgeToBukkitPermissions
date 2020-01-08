package com.cjm721.forgetobukkitpermissions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.permission.PermissionAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value = ForgeToBukkitPermissions.MODID)
public class ForgeToBukkitPermissions
{
  static final String MODID = "forgetobukkitpermissions";

  private static Logger logger = LogManager.getLogger();

  public ForgeToBukkitPermissions()
  {
    PermissionAPI.setPermissionHandler(new BukkitPermissionsHandler());
    logger.info("Registered Forge API Permission Handler");
  }
}
