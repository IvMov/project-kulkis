package home.kulkis.userservice.entity.message;

import home.kulkis.userservice.entity.interaction.Emotion;
import home.kulkis.userservice.entity.file.AbstractFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message {

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;
    private String textContent;
    private List<String> gifUrlAttachments = new ArrayList<>();
    private List<AbstractFile> fileAttachments = new ArrayList<>();
    private List<Emotion> emotions = new ArrayList<>();
    private Message responseOn;
}
