import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import android.os.Looper;
import android.os.Handler;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.HandlerThread;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfb
{
    public final int a;
    public final arfc b;
    public final float[] c;
    public final AtomicInteger d;
    public final AtomicBoolean e;
    public final int[] f;
    public volatile SurfaceTexture g;
    public volatile Surface h;
    public volatile boolean i;
    public volatile boolean j;
    public final Object k;
    private final int l;
    private final int m;
    private final boolean n;
    private HandlerThread o;
    
    public arfb(final int a, final int l, final int m, final arfc b, final boolean n) {
        final float[] c = new float[16];
        this.c = c;
        this.d = new AtomicInteger(0);
        this.e = new AtomicBoolean(false);
        this.f = new int[1];
        this.i = false;
        this.j = false;
        this.k = new Object();
        this.a = a;
        this.l = l;
        this.m = m;
        this.b = b;
        this.n = n;
        Matrix.setIdentityM(c, 0);
        if (n) {
            (this.o = new HandlerThread("SurfaceTexture Callback Thread")).start();
        }
    }
    
    public final void a() {
        if (this.i) {
            return;
        }
        GLES20.glGenTextures(1, this.f, 0);
        this.b(this.f[0]);
    }
    
    public final void b(final int n) {
        if (this.i) {
            return;
        }
        this.f[0] = n;
        Handler handler;
        if (this.n) {
            handler = new Handler(this.o.getLooper());
        }
        else {
            handler = new Handler(Looper.getMainLooper());
        }
        if (this.g == null) {
            this.g = new SurfaceTexture(this.f[0]);
            if (this.l > 0 && this.m > 0) {
                this.g.setDefaultBufferSize(this.l, this.m);
            }
            this.g.setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)new arfa(this, 0), handler);
            this.h = new Surface(this.g);
        }
        else {
            this.g.attachToGLContext(this.f[0]);
        }
        this.i = true;
        final arfc b = this.b;
        if (b != null) {
            b.c();
        }
    }
    
    public final void c(final arey arey) {
        Object o = this.k;
        synchronized (o) {
            this.j = true;
            monitorexit(o);
            if (this.e.getAndSet(true)) {
                return;
            }
            o = this.b;
            if (o != null) {
                ((arfc)o).a();
            }
            if (this.g != null) {
                this.g.release();
                this.g = null;
                if (this.h != null) {
                    this.h.release();
                }
                this.h = null;
            }
            arey.a(this.a, 0, 0L, this.c);
        }
    }
}
