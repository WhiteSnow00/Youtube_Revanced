import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.List;
import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import java.util.Locale;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.search.OnlineSearchController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgq implements jkk
{
    public final String a;
    public final /* synthetic */ OnlineSearchController b;
    private final boolean c;
    private final boolean d;
    
    public jgq(final OnlineSearchController b, final String a, final boolean c, final boolean d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final akww akww, final acvr acvr) {
        if (gkt.aw(this.b.S) && this.b.r.t(alku.K)) {
            this.b.r.y("voz_rfp", alku.K);
        }
        akxg l = null;
        String s = null;
        if (akww != null) {
            if (!TextUtils.isEmpty((CharSequence)this.b.x.bk()) && !this.b.y.cj() && akww.d > 0L) {
                if ((akww.b & 0x2000) == 0x0) {
                    final String bk = this.b.x.bk();
                    int n = 0;
                    Label_0234: {
                        switch (bk.hashCode()) {
                            case 1943405895: {
                                if (bk.equals("showing_results_for_alternative_hindi")) {
                                    n = 0;
                                    break Label_0234;
                                }
                                break;
                            }
                            case 107944136: {
                                if (bk.equals("query")) {
                                    n = 3;
                                    break Label_0234;
                                }
                                break;
                            }
                            case -1114178700: {
                                if (bk.equals("here_are_some_results_about_alternative_hindi")) {
                                    n = 2;
                                    break Label_0234;
                                }
                                break;
                            }
                            case -1997765901: {
                                if (bk.equals("here_are_some_results_about")) {
                                    n = 1;
                                    break Label_0234;
                                }
                                break;
                            }
                        }
                        n = -1;
                    }
                    Integer n2 = null;
                    Label_0341: {
                        if (n != 0) {
                            if (n == 1) {
                                n2 = 2132018153;
                                break Label_0341;
                            }
                            if (n != 2) {
                                if (n != 3) {
                                    n2 = 2132019816;
                                    break Label_0341;
                                }
                                n2 = null;
                                break Label_0341;
                            }
                            else {
                                if (!Locale.getDefault().equals(OnlineSearchController.a)) {
                                    n2 = 2132018153;
                                    break Label_0341;
                                }
                                n2 = 2132018154;
                            }
                        }
                        else {
                            if (!Locale.getDefault().equals(OnlineSearchController.a)) {
                                n2 = 2132019816;
                                break Label_0341;
                            }
                            n2 = 2132019817;
                        }
                        s = "hi-IN";
                    }
                    if (s != null) {
                        this.b.i(n2, this.a, s);
                    }
                    else {
                        tcp.k(this.b.C.F(), (Executor)afsl.a, (tcn)new etc(this, n2, 7), (tco)new jma(this, n2, 1));
                    }
                }
            }
            this.b.w.mX((Object)vtb.p(akww));
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asjg.b((AtomicReference)this.b.y.l(45362020L).aw((Object)false).Z((asix)new jcp(atomicBoolean, 5)));
            if (atomicBoolean.get()) {
                final jkl b = this.b.b;
                b.c = new byte[0];
                b.d = "";
                b.e = false;
            }
            return;
        }
        if (this.d) {
            this.b.r.y("sr_s", alku.K);
        }
        else {
            this.b.r.y("sr_s", alku.J);
        }
        alvs alvs;
        if ((alvs = this.b.S.f().e) == null) {
            alvs = alvs.a;
        }
        String b2;
        if (alvs.ar) {
            b2 = ((SuggestVideoStateSubscriber)this.b.o.a()).b;
        }
        else {
            b2 = null;
        }
        final OnlineSearchController b3 = this.b;
        final vte h = b3.h;
        final aioe i = b3.I;
        final String a = this.a;
        if (a != null) {
            akws akws;
            if (b3.K == null) {
                akws = null;
            }
            else {
                final agza builder = ((agzi)akws.a).createBuilder();
                final List r = ((jgv)b3).r();
                builder.copyOnWrite();
                final akws akws2 = (akws)builder.instance;
                final agzy b4 = akws2.b;
                if (!b4.c()) {
                    akws2.b = agzi.mutableCopy(b4);
                }
                agxl.addAll((Iterable)r, (List)akws2.b);
                akws = (akws)builder.build();
            }
            if (!this.c) {
                l = this.b.L;
            }
            final jkm jkm = new jkm(a, h, i, l, akws, b2, acvr.a, acvr.b, this.b.M);
            final vtc d = jkm.b.d();
            if (!TextUtils.isEmpty((CharSequence)jkm.a)) {
                d.w(jkm.a);
            }
            final aioe c = jkm.c;
            if (c != null && ((agzd)c).rs((agyr)SearchEndpointOuterClass.searchEndpoint)) {
                final anvb anvb = (anvb)((agzd)jkm.c).rr((agyr)SearchEndpointOuterClass.searchEndpoint);
                if (TextUtils.isEmpty((CharSequence)jkm.a)) {
                    d.w(anvb.c);
                }
                if (!anvb.d.isEmpty()) {
                    d.b = vtc.g(anvb.d);
                }
                if (!anvb.f.isEmpty()) {
                    d.c = vtc.g(anvb.f);
                }
            }
            final akws e = jkm.e;
            if (e != null) {
                d.e = e;
            }
            final akxg d2 = jkm.d;
            if (d2 != null) {
                d.d = d2;
            }
            if (!TextUtils.isEmpty((CharSequence)jkm.f)) {
                d.y = jkm.f;
            }
            if (!TextUtils.isEmpty((CharSequence)jkm.i)) {
                d.C = jkm.i;
            }
            ((vii)d).k(gkt.V(jkm.c));
            ((vii)d).m = false;
            d.A = jkm.g;
            d.B = jkm.h;
            if ((this.b.p.e(tlq.am) & 0x4L) != 0x0L) {
                ((vii)d).v = tjq.d;
            }
            final OnlineSearchController b5 = this.b;
            ((vkk)b5.h.d).i((vjn)d, (znj)b5.w);
            return;
        }
        throw new NullPointerException("Null query");
    }
}
