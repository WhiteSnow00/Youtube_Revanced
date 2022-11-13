import java.util.concurrent.Executor;
import android.support.v4.media.RatingCompat;
import android.util.Base64;
import android.os.Bundle;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gue extends dz
{
    public final atke e;
    private final gug f;
    private final wyw g;
    private final qcy h;
    
    public gue(final atke e, final qcy h, final gug f, final wyw g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void b() {
        this.h.S().b();
        this.t("onFastForward()", guh.a);
    }
    
    @Override
    public final void c() {
        this.t("onPause()", this.h.T());
    }
    
    @Override
    public final void d() {
        final qcy h = this.h;
        guh guh;
        if (!h.V()) {
            guh = guh.c;
        }
        else {
            h.S().d();
            guh = guh.a;
        }
        this.t("onPlay()", guh);
    }
    
    @Override
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
            this.g.b(xaa.b(22678), (aiqj)null, (alhi)null);
            final wyt wyt = new wyt(decode);
            this.g.D((wzz)wyt);
            this.g.J(3, (wzz)wyt, (alhi)null);
        }
        final qcy h = this.h;
        final guf guf = new guf(h, uri, decode, (byte[])null, (byte[])null, (byte[])null);
        final Object a = h.a;
        Uri build = uri;
        if (uri.getPath().equals("/playlist")) {
            build = uri.buildUpon().path("watch").build();
        }
        ((fjp)a).o(build, (String)null, (zpf)guf);
        ((asie)guf.a).aa((asjm)new gsa(this, 9));
    }
    
    @Override
    public final void f() {
        this.t("onPrepare()", this.h.T());
    }
    
    @Override
    public final void g() {
        this.h.S().g();
        this.t("onRewind()", guh.a);
    }
    
    @Override
    public final void h(final long n) {
        this.h.S().h(n);
        this.t("onSeekTo()", guh.a);
    }
    
    @Override
    public final void i(final RatingCompat ratingCompat) {
        final float b = ratingCompat.b;
        alog alog = null;
        Label_0046: {
            if (b >= 0.0f) {
                if (ratingCompat.a == 2) {
                    if (b == 1.0f) {
                        alog = alog.a;
                        break Label_0046;
                    }
                }
                alog = alog.b;
            }
            else {
                alog = alog.c;
            }
        }
        final gug f = this.f;
        final String s = this.h.U().s();
        guh guh;
        if (s == null) {
            guh = guh.a;
        }
        else if (!((zmf)f.a).t()) {
            guh = guh.c;
        }
        else {
            ((trc)f.b).b();
            final fcf fcf = new fcf(f, 12);
            final Runnable a = afwb.a;
            final vro b2 = ((vwa)f.d).b(((zmf)f.a).c());
            final int ordinal = alog.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    final vrq d = b2.d();
                    d.i();
                    d.z(s);
                    teu.l(b2.j(d, (Executor)f.g), (Executor)f.g, (tes)fcf, (tet)new fcy(f, s, alog, 9), a);
                }
                else {
                    final vrm a2 = b2.a();
                    a2.i();
                    a2.z(s);
                    teu.l(b2.f(a2, (Executor)f.g), (Executor)f.g, (tes)fcf, (tet)new fcy(f, s, alog, 8), a);
                }
            }
            else {
                final vrn b3 = b2.b();
                b3.i();
                b3.z(s);
                teu.l(b2.h(b3, (Executor)f.g), (Executor)f.g, (tes)fcf, (tet)new fcy(f, s, alog, 7), a);
            }
            guh = guh.a;
        }
        this.t("onSetRating()", guh);
    }
    
    @Override
    public final void j() {
        final qcy h = this.h;
        guh guh;
        if (!h.V()) {
            guh = guh.c;
        }
        else {
            h.S().j();
            guh = guh.a;
        }
        this.t("onSkipToNext()", guh);
    }
    
    @Override
    public final void k() {
        final qcy h = this.h;
        guh guh;
        if (!h.V()) {
            guh = guh.c;
        }
        else {
            h.S().k();
            guh = guh.a;
        }
        this.t("onSkipToPrevious()", guh);
    }
    
    @Override
    public final void l() {
        final qcy h = this.h;
        h.U().P();
        h.U().aj(26);
        this.t("onStop()", guh.a);
    }
    
    @Override
    public final void o() {
        this.t("onPlayFromMediaId()", guh.b);
    }
    
    @Override
    public final void p() {
        this.t("onPlayFromSearch()", guh.b);
    }
    
    @Override
    public final void q() {
        this.t("onPrepareFromMediaId()", guh.b);
    }
    
    @Override
    public final void r() {
        this.t("onPrepareFromSearch()", guh.b);
    }
    
    @Override
    public final void s() {
        this.t("onPrepareFromUri()", guh.b);
    }
    
    public final void t(final String s, final guh guh) {
        if (!guh.d) {
            return;
        }
        final String string = guh.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" : ");
        sb.append(string);
        ttr.b(sb.toString());
        final eg eg = (eg)this.e.a();
        final ej ej = new ej();
        adkp.Q(guh.d);
        final int e = guh.e;
        adkp.Q(guh.d);
        final String f = guh.f;
        ej.b = e;
        ej.c = f;
        ej.d(7, 0L, 1.0f);
        eg.i(ej.a());
    }
}
