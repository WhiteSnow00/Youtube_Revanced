import android.view.SurfaceHolder;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.view.TextureView$SurfaceTextureListener;
import android.view.SurfaceHolder$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bet implements SurfaceHolder$Callback, TextureView$SurfaceTextureListener, bsn, bhd, bqa, bmo, bdu, bfw, bef
{
    public final /* synthetic */ bew a;
    
    public bet(final bew a) {
        this.a = a;
    }
    
    public final void a(final boolean b) {
        this.a.ac();
    }
    
    public final void c(final Exception ex) {
        this.a.h.Z();
    }
    
    public final void d(final String s, final long n, final long n2) {
        this.a.h.I(s, n, n2);
    }
    
    public final void e(final String s) {
        this.a.h.aa();
    }
    
    public final void f(final bdx bdx) {
        this.a.h.J(bdx);
    }
    
    public final void g(final bdx bdx) {
        this.a.h.K(bdx);
    }
    
    public final void h(final ayf ayf, final bdy bdy) {
        this.a.h.ab(ayf);
    }
    
    public final void i(final long n) {
        this.a.h.L(n);
    }
    
    public final void j(final Exception ex) {
        this.a.h.M(ex);
    }
    
    public final void k(final int n, final long n2, final long n3) {
        this.a.h.N(n, n2, n3);
    }
    
    public final void l(final int n, final long n2) {
        this.a.h.O(n, n2);
    }
    
    public final void m(final Object o, final long n) {
        this.a.h.P(o, n);
        final bew a = this.a;
        if (a.u == o) {
            a.J.m(26, (bal)bem.c);
        }
    }
    
    public final void n(final boolean b) {
        final bew a = this.a;
        if (a.B == b) {
            return;
        }
        a.B = b;
        a.J.m(23, (bal)new bes(b));
    }
    
    public final void o(final Exception ex) {
        this.a.h.Q(ex);
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        final bew a = this.a;
        final Surface v = new Surface(surfaceTexture);
        a.aa((Object)v);
        a.v = v;
        this.a.V(n, n2);
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.a.aa((Object)null);
        this.a.V(0, 0);
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.a.V(n, n2);
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
    
    public final void p(final String s, final long n, final long n2) {
        this.a.h.R(s, n, n2);
    }
    
    public final void q(final String s) {
        this.a.h.ac();
    }
    
    public final void r(final bdx bdx) {
        this.a.h.S(bdx);
    }
    
    public final void s(final bdx bdx) {
        this.a.h.T(bdx);
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        this.a.V(n2, n3);
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final bew a = this.a;
        if (a.y) {
            a.aa((Object)surfaceHolder.getSurface());
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        final bew a = this.a;
        if (a.y) {
            a.aa((Object)null);
        }
        this.a.V(0, 0);
    }
    
    public final void t(final long n, final int n2) {
        this.a.h.ad();
    }
    
    public final void u(final ayf ayf, final bdy bdy) {
        this.a.h.U(ayf, bdy);
    }
    
    public final void v(final azr azr) {
        this.a.J.m(25, (bal)new bel(azr, 18));
    }
}
