import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asri extends AtomicReference implements Runnable, asix
{
    private static final long serialVersionUID = -4552101107598366241L;
    final asrk a;
    asic b;
    long c;
    boolean d;
    boolean e;
    
    public asri(final asrk a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.c(this);
    }
}
