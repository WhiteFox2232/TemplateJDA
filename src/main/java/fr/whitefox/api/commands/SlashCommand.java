package fr.whitefox.api.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public interface SlashCommand {
    void execute(SlashCommandInteractionEvent event);
}