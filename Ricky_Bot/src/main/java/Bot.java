import commands.clanCommand;
import commands.playerCommand;
import commands.tankCommand;
import events.helloEvent;
import events.helpEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Bot {
    public static void main(String[] args) throws LoginException {
        //  the token should be replaced to your personal discord bot token
        JDA jda = JDABuilder.createDefault("token").build();
        jda.addEventListener(new helloEvent());
        jda.addEventListener(new tankCommand());
        jda.addEventListener(new playerCommand());
        jda.addEventListener(new clanCommand());
        jda.addEventListener(new helpEvent());
    }
}
