public final class Constants
{
    private Constants()
    {

    }

    // Source Code Variables
    static final int LENGTH_NODE_ARRAY = 1000;
    public static final String STOP_MESSAGE = "stop";
    public static final String FILE_NAME = "D:\\GitHubProjekte\\VAA_WS2018_U1_A1\\inputFiles\\inputTextFile";

    // Error Messages
    public static final String FILE_NOT_FOUND_ERROR = "Datei nicht gefunden: ";
    public static final String INPUT_OUTPUT_ERROR = "Fehler: ";
    public static final String INVALID_INPUT_ERROR = "Ungültige Eingabe." + " Starten Sie das Programm neu mit der gewünschten Knoten ID.";
    public static final String JSON_ERROR = "Fehler beim erzeugen einer JSON-Nachricht: ";

    // Message Type
    public static final String SYSTEM_MESSAGE_TYPE = "SYSTEM";
    public static final String ERROR_MESSAGE_TYPE = "ERROR";
    public static final String CHAT_MESSAGE_TYPE = "CHAT";

    // Output
    public static final String SELECTION_MENU =
            "__________Menü__________" + "\n" + "\n" +
            " 1. Sende Nachricht" + "\n" +
            " 2. Beende Knoten " + "\n" +
            " 3. Beende alle Knoten" + "\n" +
            "_________________________" + "\n" +
            "Eingabe: ";

    public static final String REQUEST_ID_INPUT = "Geben Sie die ID des gewünschten Knoten ein: ";
}
