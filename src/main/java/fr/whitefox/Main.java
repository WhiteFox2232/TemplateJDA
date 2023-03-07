package fr.whitefox;

import fr.whitefox.api.commands.CommandDeployer;
import fr.whitefox.api.commands.CommandHandler;
import fr.whitefox.events.Ready;
import fr.whitefox.interactions.Buttons;
import fr.whitefox.interactions.Modals;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
    private static JDA jda;
    private static long uptime;

    public static JDA getJDAInstance() {
        return jda;
    }

    public static long getUptime() {
        return uptime;
    }

    public static void main(String[] args) {
        try {
            jda = createJDAInstance(args[0]);
            uptime = System.currentTimeMillis();
            CommandDeployer.deploySlashCommands();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("[ERROR] Vous devez mettre le token de votre bot Discord en argument !");
            System.out.println("Exemple : java -jar DiscordRankBot.jar VOTRE_TOKEN");
        }
    }

    private static JDA createJDAInstance(String token) {
        return JDABuilder.createDefault(token)
                .setActivity(Activity.playing("Hello Word!"))
                .addEventListeners(
                        new Ready(),
                        new Modals(),
                        new Buttons(),

                        new CommandHandler())
                .build();
    }
}