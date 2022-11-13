import java.util.Map;
import java.util.HashMap;
import java.nio.Buffer;
import com.google.mediapipe.framework.GlSyncToken;
import android.util.Log;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.ArrayDeque;
import javax.microedition.khronos.egl.EGLContext;
import java.util.Queue;
import java.util.List;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtn extends agua implements SurfaceTexture$OnFrameAvailableListener
{
    public volatile SurfaceTexture a;
    public volatile SurfaceTexture b;
    public final List c;
    public volatile boolean d;
    public final Queue e;
    public int f;
    public int g;
    public int h;
    public agtz i;
    public final boolean j;
    public long k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    private int[] x;
    
    public agtn(final EGLContext eglContext, final int g) {
        super((Object)eglContext);
        this.a = null;
        this.b = null;
        this.x = null;
        this.d = false;
        this.e = new ArrayDeque();
        this.f = 0;
        this.i = null;
        this.j = true;
        this.k = 0L;
        this.l = 0L;
        this.m = false;
        this.n = 0;
        this.o = 0;
        this.g = g;
        this.i = new agtz();
        this.c = new ArrayList();
    }
    
    public static void g(final agts agts) {
        GLES20.glDeleteTextures(1, new int[] { agts.d }, 0);
    }
    
    public static final void h(final agts agts) {
        try {
            synchronized (agts) {
                while (agts.h && agts.j == null) {
                    agts.wait();
                }
                final GlSyncToken j = agts.j;
                if (j != null) {
                    j.waitOnGpu();
                    agts.j.release();
                    agts.h = false;
                    agts.j = null;
                }
            }
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(ex.getMessage())));
            throw new RuntimeException(ex);
        }
    }
    
    public final agtm a() {
        final int n = this.n;
        final int o = this.o;
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, array[0]);
        GLES20.glTexImage2D(3553, 0, 6408, n, o, 0, 6408, 5121, (Buffer)null);
        agub.c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        agub.c("texture setup");
        final int n2 = array[0];
        String.format("Created output texture: %d width: %d height: %d", n2, this.n, this.o);
        this.i(n2, this.n, this.o);
        return new agtm(this, n2, this.n, this.o);
    }
    
    protected final void b(final agtm agtm) {
        monitorenter(this);
        try {
            this.e.offer(agtm);
            final int f = this.f - 1;
            this.f = f;
            while (this.e.size() > Math.max(this.g - f, 0)) {
                this.u.post((Runnable)new aeue((agtm)this.e.remove(), 19));
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c() {
        super.c();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        final agtz i = this.i;
        final HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        final int d = agub.d("#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", (Map)hashMap);
        i.f = d;
        i.g = GLES20.glGetUniformLocation(d, "video_frame");
        i.h = GLES20.glGetUniformLocation(i.f, "texture_transform");
        agub.c("glGetUniformLocation");
        GLES20.glGenTextures(1, this.x = new int[] { 0 }, 0);
        this.f(this.b = new SurfaceTexture(this.x[0]), 0, 0);
    }
    
    public final void d() {
        this.f(null, 0, 0);
        while (!this.e.isEmpty()) {
            g(this.e.remove());
        }
        this.b.release();
        final int[] x = this.x;
        if (x != null) {
            GLES20.glDeleteTextures(1, x, 0);
        }
        GLES20.glDeleteProgram(this.i.f);
        super.d();
    }
    
    public final void e(final int n, final int o) {
        this.n = n;
        this.o = o;
    }
    
    public final void f(final SurfaceTexture a, final int n, final int n2) {
        this.d = false;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)null);
        }
        this.a = a;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
        }
        this.e(n, n2);
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.u.post((Runnable)new agjf(this, surfaceTexture, 12));
    }
}
