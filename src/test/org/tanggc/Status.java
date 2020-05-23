package test.org.tanggc;

public enum Status {


    //1×× Informational
    CONTINUE(100),
    SWITCHING(101),
    PROCESSING(102),
    //2×× Success
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NON(203),
    NO(204),
    RESET(205),
    PARTIAL(206),
    MULTI(207),
    ALREADY(208),
    IM(226);
    private final int code;

    Status(int code) {

        this.code = code;
    }
    public static void main(String[] args) {

    }



}
