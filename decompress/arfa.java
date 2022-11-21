import java.io.IOException;
import org.webrtc.Logging;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfa implements SurfaceTexture$OnFrameAvailableListener
{
    final Object a;
    private final int b;
    
    public arfa(final arfb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfa(final auot a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfa(final rgl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                final auot auot = (auot)this.a;
                if (auot.d) {
                    Logging.a("SurfaceTextureHelper", "A frame is already pending, dropping frame.");
                }
                auot.d = true;
                auot.b();
                return;
            }
            final Object a = this.a;
            surfaceTexture.updateTexImage();
            final rgl rgl = (rgl)a;
            final Long b2 = rgl.b.b(surfaceTexture.getTimestamp());
            if (b2 == null) {
                rgl.c.b((Exception)new IOException("Timestamp not found for frame"));
                return;
            }
            final rag d = rgl.d;
            if (d != null) {
                d.b(surfaceTexture, rgl.i, b2 * 1000L);
                return;
            }
            rgl.c.b((Exception)new IllegalStateException("GlManager uninitialized while handling frames"));
        }
        else {
            ((arfb)this.a).d.getAndIncrement();
            synchronized (((arfb)this.a).k) {
                if (!((arfb)this.a).j) {
                    final arfc b3 = ((arfb)this.a).b;
                    if (b3 != null) {
                        b3.b();
                    }
                }
            }
        }
    }
}
