import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atpu extends atpr
{
    public final atrk b;
    private final Thread e;
    
    public atpu(final atmd atmd, final Thread e, final atrk b) {
        atmd.getClass();
        e.getClass();
        super(atmd);
        this.e = e;
        this.b = b;
    }
    
    protected final boolean l() {
        return true;
    }
    
    protected final void tO(final Object o) {
        if (!atoc.c((Object)Thread.currentThread(), (Object)this.e)) {
            LockSupport.unpark(this.e);
        }
    }
}
