import java.util.List;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.jar.k;
import android.app.Activity;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lot extends aefd
{
    public final lno a;
    public final e b;
    public final int c;
    private final c d;
    private final b e;
    private final elw f;
    
    static {
        trn.k("YouTubeAndroidPlayerAPI");
    }
    
    public lot(final Activity activity, final lnb lnb, final zbp zbp) {
        super((Context)activity, (a)new k(activity, 1), new absd((Context)activity));
        this.j.k((View)zbp);
        this.o.qZ((g)new lor());
        final elw f = new elw((com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c)this.M);
        this.f = f;
        this.e = com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b.e((f)this.N, lnb.c(), lnb.f());
        final c d = new c();
        this.d = d;
        final absd j = this.j;
        final abae k = this.k;
        k.getClass();
        j.l = (Runnable)new liq(k, 12);
        final h h = new h((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g)this.x, ((lnf)lnb).l, lnb.f());
        final absd i = this.j;
        final abae l = this.k;
        l.getClass();
        i.l = (Runnable)new liq(l, 12);
        this.a = lno.M((Context)activity, (lnn)new los(this), lnb, zbp, h, (shm)this.y, (aazx)l, this.p, this.q, this.r, this.s, this.t, this.o, this.R, d, (abbm)this.l, (abcm)this.m, (abbe)this.n, (abal)this.z, (abbh)this.A, (abbq)this.B, (abcp)this.w, f, (trb)new kpx(this, 11), aeev.b, (com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a)new lop(h), com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c.c);
        this.J.tp((Object)new loq(this, 0));
        final e d2 = lnb.d();
        (this.b = d2).n(this.c = d2.a(System.identityHashCode(activity)));
        this.v.m(this.N, (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c)d, (com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b)new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.c((d)new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f(d2)));
    }
    
    public final void A() {
        this.a.F();
    }
    
    public final boolean B() {
        return this.a.G();
    }
    
    public final boolean C() {
        return this.a.H();
    }
    
    public final boolean D() {
        return this.a.J();
    }
    
    public final boolean E() {
        return this.a.d;
    }
    
    public final boolean F(final VisibilityChangeEventData visibilityChangeEventData) {
        if (!this.aw()) {
            return false;
        }
        this.a.s(visibilityChangeEventData);
        return true;
    }
    
    public final boolean G(final int n, final KeyEvent keyEvent) {
        return this.a.K(n, keyEvent);
    }
    
    public final boolean H(final int n, final KeyEvent keyEvent) {
        return this.a.L(n, keyEvent);
    }
    
    protected final boolean I(final byte[] array) {
        final Parcel obtain = Parcel.obtain();
        obtain.unmarshall(array, 0, array.length);
        obtain.setDataPosition(0);
        this.a.t((PlaybackServiceState)obtain.readParcelable(PlaybackServiceState.class.getClassLoader()));
        obtain.recycle();
        return true;
    }
    
    protected final byte[] J() {
        final PlaybackServiceState c = this.a.c();
        final Parcel obtain = Parcel.obtain();
        obtain.writeParcelable((Parcelable)c, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
    
    public final int a() {
        if (this.a.a() < -2147483648L || this.a.a() > 2147483647L) {
            final long a = this.a.a();
            final StringBuilder sb = new StringBuilder("32 bit time overflow: ");
            sb.append(a);
            trn.l(sb.toString());
        }
        return (int)this.a.a();
    }
    
    public final int b() {
        if (this.a.b() < -2147483648L || this.a.b() > 2147483647L) {
            final long b = this.a.b();
            final StringBuilder sb = new StringBuilder("32 bit time overflow: ");
            sb.append(b);
            trn.l(sb.toString());
        }
        return (int)this.a.b();
    }
    
    public final void c() {
        this.a.q();
    }
    
    public final void d(final String s, final int n, final int n2) {
        this.b.u(this.c, lkn.f(s, n, (long)n2));
        this.a.f(s, n, n2, this.c);
    }
    
    public final void e(final String s, final int n) {
        this.b.u(this.c, lkn.g(s, (long)n));
        this.a.g(s, n, this.c);
    }
    
    public final void f(final List list, final int n, final int n2) {
        this.b.m(this.c, lkn.h(list, n, (long)n2), true);
        this.a.h(list, n, n2, this.c);
    }
    
    public final void g() {
        this.a.j();
    }
    
    public final void h(final String s, final int n, final int n2) {
        this.b.u(this.c, lkn.f(s, n, (long)n2));
        this.a.n(s, n, n2, false, this.c);
    }
    
    public final void i(final String s, final int n) {
        this.b.u(this.c, lkn.g(s, (long)n));
        this.a.o(s, false, n, false, this.c);
    }
    
    public final void j(final List list, final int n, final int n2) {
        this.b.m(this.c, lkn.h(list, n, (long)n2), true);
        this.a.p(list, n, n2, false, this.c);
    }
    
    public final void k(final wyb wyb) {
        this.b.p(wyb);
    }
    
    public final void l() {
        this.a.r();
    }
    
    public final void m() {
        this.a.u();
    }
    
    public final void n() {
        this.a.v();
    }
    
    protected final void o() {
        this.a.d();
    }
    
    protected final void p(final boolean b) {
        this.a.i(b);
    }
    
    public final void q() {
        this.a.u();
    }
    
    public final void r() {
        this.a.v();
    }
    
    public final void s() {
        this.a.w();
    }
    
    public final void t(final boolean b) {
        this.a.x(b);
        this.b.t(this.c);
        this.f.x();
        this.e.d();
    }
    
    public final void u(final int n) {
        this.a.z(n);
    }
    
    public final void v(final int n) {
        this.a.A(n);
    }
    
    public final void w(final boolean b) {
        this.a.B(b);
    }
    
    public final void x(final boolean b) {
        this.a.C(b);
    }
    
    protected final void y(final boolean b) {
        this.a.D(b);
    }
    
    public final void z() {
        this.a.E();
    }
}
