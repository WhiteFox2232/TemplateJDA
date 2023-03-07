package fr.whitefox.interactions;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Modals extends ListenerAdapter {

    @Override
    public void onModalInteraction(ModalInteractionEvent event) {
        switch (event.getModalId()) {
            case "example" -> {
                // Do
            }

            case "example2" -> {
                // Do
            }
        }
    }
}
