package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.exceptions;

public class TypeNotSupportedException extends RuntimeException {
    private TypeNotSupportedException(String message) {
        super(message);
    }

    public static TypeNotSupportedException create(String message) {
        return new TypeNotSupportedException(message);
    }
}

