import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGL10;
import android.os.Build$VERSION;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.EGL14;
import android.view.Display$HdrCapabilities;
import android.view.WindowManager;
import android.content.Context;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class aarb implements GLSurfaceView$EGLWindowSurfaceFactory
{
    private static final int[] c;
    public final int a;
    public boolean b;
    private boolean d;
    private boolean e;
    private boolean f;
    private aara g;
    private aara h;
    private String i;
    private int j;
    private int k;
    
    static {
        c = new int[] { 13121, 13122, 13123, 13124, 13125, 13126, 13127, 13128 };
    }
    
    public aarb(final Context context) {
        this.j = 3;
        this.k = 3;
        this.d = context.getResources().getConfiguration().isScreenWideColorGamut();
        (this.h = new aara(0)).a(12344, 12344);
        final WindowManager windowManager = (WindowManager)context.getSystemService("window");
        int max = 500;
        if (windowManager != null) {
            final Display$HdrCapabilities hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities();
            if (hdrCapabilities == null) {
                max = max;
            }
            else {
                max = Math.max((int)hdrCapabilities.getDesiredMaxLuminance(), 500);
            }
        }
        this.a = max;
    }
    
    public final void a() {
        if (!this.b) {
            return;
        }
        final EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        final EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
        if (this.e) {
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13152, this.a * 50000);
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13153, this.a * 50000 / 3);
        }
        if (this.f) {
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13129, this.a * 50000);
            EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, 13130, 0);
            int i = 8;
            while (i > 0) {
                --i;
                EGL14.eglSurfaceAttrib(eglGetCurrentDisplay, eglGetCurrentSurface, aarb.c[i], (int)(aaub.a[i] * 50000.0f));
            }
        }
    }
    
    public final void b(final boolean b) {
        if (!(this.b = b)) {
            return;
        }
        if (this.i == null) {
            final String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            this.i = eglQueryString;
            if (this.d) {
                int n;
                if (eglQueryString != null && eglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    this.k = 1;
                    this.j = 1;
                    n = 13120;
                }
                else {
                    final String i = this.i;
                    if (i != null && i.contains("EGL_EXT_gl_colorspace_display_p3") && Build$VERSION.SDK_INT <= 28) {
                        this.k = 2;
                        this.j = 3;
                        n = 13155;
                    }
                    else {
                        this.d = false;
                        this.b = false;
                        this.j = 3;
                        this.k = 3;
                        ttr.c("GlWindowFactory", "BT709 GAMMA22");
                        if (this.i != null) {
                            return;
                        }
                        throw new aatr("c.GlExtensions_null");
                    }
                }
                (this.g = new aara(1)).a(12445, n);
                this.g.a(12344, 12344);
                (this.h = new aara(1)).a(12445, 12426);
                this.h.a(12344, 12344);
                this.e = this.i.contains("EGL_EXT_surface_CTA861_3_metadata");
                this.f = this.i.contains("EGL_EXT_surface_SMPTE2086_metadata");
            }
            else {
                this.j = 3;
                this.k = 2;
            }
            final String m = yag.m(this.k);
            final String a = yag.a(this.j);
            final StringBuilder sb = new StringBuilder();
            sb.append(m);
            sb.append(" ");
            sb.append(a);
            ttr.c("GlWindowFactory", sb.toString());
        }
    }
    
    public final int c() {
        if (this.b) {
            return this.k;
        }
        return 3;
    }
    
    public final javax.microedition.khronos.egl.EGLSurface createWindowSurface(final EGL10 egl10, final javax.microedition.khronos.egl.EGLDisplay eglDisplay, final EGLConfig eglConfig, final Object o) {
        aara aara;
        if (this.b && this.d) {
            aara = this.g;
        }
        else {
            aara = this.h;
        }
        return egl10.eglCreateWindowSurface(eglDisplay, eglConfig, o, (int[])aara.b);
    }
    
    public final int d() {
        if (this.b) {
            return this.j;
        }
        return 3;
    }
    
    public final void destroySurface(final EGL10 egl10, final javax.microedition.khronos.egl.EGLDisplay eglDisplay, final javax.microedition.khronos.egl.EGLSurface eglSurface) {
        egl10.eglDestroySurface(eglDisplay, eglSurface);
    }
}
