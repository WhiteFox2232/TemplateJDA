package fr.whitefox.api.commands;

import fr.whitefox.commands.BotCommand;
import fr.whitefox.commands.PingCommand;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler extends ListenerAdapter {

    private final Map<String, SlashCommand> commands = new HashMap<>();

    public CommandHandler() {
        commands.put("ping", new PingCommand());
        commands.put("bot", new BotCommand());
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        String commandName = event.getName();
        SlashCommand command = commands.get(commandName);
        if (command != null) {
            command.execute(event);
        } else {
            event.reply("Commande inconnue.").queue();
        }
    }
}