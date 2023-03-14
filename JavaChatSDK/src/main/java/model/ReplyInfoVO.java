package model;
import mainmodel.Participant;

public class ReplyInfoVO {
    private Participant participant;
    private long repliedToMessageId;
    private long repliedToMessageTime;
    private long repliedToMessageNanos;
    private String repliedToMessage;
    private long messageType;
    private boolean deleted;
    private String systemMetadata;
    private String metadata;
    private String message;

    public ReplyInfoVO(
            long repliedToMessageId,
            long messageType,
            boolean deleted,
            String repliedToMessage,
            String systemMetadata,
            String metadata,
            String message,
            long repliedToMessageTime,
            long repliedToMessageNanos
    ) {
        this.repliedToMessageId = repliedToMessageId;
        this.messageType = messageType;
        this.deleted = deleted;
        this.repliedToMessage = repliedToMessage;
        this.systemMetadata = systemMetadata;
        this.metadata = metadata;
        this.message = message;
        this.repliedToMessageTime = repliedToMessageTime;
        this.repliedToMessageNanos = repliedToMessageNanos;
    }

    public ReplyInfoVO() {
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
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

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getMessageType() {
        return messageType;
    }

    public void setMessageType(long messageType) {
        this.messageType = messageType;
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
