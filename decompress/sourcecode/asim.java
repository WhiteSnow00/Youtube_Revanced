// 
// Decompiled by Procyon v0.6.0
// 

public final class asim extends RuntimeException
{
    private static final long serialVersionUID = -6298857009889503852L;
    
    public asim(final Throwable t) {
        final String concat = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(String.valueOf(t)));
        Throwable t2 = t;
        if (t == null) {
            t2 = new NullPointerException();
        }
        super(concat, t2);
    }
}
