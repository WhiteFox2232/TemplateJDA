package fr.whitefox.api.commands;

import fr.whitefox.Main;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class CommandDeployer {

    private static final JDA jda = Main.getJDAInstance();

    public static void deploySlashCommands() {

        jda.updateCommands().addCommands(
                Commands.slash("ping", "Pong!"),
                Commands.slash("bot", "Bot infos.")
        ).queue();
    }
}
