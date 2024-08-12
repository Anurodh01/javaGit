package codes;

public enum ErrorCode {
    INVALID_SEGMENT_DATA(1000,"Invalid segment of Data!");
    private Integer errorCode;
    private String message;
    ErrorCode(Integer errorCode, String message){
        this.errorCode = errorCode;
        this.message  = message;
    }

}
