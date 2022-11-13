import java.io.IOException;
import org.webrtc.Logging;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arce implements SurfaceTexture$OnFrameAvailableListener
{
    final Object a;
    private final int b;
    
    public arce(final arcf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arce(final aulx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arce(final rfl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                final aulx aulx = (aulx)this.a;
                if (aulx.d) {
                    Logging.a("SurfaceTextureHelper", "A frame is already pending, dropping frame.");
                }
                aulx.d = true;
                aulx.b();
                return;
            }
            final Object a = this.a;
            surfaceTexture.updateTexImage();
            final rfl rfl = (rfl)a;
            final Long b2 = rfl.b.b(surfaceTexture.getTimestamp());
            if (b2 == null) {
                rfl.c.b((Exception)new IOException("Timestamp not found for frame"));
                return;
            }
            final qzi d = rfl.d;
            if (d != null) {
                d.b(surfaceTexture, rfl.i, b2 * 1000L);
                return;
            }
            rfl.c.b((Exception)new IllegalStateException("GlManager uninitialized while handling frames"));
        }
        else {
            ((arcf)this.a).d.getAndIncrement();
            synchronized (((arcf)this.a).k) {
                if (!((arcf)this.a).j) {
                    final arcg b3 = ((arcf)this.a).b;
                    if (b3 != null) {
                        b3.b();
                    }
                }
            }
        }
    }
}
