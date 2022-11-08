import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgh extends asho
{
    private static final atgk c;
    final ThreadFactory b;
    
    static {
        c = new atgk("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5))));
    }
    
    public atgh() {
        final atgk c = atgh.c;
        this.b = c;
    }
    
    public final ashn a() {
        return (ashn)new atgi(this.b);
    }
}
