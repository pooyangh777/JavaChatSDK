package podChat.cachemodel;


/**
 * deleted /Delete state of Replied Message
 * participant, /* Sender of Replied Message
 * message, /* Content of Replied Message
 * messageType, /* Type of Replied Message
 */


public class CacheReplyInfoVO {

    //This field is just for using cache

    private Long id;
    private CacheParticipant participant;

    //This field is just for using cache
    private Long participantId;

    private long repliedToMessageId;
    private long repliedToMessageTime;
    private long repliedToMessageNanos;
    private long messageType;
    private boolean deleted;
    private String repliedToMessage;
    private String systemMetadata;
    private String metadata;
    private String message;


    public CacheParticipant getParticipant() {
        return participant;
    }

    public void setParticipant(CacheParticipant participant) {
        this.participant = participant;
    }

    public long getRepliedToMessageId() {
        return repliedToMessageId;
    }

    public void setRepliedToMessageId(long repliedToMessageId) {
        this.repliedToMessageId = repliedToMessageId;
    }

    public String getRepliedToMessage() {
        return repliedToMessage;
    }

    public void setRepliedToMessage(String repliedToMessage) {
        this.repliedToMessage = repliedToMessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public long getMessageType() {
        return messageType;
    }

    public void setMessageType(long messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getSystemMetadata() {
        return systemMetadata;
    }

    public void setSystemMetadata(String systemMetadata) {
        this.systemMetadata = systemMetadata;
    }

    public long getRepliedToMessageTime() {
        return repliedToMessageTime;
    }

    public void setRepliedToMessageTime(long repliedToMessageTime) {
        this.repliedToMessageTime = repliedToMessageTime;
    }

    public long getRepliedToMessageNanos() {
        return repliedToMessageNanos;
    }

    public void setRepliedToMessageNanos(long repliedToMessageNanos) {
        this.repliedToMessageNanos = repliedToMessageNanos;
    }
}
