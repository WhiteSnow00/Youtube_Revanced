import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.Executor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absi implements asmi
{
    public final Object a;
    private final int b;
    
    public absi(final absl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absi(final abtg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absi(final abtj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absi(final abtl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absi(final aslm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object a) {
        switch (this.b) {
            default: {
                final Object a2 = this.a;
                final ablo ablo = (ablo)a;
                final abtl abtl = (abtl)a2;
                final antf c = abtl.c(abtl.t);
                final zbx q = abtl.q;
                if (ablo.i == 4 && abtl.a != null && q != null && c.e) {
                    q.y(ablo.g, ablo.f);
                    return;
                }
                break;
            }
            case 19: {
                final Object a3 = this.a;
                final aapt aapt = (aapt)a;
                final zbx q2 = ((abtl)a3).q;
                if (q2 != null) {
                    final int a4 = aapt.a();
                    if (a4 != 2) {
                        if (a4 == 3) {
                            q2.v();
                            return;
                        }
                        if (a4 == 5) {
                            q2.o();
                            return;
                        }
                        if (a4 == 6) {
                            q2.w();
                            return;
                        }
                        if (a4 == 7) {
                            q2.q();
                            return;
                        }
                        if (a4 == 9 || a4 == 10) {
                            q2.A();
                        }
                    }
                    else {
                        q2.z();
                    }
                }
                return;
            }
            case 18: {
                final Object a5 = this.a;
                final yre yre = (yre)a;
                final zbx q3 = ((abtl)a5).q;
                if (q3 != null) {
                    q3.r(yre);
                }
                return;
            }
            case 17: {
                final Object a6 = this.a;
                final aanv aanv = (aanv)a;
                final zbx q4 = ((abtl)a6).q;
                if (aanv.c() && q4 != null) {
                    q4.C(aanv.b());
                    return;
                }
                if (q4 != null) {
                    q4.t(aanv.b());
                }
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final aaph aaph = (aaph)a;
                final zbx q5 = ((abtl)a7).q;
                if (q5 != null) {
                    q5.p(aaph.b(), aaph.i(), aaph.j(), aaph.e(), aaph.f(), aaph.g(), aaph.h());
                }
                return;
            }
            case 15: {
                final Object a8 = this.a;
                final Throwable t = (Throwable)a;
                final zbx q6 = ((abtl)a8).q;
                if (q6 != null) {
                    q6.u(new zdk(zdj.a, "rx", 0L, t));
                    return;
                }
                znh.c(zng.b, znf.j, "QoeStatsMonitor failed unexpectedly.", t);
                return;
            }
            case 14: {
                final Object a9 = this.a;
                final aany aany = (aany)a;
                final zbx q7 = ((abtl)a9).q;
                if (q7 != null) {
                    q7.j(aany.a());
                }
                return;
            }
            case 13: {
                final Object a10 = this.a;
                final aapq aapq = (aapq)a;
                final zbx q8 = ((abtl)a10).q;
                if (q8 != null) {
                    q8.D(aapq.j(), aapq.g(), aapq.a());
                }
                return;
            }
            case 12: {
                final Object a11 = this.a;
                final ablo ablo2 = (ablo)a;
                final abtl abtl2 = (abtl)a11;
                final antf c2 = abtl.c(abtl2.t);
                final zbx q9 = abtl2.q;
                if (ablo2.i == 4 && abtl2.a != null && q9 != null && c2.e) {
                    q9.y(ablo2.g, ablo2.f);
                }
                return;
            }
            case 11: {
                final Object a12 = this.a;
                final aaoc aaoc = (aaoc)a;
                final abtl abtl3 = (abtl)a12;
                final zbx q10 = abtl3.q;
                if (q10 != null) {
                    if (abtl3.b()) {
                        q10.s("dedi", (zbq)new abti(abtl3, 3));
                    }
                    q10.x();
                }
                return;
            }
            case 10: {
                final Object a13 = this.a;
                final zdk zdk = (zdk)a;
                final zbx q11 = ((abtl)a13).q;
                if (q11 != null) {
                    q11.u(zdk);
                }
                return;
            }
            case 9: {
                final Object a14 = this.a;
                final aneq aneq = (aneq)a;
                final zbx q12 = ((abtl)a14).q;
                if (q12 != null) {
                    q12.F(aneq.n);
                }
                return;
            }
            case 8: {
                final Object a15 = this.a;
                final aaph aaph2 = (aaph)a;
                final String d = aaph2.d();
                if (d != null) {
                    final abtj abtj = (abtj)a15;
                    if (abtj.b.containsKey(d)) {
                        ((zbx)abtj.b.get(d)).p(aaph2.b(), aaph2.i(), aaph2.j(), aaph2.e(), aaph2.f(), aaph2.g(), aaph2.h());
                    }
                }
                return;
            }
            case 7: {
                final Object a16 = this.a;
                final int intValue = (int)a;
                final Iterator iterator = ((abtj)a16).b.values().iterator();
                while (iterator.hasNext()) {
                    ((zbx)iterator.next()).i(intValue);
                }
                return;
            }
            case 6: {
                final Object a17 = this.a;
                final aneq aneq2 = (aneq)a;
                final Iterator iterator2 = ((abtj)a17).b.values().iterator();
                while (iterator2.hasNext()) {
                    ((zbx)iterator2.next()).F(aneq2.n);
                }
                return;
            }
            case 5: {
                final Object a18 = this.a;
                final aaoe c3 = (aaoe)a;
                final abtj abtj2 = (abtj)a18;
                abtj2.c = c3;
                final Iterator iterator3 = abtj2.b.values().iterator();
                while (iterator3.hasNext()) {
                    abtj.t((zbx)iterator3.next(), c3);
                }
                return;
            }
            case 4: {
                final Object a19 = this.a;
                final aany aany2 = (aany)a;
                final Iterator iterator4 = ((abtj)a19).b.values().iterator();
                while (iterator4.hasNext()) {
                    ((zbx)iterator4.next()).j(aany2.a());
                }
                return;
            }
            case 3: {
                final Object a20 = this.a;
                final aapp aapp = (aapp)a;
                final abll c4 = aapp.c();
                final abll a21 = abll.a;
                final int ordinal = c4.ordinal();
                final String s = null;
                if (ordinal != 0) {
                    if (ordinal == 5 || ordinal == 8) {
                        PlayerResponseModel playerResponseModel;
                        if (aapp.c().h()) {
                            playerResponseModel = aapp.a();
                        }
                        else {
                            playerResponseModel = aapp.b();
                        }
                        if (playerResponseModel != null) {
                            final VideoStreamingData n = playerResponseModel.n();
                            Uri parse;
                            if (n != null && !n.b.j.isEmpty()) {
                                parse = Uri.parse(n.b.j);
                            }
                            else {
                                parse = null;
                            }
                            airi airi;
                            if ((airi = playerResponseModel.m().c.G) == null) {
                                airi = airi.a;
                            }
                            final int b = airi.b;
                            String s2;
                            if (aapp.a() != null) {
                                s2 = aapp.k();
                            }
                            else {
                                s2 = s;
                                if (aapp.b() != null) {
                                    s2 = aapp.e();
                                }
                            }
                            final String k = playerResponseModel.K();
                            final abtg abtg = (abtg)a20;
                            if (!k.equals(abtg.b)) {
                                abtg.b = k;
                                final aapu c5 = abtg.c;
                                final Executor executor = (Executor)((atnb)c5.c).a();
                                executor.getClass();
                                final zcj zcj = (zcj)((atnb)c5.b).a();
                                zcj.getClass();
                                final agpw agpw = (agpw)((atnb)c5.a).a();
                                agpw.getClass();
                                a = new abte(executor, zcj, agpw, parse, b, s2, null, null, null);
                                abtg.a = (abte)a;
                                if (((abte)a).c != null) {
                                    ((abte)a).a.execute((Runnable)new abgl((abte)a, 19));
                                }
                            }
                        }
                    }
                }
                else {
                    final abtg abtg2 = (abtg)a20;
                    abtg2.b = null;
                    final abte a22 = abtg2.a;
                    if (a22 != null) {
                        a22.e = true;
                        final Thread f = a22.f;
                        if (f != null) {
                            f.interrupt();
                        }
                        abtg2.a = null;
                    }
                }
                return;
            }
            case 2: {
                final Object a23 = this.a;
                final aanx aanx = (aanx)a;
                ((aslm)a23).dispose();
                return;
            }
            case 1: {
                final Object a24 = this.a;
                final abkd abkd = (abkd)a;
                ((absl)a24).p();
                return;
            }
            case 0: {
                ((absl)this.a).b((aany)a);
                break;
            }
        }
    }
}
