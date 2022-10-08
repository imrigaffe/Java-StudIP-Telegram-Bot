package de.oelrichsgarcia.studipTelegramBot.studipTelegramBot.telegram.api;

/**
 * The type Request exception.
 */
public class RequestException extends AbstractAPIException {


    /**
     * Instantiates a new Request exception.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public RequestException(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
