import android.content.Context;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxk implements View$OnClickListener
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public hxk(final hiu b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hxk(final hxm b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hxk(final wfh b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final int c = this.c;
        final int n = 0;
        if (c == 0) {
            final Object b = this.b;
            final boolean a = this.a;
            final hxm hxm = (hxm)b;
            final xnm g = hxm.ak.g();
            if (g != null && g.a() != 0) {
                if (!hxm.ak.o()) {
                    final int ad = hxm.aD;
                    final int n2 = ad - 1;
                    if (ad == 0) {
                        throw null;
                    }
                    xab xab = null;
                    int n3 = 0;
                    Label_1009: {
                        xab xab2;
                        if (n2 != 1 && n2 != 2) {
                            if (n2 != 3 && n2 != 4 && n2 != 5) {
                                xab = null;
                                n3 = n;
                                break Label_1009;
                            }
                            if (ad == 5) {
                                if (a) {
                                    xab2 = xaa.c(29041);
                                }
                                else {
                                    xab2 = xaa.c(27431);
                                }
                            }
                            else if (a) {
                                xab2 = xaa.c(29042);
                            }
                            else {
                                xab2 = xaa.c(27429);
                            }
                            final abpl am = hxm.am;
                            final abjp d = PlaybackStartDescriptor.d();
                            d.a = hxm.aM(abkf.g(hxm.av, hxm.at, hxm.au, 0.0f), xab2);
                            am.d(d.a());
                        }
                        else {
                            if (a) {
                                xab2 = xaa.c(29037);
                            }
                            else {
                                xab2 = xaa.c(27427);
                            }
                            final String av = hxm.av;
                            if (av != null && av.equals(hxm.al.s())) {
                                if (!hxm.al.f()) {
                                    hxm.al.C();
                                    xab = xab2;
                                    n3 = n;
                                    break Label_1009;
                                }
                                final long aw = hxm.aw;
                                xab = xab2;
                                n3 = n;
                                if (aw > 0L) {
                                    hxm.al.Z(aw);
                                    xab = xab2;
                                    n3 = n;
                                }
                                break Label_1009;
                            }
                            else {
                                if (hxm.al.s() != null && hxm.al.s().equals(hxm.av)) {
                                    xab = xab2;
                                    n3 = n;
                                    if (hxm.al.f()) {
                                        break Label_1009;
                                    }
                                }
                                final abpl am2 = hxm.am;
                                final abjp d2 = PlaybackStartDescriptor.d();
                                d2.a = hxm.aM(abkf.g(hxm.av, (String)null, 0, (float)TimeUnit.MILLISECONDS.toSeconds(hxm.aw)), xab2);
                                am2.d(d2.a());
                            }
                        }
                        n3 = 1;
                        xab = xab2;
                    }
                    if (xab != null && n3 == 0) {
                        hxm.aB.J(3, (wzz)new wyt(xab), (alhi)null);
                    }
                    hxm.pO();
                    final ida ao = hxm.ao;
                    if (ao != null) {
                        ao.d(true);
                    }
                }
            }
            return;
        }
        if (c == 1) {
            final Object b2 = this.b;
            final boolean a2 = this.a;
            final hiu hiu = (hiu)b2;
            hiu.q.J(3, (wzz)new wyt(xaa.c(136521)), (alhi)null);
            if (a2) {
                hiu.H = true;
                hiu.j();
                hiu.k();
                hiu.i();
            }
            return;
        }
        if (c != 2) {
            final Object b3 = this.b;
            final boolean a3 = this.a;
            final wfh wfh = (wfh)b3;
            if (wfh.b.s()) {
                wfh.b.h();
                return;
            }
            final xra g2 = wfh.G;
            if (g2 != null) {
                g2.f();
            }
            wfh.P.s(wfh.Q, wfh.R, false, a3);
            if (!(boolean)wfh.S.bM().aM()) {
                ((wfa)b3).q().setVisibility(8);
            }
        }
        else {
            final Object b4 = this.b;
            final boolean a4 = this.a;
            final hxm hxm2 = (hxm)b4;
            final xnm g3 = hxm2.ak.g();
            if (g3 == null || g3.a() == 0 || hxm2.ak.o()) {
                return;
            }
            final int ad2 = hxm2.aD;
            final int n4 = ad2 - 1;
            if (ad2 == 0) {
                throw null;
            }
            xab xab3 = null;
            Label_0341: {
                if (n4 != 1 && n4 != 2) {
                    if (n4 != 3 && n4 != 4) {
                        if (n4 != 5) {
                            xab3 = null;
                            break Label_0341;
                        }
                    }
                    else if (ad2 == 5) {
                        if (a4) {
                            xab3 = xaa.c(29039);
                            break Label_0341;
                        }
                        xab3 = xaa.c(27432);
                        break Label_0341;
                    }
                    else {
                        if (a4) {
                            xab3 = xaa.c(29040);
                            break Label_0341;
                        }
                        xab3 = xaa.c(27430);
                        break Label_0341;
                    }
                }
                if (ad2 == 6) {
                    if (a4) {
                        xab3 = xaa.c(29040);
                    }
                    else {
                        xab3 = xaa.c(27430);
                    }
                }
                else if (a4) {
                    xab3 = xaa.c(29038);
                }
                else {
                    xab3 = xaa.c(27428);
                }
            }
            if (xab3 != null) {
                hxm2.aB.J(3, (wzz)new wyt(xab3), (alhi)null);
            }
            final int ad3 = hxm2.aD;
            final int n5 = ad3 - 1;
            if (ad3 != 0) {
                Label_0491: {
                    if (n5 != 1 && n5 != 2) {
                        if (n5 != 3 && n5 != 4) {
                            if (n5 != 5) {
                                break Label_0491;
                            }
                        }
                        else {
                            if (g3.a() == 1) {
                                g3.w(hxm2.at);
                                if (hxm2.aC && hxm2.ar.c()) {
                                    hxm2.aq.s(1, 1);
                                }
                                tpe.x((Context)hxm2.od(), 2132020163, 0);
                            }
                            break Label_0491;
                        }
                    }
                    hxm2.ax = false;
                    hxm2.aO(hxm2.az);
                }
                hxm2.pO();
                return;
            }
            throw null;
        }
    }
}
