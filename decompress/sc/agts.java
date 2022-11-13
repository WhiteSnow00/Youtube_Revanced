import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public class agts implements TextureFrame
{
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public boolean h;
    public boolean i;
    public GlSyncToken j;
    
    public agts(final int d, final int e, final int f) {
        this.g = Long.MIN_VALUE;
        this.h = false;
        this.i = false;
        this.j = null;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void b() {
        synchronized (this) {
            final GlSyncToken j = this.j;
            if (j != null) {
                j.release();
                this.j = null;
            }
            this.h = true;
            this.i = true;
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            while (this.h && this.j == null) {
                this.wait();
            }
            final GlSyncToken j = this.j;
            if (j != null) {
                j.waitOnCpu();
                this.j.release();
                this.h = false;
                this.j = null;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            final boolean h = this.h;
            boolean b = false;
            if (h) {
                b = b;
                if (this.j == null) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    public final void finalize() {
        final GlSyncToken j = this.j;
        if (j != null) {
            j.release();
            this.j = null;
        }
    }
    
    @Override
    public final int getHeight() {
        return this.f;
    }
    
    @Override
    public final int getTextureName() {
        return this.d;
    }
    
    @Override
    public final long getTimestamp() {
        return this.g;
    }
    
    @Override
    public final int getWidth() {
        return this.e;
    }
    
    @Override
    public void release() {
        synchronized (this) {
            this.h = false;
            this.i = false;
            this.notifyAll();
        }
    }
    
    @Override
    public void release(final GlSyncToken j) {
        synchronized (this) {
            final GlSyncToken i = this.j;
            if (i != null) {
                i.release();
            }
            this.j = j;
            this.i = false;
            this.notifyAll();
        }
    }
}
