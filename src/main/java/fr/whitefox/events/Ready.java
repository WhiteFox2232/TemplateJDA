package fr.whitefox.events;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class Ready implements EventListener {

    @Override
    public void onEvent(@NotNull GenericEvent event) {
        if (!(event instanceof ReadyEvent)) return;
        System.out.println("• Bot en ligne sous l'identité " + event.getJDA().getSelfUser().getAsTag() + " (" + event.getJDA().getSelfUser().getId() + ").");
    }

}