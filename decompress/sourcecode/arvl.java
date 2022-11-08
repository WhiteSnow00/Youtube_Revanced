import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arvl extends RuntimeException
{
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;
    private final boolean b;
    
    public arvl(final Status status) {
        this(status, true);
    }
    
    public arvl(final Status a, final boolean b) {
        super(Status.e(a), a.o);
        this.a = a;
        this.b = b;
        this.fillInStackTrace();
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            if (this.b) {
                return super.fillInStackTrace();
            }
            return this;
        }
    }
}
