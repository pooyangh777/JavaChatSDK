package util;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import podAsync.AsyncConfig;

@Builder
@Getter
@Setter
public class ChatConfig {
    private AsyncConfig asyncConfig;
    private String severName;
    private String token;
    private String ssoHost;
    private String platformHost;
    private String fileServer;
    private Long chatId;
    private String typeCode = "default";
    private long ttl;
    private boolean isLoggable = false;
}
