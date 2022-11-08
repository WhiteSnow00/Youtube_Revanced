import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atiy extends AtomicInteger implements asic
{
    private static final long serialVersionUID = 466549804534799122L;
    final ashj a;
    final atja b;
    Object c;
    volatile boolean d;
    
    public atiy(final ashj a, final atja b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        if (!this.d) {
            this.d = true;
            this.b.aR(this);
        }
    }
    
    public final boolean tx() {
        return this.d;
    }
}
