package model;

public class FileImageMetaData {
    private long id;
    private String originalName;
    private String link;
    private String hashCode;
    private String name;
    private int actualHeight;
    private int actualWidth;
    private long size;
    private String mimeType;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getActualHeight() {
        return actualHeight;
    }

    public void setActualHeight(int actualHeight) {
        this.actualHeight = actualHeight;
    }

    public int getActualWidth() {
        return actualWidth;
    }

    public void setActualWidth(int actualWidth) {
        this.actualWidth = actualWidth;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
