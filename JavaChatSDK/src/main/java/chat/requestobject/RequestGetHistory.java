package chat.requestobject;


import mainmodel.NosqlSearchMetadataCriteria;

public class RequestGetHistory extends BaseRequestObject {
    private long threadId;
    private String order; // ASC OR DESC
    private long userId;
    private long id;
    private String query;
    private long fromTime;
    private long fromTimeNanos;
    private long toTime;
    private long toTimeNanos;
    private NosqlSearchMetadataCriteria metadataCriteria;
    private long firstMessageId;
    private long lastMessageId;
    private String[] uniqueIds;

    RequestGetHistory(Builder builder) {
        super(builder);
        this.threadId = builder.threadId;
        this.order = builder.order;
        this.firstMessageId = builder.firstMessageId;
        this.lastMessageId = builder.lastMessageId;
        this.query = builder.query;
        this.userId = builder.userId;
        this.id = builder.id;
        this.fromTime = builder.fromTime;
        this.fromTimeNanos = builder.fromTimeNanos;
        this.toTime = builder.toTime;
        this.toTimeNanos = builder.toTimeNanos;
        this.metadataCriteria = builder.metadataCriteria;
        this.uniqueIds = builder.uniqueIds;

    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public long getFirstMessageId() {
        return firstMessageId;
    }

    public void setFirstMessageId(long firstMessageId) {
        this.firstMessageId = firstMessageId;
    }

    public long getLastMessageId() {
        return lastMessageId;
    }

    public void setLastMessageId(long lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public NosqlSearchMetadataCriteria getMetadataCriteria() {
        return metadataCriteria;
    }

    public void setMetadataCriteria(NosqlSearchMetadataCriteria metadataCriteria) {
        this.metadataCriteria = metadataCriteria;
    }

    public long getFromTime() {
        return fromTime;
    }

    public void setFromTime(long fromTime) {
        this.fromTime = fromTime;
    }

    public long getFromTimeNanos() {
        return fromTimeNanos;
    }

    public void setFromTimeNanos(long fromTimeNanos) {
        this.fromTimeNanos = fromTimeNanos;
    }

    public long getToTime() {
        return toTime;
    }

    public void setToTime(long toTime) {
        this.toTime = toTime;
    }

    public long getToTimeNanos() {
        return toTimeNanos;
    }

    public void setToTimeNanos(long toTimeNanos) {
        this.toTimeNanos = toTimeNanos;
    }

    public String[] getUniqueIds() {
        return uniqueIds;
    }

    public void setUniqueIds(String[] uniqueIds) {
        this.uniqueIds = uniqueIds;
    }

    public static class Builder extends BaseRequestObject.Builder<Builder> {
        private long threadId;
        private String order;
        private long firstMessageId;
        private long lastMessageId;
        private long userId;
        private long id;
        private String query;
        private long fromTime;
        private long fromTimeNanos;
        private long toTime;
        private long toTimeNanos;
        private NosqlSearchMetadataCriteria metadataCriteria;
        private String[] uniqueIds;

        public Builder(long threadId) {
            this.threadId = threadId;
        }

        public Builder firstMessageId(long firstMessageId) {
            this.firstMessageId = firstMessageId;
            return this;
        }


        public Builder fromTime(long fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        public Builder fromTimeNanos(long fromTimeNanos) {
            this.fromTimeNanos = fromTimeNanos;
            return this;
        }


        public Builder toTime(long toTime) {
            this.toTime = toTime;
            return this;
        }


        public Builder toTimeNanos(long toTimeNanos) {
            this.toTimeNanos = toTimeNanos;
            return this;
        }


        public Builder lastMessageId(long lastMessageId) {
            this.lastMessageId = lastMessageId;
            return this;
        }


        public Builder order(String order) {
            this.order = order;
            return this;
        }


        public Builder userId(long userId) {
            this.userId = userId;
            return this;
        }


        public Builder id(long id) {
            this.id = id;
            return this;
        }


        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public Builder metadataCriteria(NosqlSearchMetadataCriteria metadataCriteria) {
            this.metadataCriteria = metadataCriteria;
            return this;
        }

        public Builder uniqueIds(String[] uniqueIds) {
            this.uniqueIds = uniqueIds;
            return this;
        }

        public RequestGetHistory build() {
            return new RequestGetHistory(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
