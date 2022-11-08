import android.view.Choreographer$FrameCallback;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dyl
{
    public final AtomicReference a;
    private Runnable b;
    private Choreographer$FrameCallback c;
    
    public dyl() {
        this.a = new AtomicReference();
    }
    
    public final Choreographer$FrameCallback a() {
        if (this.c == null) {
            this.c = (Choreographer$FrameCallback)new dyk(this, 0);
        }
        return this.c;
    }
    
    public final Runnable b() {
        if (this.b == null) {
            this.b = (Runnable)new dmb(this, 3);
        }
        return this.b;
    }
    
    public abstract void c(final long p0);
    
    public final void d(final long n) {
        this.a.getAndSet(null);
        final dxq a = bkv.a;
        try {
            this.c(n);
            final dxq a2 = bkv.a;
        }
        finally {
            try {
                final dxq a3 = bkv.a;
            }
            finally {
                final dxq a4 = bkv.a;
            }
        }
    }
}
