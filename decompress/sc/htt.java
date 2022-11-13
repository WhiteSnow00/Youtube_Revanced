import android.text.Spanned;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htt implements ttg
{
    public final EditVideoActivity a;
    public final ahaz b;
    
    public htt(final EditVideoActivity a, final ahaz b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        final EditVideoActivity a = this.a;
        final ahaz b = this.b;
        final akuj akuj = (akuj)o;
        akuj.getClass();
        a.C.b(true);
        Label_0401: {
            if ((akuj.b & 0x4) != 0x0) {
                akum akum;
                if ((akum = akuj.d) == null) {
                    akum = akum.a;
                }
                final int bj = adyf.bj(akum.c);
                if (bj != 0) {
                    if (bj != 1) {
                        break Label_0401;
                    }
                }
                final arwh ag = a.ag;
                if (ag != null && ag.f() != null) {
                    apin apin;
                    if ((apin = a.ag.f().h) == null) {
                        apin = apin.a;
                    }
                    if (apin.e) {
                        final akui akui = (akui)b.build();
                        akui.getClass();
                        if (a.z) {
                            return;
                        }
                        final int b2 = akui.b;
                        final int n = b2 & 0x40;
                        if (n == 0) {
                            if ((b2 & 0x200) == 0x0) {
                                a.p();
                                return;
                            }
                        }
                        Object o2;
                        if (n != 0) {
                            akud akud;
                            if ((akud = akui.g) == null) {
                                akud = akud.a;
                            }
                            o2 = aezp.k((Object)akud.c);
                        }
                        else {
                            o2 = aeyo.a;
                        }
                        Object o3 = aeyo.a;
                        if ((akui.b & 0x200) != 0x0) {
                            aktx aktx;
                            if ((aktx = akui.j) == null) {
                                aktx = aktx.a;
                            }
                            int cu;
                            if ((cu = aqsx.cu(aktx.c)) == 0) {
                                cu = 1;
                            }
                            if (--cu != 1) {
                                if (cu != 2) {
                                    o3 = aezp.k((Object)admy.a);
                                }
                                else {
                                    o3 = aezp.k((Object)admy.c);
                                }
                            }
                            else {
                                o3 = aezp.k((Object)admy.b);
                            }
                        }
                        final adpp h = a.H;
                        afwm.w(afwm.r((afty)new phf(h, a.x, a.j.c(), (aezp)o2, (aezp)o3, 4, (byte[])null), h.c), (afva)new npp(h, 16, (byte[])null), (Executor)afum.a);
                        a.p();
                        return;
                    }
                }
                a.p();
                return;
            }
        }
        akum akum2;
        if ((akum2 = akuj.d) == null) {
            akum2 = akum.a;
        }
        if (akum2 != null) {
            ajut ajut;
            if ((ajut = akum2.d) == null) {
                ajut = ajut.a;
            }
            Object o4;
            if (TextUtils.isEmpty((CharSequence)(o4 = acak.b(ajut)))) {
                o4 = a.getResources().getString(2132017993);
            }
            final gbv d = gbx.d();
            d.c(0);
            d.k((CharSequence)o4);
            ajut ajut2;
            if ((ajut2 = akum2.e) == null) {
                ajut2 = ajut.a;
            }
            final Spanned b3 = acak.b(ajut2);
            if ((akum2.b & 0x8) != 0x0 && !TextUtils.isEmpty((CharSequence)b3)) {
                ((acwc)d).m((CharSequence)b3, (View$OnClickListener)new hqd(a, akum2, 7));
            }
            a.B = d.a();
            a.m.n((acwd)a.B);
        }
    }
}
