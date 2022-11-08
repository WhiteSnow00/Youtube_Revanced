import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atoz extends atow
{
    public final atqp b;
    private final Thread e;
    
    public atoz(final atli atli, final Thread e, final atqp b) {
        atli.getClass();
        e.getClass();
        super(atli);
        this.e = e;
        this.b = b;
    }
    
    protected final boolean l() {
        return true;
    }
    
    protected final void tL(final Object o) {
        if (!atnh.c(Thread.currentThread(), this.e)) {
            LockSupport.unpark(this.e);
        }
    }
}
