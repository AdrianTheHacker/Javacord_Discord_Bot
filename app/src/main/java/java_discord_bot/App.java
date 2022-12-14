/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_discord_bot;

import java_discord_bot.discord_bot.DiscordBot;
import java_discord_bot.stocks_data.StockAPILinkGenerator;


public class App {
    // public static Dotenv dotEnv = Dotenv.configure()
    //     .directory(".\\assets")
    //     .load();

    public static String startMessage() {
        return "Beep Beep Boop Boop"; 
    }

    // public static String getEnvironmentVariable(String environmentVariableName) {
    //     return dotEnv.get(environmentVariableName);
    // }

    public static void main(String[] args) {
        // DiscordBot discordBot = new DiscordBot(getEnvironmentVariable("DISCORD_BOT_TOKEN"));
        // discordBot.run();
        
        // System.out.println(getGreeting());

        StockAPILinkGenerator teslaStockLinkGenerator = new StockAPILinkGenerator("TSLA", "4oIGYYpMQ5qSGWzeOzzoV6mdmMllcKUn");
        String teslaStockLink = teslaStockLinkGenerator.getStockAPILink();

        System.out.println(teslaStockLink);
    }
}
