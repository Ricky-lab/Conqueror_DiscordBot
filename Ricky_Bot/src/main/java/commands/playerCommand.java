package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class playerCommand extends ListenerAdapter {
    //public static final String MODEL = "https://tanks.gg/tank/";
    public static final String EFFICIENCY = "http://wotinfo.net/en/efficiency?server=US&playername=";


    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String server = "US"; //default value
        String ID; //player ID
        String[] messages = e.getMessage().getContentRaw().split(" ");

        if (messages[0].equalsIgnoreCase("!player")) {//Command prefix
            if (messages.length == 1) {
                // Introduction
                e.getChannel().sendMessage("> :robot:  Hey! :grinning: \n > "+ e.getMember().getNickname().toUpperCase() + ", are you going to check your efficiency?\n\n" +
                        "> :face_with_monocle:   Please input:  **[!player]** + **[me]** \n" +
                        ">                *(if your __DC Id__ is the same as your __WOT ID__)*\n " +
                        "> :face_with_monocle:   Or input:  **[!player]** + **[Your WOT ID]**").queue();
            }else {
                if (messages[1].equalsIgnoreCase("me")){
                    String link = EFFICIENCY + e.getMember().getNickname().toUpperCase();
                    e.getChannel().sendMessage("> :sunglasses: Here is the efficiency of player: **" + e.getMember().getNickname().toUpperCase()+"**\n\n> " +
                            link).queue();
                }else {
                    String link = EFFICIENCY + messages[1];
                    e.getChannel().sendMessage("> :sunglasses: Here is the efficiency of player: **" + messages[1].toUpperCase() +"**\n\n> " +
                    link).queue();
                }

            }

        }
    }
}
