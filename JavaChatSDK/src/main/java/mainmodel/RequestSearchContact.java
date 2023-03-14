package mainmodel;


import com.google.gson.annotations.SerializedName;

public class RequestSearchContact {
    private String firstName;
    private String lastName;
    private String cellphoneNumber;
    private String email;
    private String typeCode;
    @SerializedName("q")
    private String query;
    private String id;
    private String offset;
    private String size;

    public RequestSearchContact(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.size = builder.size;
        this.offset = builder.offset;
        this.cellphoneNumber = builder.cellphoneNumber;
        this.id = builder.id;
        this.email = builder.email;
        this.typeCode = builder.typeCode;
        this.query = builder.query;
    }

    public RequestSearchContact(String size, String offset) {
        this.offset = offset;
        this.size = size;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }



    public static class Builder {
        private String firstName;
        private String lastName;
        private String cellphoneNumber;
        private String id;
        private String email;
        private String typeCode;
        private String query;
        private String offset;
        private String size;

        public Builder() {
        }

        public Builder offset(String offset) {
            this.offset = offset;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        public Builder id(String id) {
            this.id = id;
            return this;
        }


        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public Builder typeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }


        public Builder query(String query) {
            this.query = query;
            return this;
        }


        public Builder cellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }


        public RequestSearchContact build() {
            return new RequestSearchContact(this);
        }
    }
}
