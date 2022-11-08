// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

public class StatusException extends Exception
{
    private static final long serialVersionUID = -660954903976144640L;
    public final Status a;
    private final boolean b;
    
    public StatusException(final Status a) {
        super(Status.e(a), a.o);
        this.a = a;
        this.b = true;
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
