module player.musicplayer2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens player.musicplayer2 to javafx.fxml;
    exports player.musicplayer2;
}