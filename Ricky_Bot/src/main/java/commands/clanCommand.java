package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class clanCommand extends ListenerAdapter {
    public static final String CLAN = "http://wotinfo.net/en/clans?server=US&name=";


    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String server = "US"; //default value
        String ID; //player ID
        String[] messages = e.getMessage().getContentRaw().split(" ");

        if (messages[0].equalsIgnoreCase("!clan")) {//Command prefix
            if (messages.length == 1) {
                // Introduction
                e.getChannel().sendMessage("> :robot:  Hey! :grinning: \n > "+ e.getAuthor().getName() + ", are you going to find a clan?\n\n" +
                        "> :military_helmet:   Please input:  **[!clan]** + **[clan_name]** \n").queue();
            }else {

                String clanName = messages[1];
                String link = CLAN + clanName;
                e.getChannel().sendMessage("> :military_helmet:  Here is the info of clan: **" + messages[1]+"**\n\n> " +
                        link).queue();

            }

        }
    }
}
