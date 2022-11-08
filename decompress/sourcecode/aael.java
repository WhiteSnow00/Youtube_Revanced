import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aael
{
    public final Context a;
    private final asgt b;
    private String c;
    private asic d;
    
    public aael(final Context a, final asgt b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    
    public final String a() {
        synchronized (this) {
            final String c = this.c;
            final asic d = this.d;
            if (d != null) {
                athh.f((AtomicReference)d);
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
                this.d = this.b.al((asix)new zsv(this, 13));
            }
        }
    }
}
