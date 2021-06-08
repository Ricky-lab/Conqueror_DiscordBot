package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class tankCommand extends ListenerAdapter {
    public static final String MODEL = "https://tanks.gg/tank/";


    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        StringBuffer tank_name = new StringBuffer();
        String[] messages = e.getMessage().getContentRaw().split(" ");

        if (messages[0].equalsIgnoreCase("!tank")) {
            if (messages.length == 1) {
                e.getChannel().sendMessage(">>> :robot:  Great! Are you going to get the info of a tank?\n" +
                        ":face_with_monocle:   Please input [!tank] + [tank_name]").queue();
            }else {
                for (int i = 1; i < messages.length; i++) {
                    tank_name.append(messages[i]);
                    if (i != messages.length -1){
                        tank_name.append("-");
                    }
                }
                String modelOfThank = MODEL + tank_name +"/model?vm=live";
                e.getChannel().sendMessage(">>> :face_with_monocle: You are searching tank" + tank_name +".\n"+
                                                  "Here is the info of tank: " + tank_name +"\n" +
                                                   modelOfThank ).queue();
            }

        }
    }
}
