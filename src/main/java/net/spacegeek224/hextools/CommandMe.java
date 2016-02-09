package net.spacegeek224.hextools;

import org.bukkit.Bukkit;                                                                                                
import org.bukkit.ChatColor;                                                                                             
import org.bukkit.command.Command;                                                                                       
import org.bukkit.command.CommandExecutor;                                                                               
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import net.spacegeek224.hexlib.ColoredString;

public class CommandMe implements CommandExecutor {                                                                    
        @Override                                                                                                        
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {                       
                
                //Player player = (Player) sender;
                String name = "";
                if (sender instanceof ConsoleCommandSender) {
                        name = ChatColor.RED + "CONSOLE" + ChatColor.RESET + " ";
                } else if (sender instanceof Player) {
                        name = ChatColor.BLUE + ((Player) sender).getDisplayName() + ChatColor.RESET + " " ;
                }
                if (args.length == 0) {
	                
                } else if (args.length >= 1) {
                	StringBuilder buffer = new StringBuilder();
			for (int i = 0; i < args.length; i++) {
				buffer.append(' ').append(args[i]);
			}
			Bukkit.broadcastMessage(name + new ColoredString(buffer.toString()).res);
                }
                return true;                                                                                            
        }
        
}  
