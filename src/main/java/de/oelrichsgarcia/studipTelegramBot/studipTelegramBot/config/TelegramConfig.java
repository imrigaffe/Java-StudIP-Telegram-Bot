package de.oelrichsgarcia.studipTelegramBot.studipTelegramBot.config;

/**
 * The type Telegram config.
 */
public class TelegramConfig {

    private boolean enabled;
    private String token;
    private int chatId;

    /**
     * Instantiates a new Telegram config.
     */
    public TelegramConfig() {
    }

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets chat id.
     *
     * @return the chat id
     */
    public int getChatId() {
        return chatId;
    }

    /**
     * Sets chat id.
     *
     * @param chatId the chat id
     */
    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    /**
     * Check if Telegram shall be used
     *
     * @return true or false
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets if Telegram shall be used
     *
     * @param enabled boolean
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
