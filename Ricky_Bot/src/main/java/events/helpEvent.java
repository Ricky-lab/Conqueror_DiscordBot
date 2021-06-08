package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class helpEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String messageSent = event.getMessage().getContentRaw();
        String name = Objects.requireNonNull(event.getMember()).getUser().getName();


        if (messageSent.equalsIgnoreCase("!wot help")){
            event.getChannel().sendMessage(">>> **:robot: Hello, I am Bot from Clan [TJLin], my name is Conqueror.** :robot:\n" +
                    ":ghost: `Commands Menu: ` :ghost:\n\n" +

                    ":one: **[!tank]** + **[tank name]**: \n" +
                    ":desktop:`     Show the armor of this target tank.`\n\n\n" +

                    ":two: **[!player]** + **[Id]** : \n" +
                    "`      Show the player's efficiency.`\n" +
                    " :white_check_mark: `!player ID` \n" +
                    "      **or**\n" +
                    " :white_check_mark: `!player me   (if your DC Id is the same as WOT Id)`\n\n\n" +

                    ":three: **[!clan]** + **[clan name]** : \n" +
                    ":military_helmet:      `Show the info of the target Clan.` \n\n\n" +

                    ":100: If you have other suggestions, plz anytime text my admin  :100:\n" +
                    "@Ricky_GuGuBird \n" +
                    ":yum: **Have fun and good luck** :yum:").queue();
        }
    }
}
