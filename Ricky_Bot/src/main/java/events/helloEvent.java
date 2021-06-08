package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class helloEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String messageSent = event.getMessage().getContentRaw();
        String name = Objects.requireNonNull(event.getMember()).getUser().getName();

        if (messageSent.equalsIgnoreCase("hi")){
            if (!event.getMessage().getMember().getUser().isBot()){
                event.getChannel().sendMessage(":yum: Hi " + name+". How are you today?").queue();
            }
        }
        if (messageSent.equalsIgnoreCase("!hello")){
            event.getChannel().sendMessage(">>> **:robot: Hello, welcome to Clan [TJLin], my name is Conqueror.** :robot:\n\n" +
                    ":ghost: `My version is 0.3.`  **And, I am still being developed.** :ghost:\n\n" +
                    ":100: Welcome you all suggestions! Thank you! :100:\n" +
                    ":100: Or you could text my admin @Ricky_GuGuBird  :100:").queue();
        }
    }
}
