import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaie
{
    public final Context a;
    private final aske b;
    private String c;
    private asln d;
    
    public aaie(final Context a, final aske b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    
    public final String a() {
        synchronized (this) {
            final String c = this.c;
            final asln d = this.d;
            if (d != null) {
                atkw.f((AtomicReference)d);
                this.d = null;
                this.c = null;
            }
            return c;
        }
    }
    
    public final void b(final String c) {
        synchronized (this) {
            if (this.d == null) {
                this.c = c;
                this.d = this.b.am(new aaid(this, 0));
            }
        }
    }
}
