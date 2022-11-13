import javax.microedition.khronos.egl.EGLSurface;
import com.google.research.xeno.effect.Control$GpuBufferSetting;
import com.google.mediapipe.framework.TextureFrame;
import android.opengl.GLUtils;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.view.View;
import com.google.research.xeno.effect.Control$RuntimeOptionsSetting;
import com.google.research.xeno.effect.Control;
import android.opengl.EGLContext;
import android.net.Uri;
import java.util.concurrent.Executor;
import com.google.research.xeno.effect.Effect;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hao implements uke
{
    public boolean a;
    public float b;
    public float c;
    public String d;
    public final HashMap e;
    public ahfr f;
    public FilterMapTable$FilterDescriptor g;
    public Effect h;
    public hau i;
    public upw j;
    public boolean k;
    public int l;
    public hbn m;
    public final qqr n;
    public pvh o;
    private final Executor p;
    private agtx q;
    
    public hao(final qqr n, final Executor p2) {
        this.l = 1;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = "";
        this.e = new HashMap();
        this.n = n;
        this.p = p2;
    }
    
    private final void s(final agtx q) {
        this.q = q;
        final hau i = this.i;
        if (i != null) {
            (i.b = new agto(q.a, 2)).b(i);
        }
    }
    
    private final boolean t(final String s) {
        final FilterMapTable$FilterDescriptor g = this.g;
        return g != null && g.e(s);
    }
    
    public final void a(final boolean b) {
        tbi.f();
        final boolean b2 = true;
        if (b) {
            final upw j = this.j;
            if (j != null && !j.g()) {
                this.j.d(true);
            }
            this.a = true;
            if (this.l == 1) {
                this.l = 2;
            }
        }
        else {
            this.a = false;
            this.l = 1;
            this.d = "";
            final hau i = this.i;
            if (i != null) {
                i.n(null, false);
            }
            this.p();
        }
        this.n();
        final pvh o = this.o;
        if (o != null) {
            final boolean a = this.a;
            final pvh v = ((hbg)o.a).v;
            if (v != null) {
                v.I(a);
            }
            final hbg hbg = (hbg)o.a;
            final hbb t = hbg.t;
            final boolean k = hbg.i;
            if (!a) {
                final hay a2 = t.a;
                a2.b = 1.0f;
                a2.c = 0.0f;
                a2.d = 0.0f;
                a2.e = 0.0f;
            }
            t.c.g(t.a.c());
            final uby d = t.d;
            if (d != null) {
                if (a) {
                    d.C(t.a.b());
                }
                else {
                    d.D();
                }
            }
            final pvh h = t.h;
            if (h != null && a) {
                h.L(t.a.a(), false);
            }
            t.g = (k && a && b2);
        }
        final hau l = this.i;
        if (l != null && !(l.e = this.a)) {
            l.h = null;
            l.j();
        }
    }
    
    public final void b(final float n) {
        if (n != 0.0f) {
            final upw j = this.j;
            if (j != null && !j.g()) {
                this.j.d(true);
            }
        }
    }
    
    public final void c(final EGLContext eglContext) {
        synchronized (this) {
            this.s(new agtx((Object)eglContext));
        }
    }
    
    public final void d(final javax.microedition.khronos.egl.EGLContext eglContext) {
        synchronized (this) {
            this.s(new agtx((Object)eglContext));
        }
    }
    
    public final void e() {
        synchronized (this) {
            final agtx q = this.q;
            if (q != null) {
                q.e();
            }
            this.q = null;
        }
    }
    
    public final void f(final Runnable runnable) {
        if (tbi.h()) {
            runnable.run();
            return;
        }
        this.p.execute(runnable);
    }
    
    public final void g(final ahfr f) {
        tbi.f();
        this.f = f;
        this.m();
    }
    
    final void h(final Uri uri, final boolean b, final boolean b2) {
        tbi.f();
        final hau i = this.i;
        if (i != null) {
            i.n(uri, b);
            int l;
            if (!b2) {
                l = 3;
            }
            else {
                l = 4;
            }
            this.l = l;
            final String path = uri.getPath();
            if (path != null) {
                this.d = path;
            }
            else {
                this.d = "";
            }
            this.j();
        }
    }
    
    public final void i(final float b, final float c) {
        this.b = b;
        this.c = c;
        this.k = true;
        this.r();
        this.l();
        final hbn m = this.m;
        if (m != null) {
            m.a(b, c);
        }
    }
    
    public final void j() {
        if (!this.e.containsKey(this.d)) {
            final HashMap e = this.e;
            e.put(this.d, e.size());
        }
    }
    
    public final void k() {
        this.n.b((aezf)new ggp(this, 13), (Executor)afum.a);
    }
    
    public final void l() {
        final hbn m = this.m;
        if (m != null) {
            if (this.k) {
                int visibility;
                if (!this.t("retouch_intensity")) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                m.a.setVisibility(visibility);
                final hbn i = this.m;
                i.f = this.t("relight_intensity");
                i.b();
            }
        }
    }
    
    public final void m() {
        if (!this.a) {
            return;
        }
        final FilterMapTable$FilterDescriptor g = this.g;
        Control b;
        if (g != null) {
            b = g.b("affine_viewfinder_transform");
        }
        else {
            b = null;
        }
        if (b != null && this.f != null) {
            final Control$RuntimeOptionsSetting e = b.e;
            final ahbb ahbb = (ahbb)((ahbh)aqvj.a).createBuilder();
            ahbb.e((ahaq)ahfr.b, (Object)this.f);
            Control.nativeSetRuntimeOptionsValue(e.a, ((agzk)((ahaz)ahbb).build()).toByteArray());
        }
    }
    
    public final void n() {
        final FilterMapTable$FilterDescriptor g = this.g;
        if (g == null) {
            return;
        }
        final Control b = g.b("green_screen_enabled");
        if (b != null) {
            Control.nativeSetBoolValue(b.a.a, this.a);
        }
    }
    
    public final void o() {
        final pvh o = this.o;
        if (o != null) {
            int n;
            if (this.t("green_screen_texture")) {
                n = 3;
            }
            else if (this.t("green_screen_enabled") && this.t("green_screen_bg_img_path")) {
                n = 2;
            }
            else {
                n = 1;
            }
            final boolean t = this.t("affine_viewfinder_transform");
            final int n2 = 0;
            final boolean b = n != 1;
            final Object a = o.a;
            final boolean i = b && t;
            final hbg hbg = (hbg)a;
            hbg.i = i;
            if (n == 3) {
                hbg.p = 3;
            }
            else {
                hbg.p = 1;
            }
            final CreationButtonView d = hbg.d;
            int visibility = n2;
            if (!b) {
                visibility = 8;
            }
            d.setVisibility(visibility);
            if (((hbg)o.a).d.getVisibility() == 0) {
                final pvh v = ((hbg)o.a).v;
                if (v != null) {
                    final gww gww = (gww)v.a;
                    final CreationButtonView ai = gww.ai;
                    if (ai != null && !gww.S) {
                        gww.S = true;
                        gww.y.d("shorts-camera-toolbelt-green-screen-button", (View)ai);
                    }
                }
            }
        }
    }
    
    public final void p() {
        final FilterMapTable$FilterDescriptor g = this.g;
        if (g != null) {
            final hau i = this.i;
            if (i == null || i.h == null) {
                final Control b = g.b("green_screen_bg_img_path");
                final Control b2 = this.g.b("green_screen_texture");
                if (b2 != null) {
                    final Control$GpuBufferSetting c = b2.c;
                    final boolean equals = "".equals(this.d);
                    final TextureFrame textureFrame = null;
                    if (!equals) {
                        final agtx q = this.q;
                        TextureFrame textureFrame2;
                        if (q == null) {
                            textureFrame2 = textureFrame;
                        }
                        else {
                            final String d = this.d;
                            final EGLSurface g2 = q.g();
                            q.c(g2, g2);
                            final int[] array = { 0 };
                            GLES20.glGenTextures(1, array, 0);
                            final Bitmap decodeFile = BitmapFactory.decodeFile(d);
                            Bitmap bitmap;
                            if (array[0] != 0 && decodeFile != null) {
                                final Matrix matrix = new Matrix();
                                matrix.postScale(1.0f, -1.0f);
                                bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                                decodeFile.recycle();
                            }
                            else {
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                GLES20.glBindTexture(3553, array[0]);
                                GLES20.glTexParameteri(3553, 10241, 9728);
                                GLES20.glTexParameteri(3553, 10240, 9728);
                                GLUtils.texImage2D(3553, 0, bitmap, 0);
                                final agts agts = new agts(array[0], bitmap.getWidth(), bitmap.getHeight());
                                bitmap.recycle();
                                textureFrame2 = agts;
                            }
                            else {
                                zlm.b(zll.b, zlk.f, "Failure to load texture frame.");
                                textureFrame2 = textureFrame;
                            }
                        }
                        c.a(textureFrame2);
                        return;
                    }
                    c.a((TextureFrame)null);
                }
                else if (b != null) {
                    Control.nativeSetStringValue(b.f.a, this.d);
                }
            }
        }
    }
    
    public final void q() {
        final FilterMapTable$FilterDescriptor g = this.g;
        if (g == null) {
            return;
        }
        final Control b = g.b("relight_intensity");
        if (b != null) {
            b.b.b(this.c);
        }
    }
    
    public final void r() {
        final FilterMapTable$FilterDescriptor g = this.g;
        if (g != null) {
            if (this.k) {
                final Control b = g.b("retouch_intensity");
                if (b != null) {
                    b.b.b(this.b);
                }
            }
        }
    }
}
