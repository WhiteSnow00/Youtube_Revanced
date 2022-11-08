import java.util.concurrent.Executor;
import android.support.v4.media.RatingCompat;
import android.util.Base64;
import android.os.Bundle;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtv extends dz
{
    public final atjj e;
    private final gtx f;
    private final wwv g;
    private final qbo h;
    
    public gtv(final atjj e, final qbo h, final gtx f, final wwv g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void b() {
        this.h.S().b();
        this.t("onFastForward()", gty.a);
    }
    
    public final void c() {
        this.t("onPause()", this.h.T());
    }
    
    public final void d() {
        final qbo h = this.h;
        gty gty;
        if (!h.V()) {
            gty = gty.c;
        }
        else {
            h.S().d();
            gty = gty.a;
        }
        this.t("onPlay()", gty);
    }
    
    public final void e(final Uri uri, final Bundle bundle) {
        final String string = bundle.getString("android.intent.extra.youtube_click_tracking_id");
        byte[] decode;
        if (string != null) {
            decode = Base64.decode(string, 8);
        }
        else {
            decode = null;
        }
        if (decode != null) {
            this.g.b(wya.b(22678), (aioe)null, (alff)null);
            final wws wws = new wws(decode);
            this.g.D((wxz)wws);
            this.g.J(3, (wxz)wws, (alff)null);
        }
        final qbo h = this.h;
        final gtw gtw = new gtw(h, uri, decode, null, null, null);
        final Object a = h.a;
        Uri build = uri;
        if (uri.getPath().equals("/playlist")) {
            build = uri.buildUpon().path("watch").build();
        }
        ((fjj)a).o(build, (String)null, (znj)gtw);
        ((ashp)gtw.a).Z((asix)new grs(this, 9));
    }
    
    public final void f() {
        this.t("onPrepare()", this.h.T());
    }
    
    public final void g() {
        this.h.S().g();
        this.t("onRewind()", gty.a);
    }
    
    public final void h(final long n) {
        this.h.S().h(n);
        this.t("onSeekTo()", gty.a);
    }
    
    public final void i(final RatingCompat ratingCompat) {
        final float b = ratingCompat.b;
        almd almd = null;
        Label_0046: {
            if (b >= 0.0f) {
                if (ratingCompat.a == 2) {
                    if (b == 1.0f) {
                        almd = almd.a;
                        break Label_0046;
                    }
                }
                almd = almd.b;
            }
            else {
                almd = almd.c;
            }
        }
        final gtx f = this.f;
        final String s = this.h.U().s();
        gty gty;
        if (s == null) {
            gty = gty.a;
        }
        else if (!((zki)f.a).t()) {
            gty = gty.c;
        }
        else {
            ((tox)f.b).b();
            final fcb fcb = new fcb(f, 12);
            final Runnable a = afua.a;
            final vpm b2 = ((vup)f.d).b(((zki)f.a).c());
            final int ordinal = almd.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    final vpo d = b2.d();
                    d.i();
                    d.z(s);
                    tcp.l(b2.j(d, (Executor)f.g), (Executor)f.g, (tcn)fcb, (tco)new fct(f, s, almd, 9), a);
                }
                else {
                    final vpk a2 = b2.a();
                    a2.i();
                    a2.z(s);
                    tcp.l(b2.f(a2, (Executor)f.g), (Executor)f.g, (tcn)fcb, (tco)new fct(f, s, almd, 8), a);
                }
            }
            else {
                final vpl b3 = b2.b();
                b3.i();
                b3.z(s);
                tcp.l(b2.h(b3, (Executor)f.g), (Executor)f.g, (tcn)fcb, (tco)new fct(f, s, almd, 7), a);
            }
            gty = gty.a;
        }
        this.t("onSetRating()", gty);
    }
    
    public final void j() {
        final qbo h = this.h;
        gty gty;
        if (!h.V()) {
            gty = gty.c;
        }
        else {
            h.S().j();
            gty = gty.a;
        }
        this.t("onSkipToNext()", gty);
    }
    
    public final void k() {
        final qbo h = this.h;
        gty gty;
        if (!h.V()) {
            gty = gty.c;
        }
        else {
            h.S().k();
            gty = gty.a;
        }
        this.t("onSkipToPrevious()", gty);
    }
    
    public final void l() {
        final qbo h = this.h;
        h.U().Q();
        h.U().ak(26);
        this.t("onStop()", gty.a);
    }
    
    public final void o() {
        this.t("onPlayFromMediaId()", gty.b);
    }
    
    public final void p() {
        this.t("onPlayFromSearch()", gty.b);
    }
    
    public final void q() {
        this.t("onPrepareFromMediaId()", gty.b);
    }
    
    public final void r() {
        this.t("onPrepareFromSearch()", gty.b);
    }
    
    public final void s() {
        this.t("onPrepareFromUri()", gty.b);
    }
    
    public final void t(final String s, final gty gty) {
        if (!gty.d) {
            return;
        }
        final String string = gty.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" : ");
        sb.append(string);
        trn.b(sb.toString());
        final eg eg = (eg)this.e.a();
        final ej ej = new ej();
        agot.D(gty.d);
        final int e = gty.e;
        agot.D(gty.d);
        final String f = gty.f;
        ej.b = e;
        ej.c = f;
        ej.d(7, 0L, 1.0f);
        eg.i(ej.a());
    }
}
