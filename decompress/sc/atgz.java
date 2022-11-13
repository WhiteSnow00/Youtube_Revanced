import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgz extends asid
{
    private static final athc c;
    final ThreadFactory b;
    
    static {
        c = new athc("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5))));
    }
    
    public atgz() {
        final athc c = atgz.c;
        this.b = (ThreadFactory)c;
    }
    
    @Override
    public final asic a() {
        return (asic)new atha(this.b);
    }
}
