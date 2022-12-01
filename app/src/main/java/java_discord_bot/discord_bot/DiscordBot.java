package java_discord_bot.discord_bot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;


public class DiscordBot {
    private DiscordApi api;


    public DiscordBot(String discordBotToken) {
        this.api = new DiscordApiBuilder()
            .setToken(discordBotToken)     
            .addIntents(Intent.MESSAGE_CONTENT)
            .addIntents(Intent.GUILD_EMOJIS)
            .login()
            .join();
    }

    private void eventListener() {
        // Add a listener which answers with "Pong!" if someone writes "!ping"
        this.api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("Who is Adrian")) {
                event.getChannel().sendMessage("Adrian is :Chadrian: ");
            }
        });
    }

    public void run() {
        eventListener();
    }
}
