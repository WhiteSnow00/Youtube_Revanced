import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwy
{
    public final MultiSegmentCameraProgressIndicator a;
    public hau b;
    public uby c;
    private final Executor d;
    
    public gwy(final Executor d, final MultiSegmentCameraProgressIndicator a) {
        this.d = d;
        this.a = a;
    }
    
    public final void a() {
        final MultiSegmentCameraProgressIndicator a = this.a;
        if (a != null) {
            a.f = -1;
            a.postInvalidate();
        }
    }
    
    public final void b(final long n) {
        final MultiSegmentCameraProgressIndicator a = this.a;
        if (a != null && n >= 0L) {
            final int e = (int)n;
            adkp.H(e >= 0);
            a.e = e;
            a.postInvalidate();
        }
    }
    
    public final void c(final boolean g) {
        final MultiSegmentCameraProgressIndicator a = this.a;
        if (a != null) {
            a.g = g;
            a.postInvalidate();
        }
    }
    
    public final void d() {
        this.d.execute(aeun.h((Runnable)new gsb(this, 16)));
    }
}
