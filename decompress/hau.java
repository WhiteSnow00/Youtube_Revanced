import android.view.Surface;
import android.graphics.SurfaceTexture;
import com.google.mediapipe.framework.TextureFrame;
import java.util.ArrayList;
import com.google.research.xeno.effect.Control$GpuBufferSetting;
import java.util.List;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hau implements ukh, agtq
{
    public bej a;
    public agto b;
    public hav c;
    azf d;
    boolean e;
    final Executor f;
    final Context g;
    public Uri h;
    public final List i;
    public hav j;
    public boolean k;
    public boolean l;
    public long m;
    public int n;
    public int o;
    public int p;
    final pvh q;
    private Control$GpuBufferSetting r;
    
    public hau(final Context g, final Executor f, final pvh q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = new ArrayList();
        this.g = g;
        this.f = f;
        this.q = q;
    }
    
    private final void p() {
        if (!this.k) {
            return;
        }
        this.k = false;
        final bej a = this.a;
        if (a != null && a.g()) {
            this.a.c();
        }
        Label_0087: {
            if (this.o()) {
                final bej a2 = this.a;
                if (a2 != null) {
                    this.c = hav.a(this.h, this.m, a2.o());
                    break Label_0087;
                }
            }
            this.c = hav.a;
        }
        final int size = this.i.size();
        final int n = this.n;
        if (size > n) {
            this.i.set(n, this.c);
            return;
        }
        if (this.i.size() == this.n) {
            this.i.add(this.c);
        }
    }
    
    public final void a() {
    }
    
    public final void b() {
    }
    
    public final void d() {
    }
    
    public final void g() {
    }
    
    public final long h() {
        final bej a = this.a;
        if (a == null || this.h == null) {
            return 0L;
        }
        final long p = a.p();
        if (p == -9223372036854775807L) {
            return 0L;
        }
        return p - this.a.o();
    }
    
    public final hav i() {
        if (!this.i.isEmpty()) {
            int n = this.n;
            if (n > 0) {
                while (--n >= 0) {
                    final hav hav = this.i.get(n);
                    if (hav.b != null) {
                        return hav;
                    }
                }
            }
        }
        return hav.a;
    }
    
    public final void j() {
        final bej a = this.a;
        if (a != null) {
            a.v();
            this.a = null;
        }
    }
    
    public final void k(final TextureFrame textureFrame) {
        final Control$GpuBufferSetting r = this.r;
        if (r == null) {
            textureFrame.release();
            return;
        }
        r.a(textureFrame);
    }
    
    public final void l(final Control$GpuBufferSetting r, final boolean b) {
        final Control$GpuBufferSetting r2 = this.r;
        int n = 0;
        if (r2 != null) {
            n = n;
            if (b) {
                n = 1;
            }
        }
        this.r = r;
        final agto b2 = this.b;
        if (b2 != null && n != 0) {
            final SurfaceTexture a = b2.a();
            final agtn a2 = b2.a;
            if (a2 != null && a != null && a2.d) {
                b2.a.onFrameAvailable(a);
            }
        }
    }
    
    public final void m(final Runnable runnable) {
        if (tbi.h()) {
            runnable.run();
            return;
        }
        this.f.execute(runnable);
    }
    
    public final void n(final Uri h, final boolean b) {
        this.h = h;
        if (h == null) {
            this.j();
            return;
        }
        bej bej;
        if ((bej = this.a) == null) {
            this.a = new bei(this.g).a();
            final hat d = new hat(this);
            this.d = (azf)d;
            this.a.s((azf)d);
            final bej a = this.a;
            final agto b2 = this.b;
            if (b2 != null && this.o != 0 && this.p != 0) {
                final SurfaceTexture a2 = b2.a();
                a2.setDefaultBufferSize(this.o, this.p);
                final Surface surface = new Surface(a2);
                this.b.g(a2, this.o, this.p);
                a.B(surface);
            }
            bej = this.a;
        }
        bej.f(ayu.b(h));
        final hav j = this.j;
        if (j != null) {
            final Uri b3 = j.b;
            if (b3 != null && !b3.equals((Object)h)) {
                this.j = null;
            }
        }
        final hav i = this.j;
        if (i != null) {
            bej.e(i.d);
        }
        else {
            bej.e(0L);
        }
        if (b) {
            bej.C(1.0f);
        }
        else {
            bej.C(0.0f);
        }
        bej.u();
    }
    
    public final void nG() {
        this.p();
    }
    
    public final void nH() {
        this.p();
    }
    
    public final void nL() {
    }
    
    public final boolean o() {
        return this.e && this.h != null;
    }
}
