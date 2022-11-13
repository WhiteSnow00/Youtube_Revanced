import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asee extends arvs
{
    public final arvr a;
    final asef b;
    private final AtomicBoolean c;
    
    public asee(final asef b, final arvr a) {
        this.b = b;
        this.c = new AtomicBoolean(false);
        this.a = a;
    }
    
    public final arvo a() {
        if (this.c.compareAndSet(false, true)) {
            ((ascx)this.b.b).b.n.execute((Runnable)new ased(this, 0));
        }
        return arvo.a;
    }
}
