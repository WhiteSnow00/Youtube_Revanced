import android.view.Choreographer$FrameCallback;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dym
{
    public final AtomicReference a;
    private Runnable b;
    private Choreographer$FrameCallback c;
    
    public dym() {
        this.a = new AtomicReference();
    }
    
    public final Choreographer$FrameCallback a() {
        if (this.c == null) {
            this.c = (Choreographer$FrameCallback)new dyl(this, 0);
        }
        return this.c;
    }
    
    public final Runnable b() {
        if (this.b == null) {
            this.b = (Runnable)new dmc(this, 3);
        }
        return this.b;
    }
    
    public abstract void c(final long p0);
    
    public final void d(final long n) {
        this.a.getAndSet(null);
        final dxr a = bkw.a;
        try {
            this.c(n);
            final dxr a2 = bkw.a;
        }
        finally {
            try {
                final dxr a3 = bkw.a;
            }
            finally {
                final dxr a4 = bkw.a;
            }
        }
    }
}
