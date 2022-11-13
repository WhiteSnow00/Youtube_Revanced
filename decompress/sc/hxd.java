import android.widget.TextView;
import android.support.v7.widget.SwitchCompat;
import android.view.View$OnClickListener;
import java.util.Collection;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hxd implements zpf
{
    final hxe a;
    
    public hxd(final hxe a) {
        this.a = a;
    }
    
    public final void a(final dbj dbj) {
        final hxe a = this.a;
        a.aj.b((CharSequence)a.a.b((Throwable)dbj), true);
    }
    
    public final /* bridge */ void mX(final Object o) {
        final akye akye = (akye)o;
        akyf akyf;
        if ((akyf = akye.e) == null) {
            akyf = akyf.a;
        }
        if (akyf.b == 78398567) {
            final hxe a = this.a;
            akyf akyf2;
            if ((akyf2 = akye.e) == null) {
                akyf2 = akyf.a;
            }
            anjx a2;
            if (akyf2.b == 78398567) {
                a2 = (anjx)akyf2.c;
            }
            else {
                a2 = anjx.a;
            }
            a.ah = hxw.c(a2);
            final hxe a3 = this.a;
            final anjt ah = a3.ah;
            if (ah != null) {
                final jvm ak = a3.ak;
                ak.r = ah;
                final int n = ah.b & 0x2;
                if (n != 0) {
                    ak.c.setVisibility(0);
                    ak.b();
                    anjn anjn;
                    if ((anjn = ah.d) == null) {
                        anjn = anjn.a;
                    }
                    final SwitchCompat e = ak.e;
                    final int b = anjn.b;
                    final aicz aicz = null;
                    ajut ajut;
                    if ((b & 0x2) != 0x0) {
                        if ((ajut = anjn.c) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    e.setText((CharSequence)acak.b(ajut));
                    final boolean b2 = anjn.d ^ true;
                    ak.p = b2;
                    ak.e.setChecked(b2);
                    ak.d(ak.p);
                    ak.e.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfm(ak, 11));
                    anjo anjo;
                    if ((anjo = ah.e) == null) {
                        anjo = anjo.a;
                    }
                    final TextView f = ak.f;
                    ajut ajut2;
                    if ((anjo.b & 0x2) != 0x0) {
                        if ((ajut2 = anjo.d) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    f.setText((CharSequence)acak.b(ajut2));
                    if (anjo.c.size() == 0) {
                        ak.f.setVisibility(0);
                        ak.g.setVisibility(8);
                    }
                    else {
                        ((tfz)ak.q).clear();
                        ((tfz)ak.q).addAll((Collection)anjo.c);
                        ak.g.setVisibility(0);
                        ak.f.setVisibility(8);
                    }
                    final TextView h = ak.h;
                    ajut ajut3;
                    if ((ah.b & 0x80) != 0x0) {
                        if ((ajut3 = ah.f) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    h.setText((CharSequence)acak.b(ajut3));
                    final TextView i = ak.i;
                    anjr anjr;
                    if ((anjr = ah.g) == null) {
                        anjr = anjr.a;
                    }
                    aicz aicz2;
                    if ((aicz2 = anjr.c) == null) {
                        aicz2 = aicz.a;
                    }
                    ajut ajut4;
                    if ((aicz2.b & 0x200) != 0x0) {
                        anjr anjr2;
                        if ((anjr2 = ah.g) == null) {
                            anjr2 = anjr.a;
                        }
                        aicz aicz3;
                        if ((aicz3 = anjr2.c) == null) {
                            aicz3 = aicz.a;
                        }
                        if ((ajut4 = aicz3.i) == null) {
                            ajut4 = ajut.a;
                        }
                    }
                    else {
                        ajut4 = null;
                    }
                    i.setText((CharSequence)acak.b(ajut4));
                    ak.i.setOnClickListener((View$OnClickListener)new jux(ak, 3));
                    final TextView k = ak.k;
                    ajut ajut5;
                    if ((ah.b & 0x2000) != 0x0) {
                        if ((ajut5 = ah.l) == null) {
                            ajut5 = ajut.a;
                        }
                    }
                    else {
                        ajut5 = null;
                    }
                    k.setText((CharSequence)acak.b(ajut5));
                    final gld l = ak.l;
                    final anjr j = ah.i;
                    anjr a4;
                    if (j == null) {
                        a4 = anjr.a;
                    }
                    else {
                        a4 = j;
                    }
                    aicz aicz4;
                    if ((a4.b & 0x1) != 0x0) {
                        anjr a5;
                        if ((a5 = j) == null) {
                            a5 = anjr.a;
                        }
                        if ((aicz4 = a5.c) == null) {
                            aicz4 = aicz.a;
                        }
                    }
                    else {
                        aicz4 = null;
                    }
                    ((acsx)l).b(aicz4, ak.d);
                    final TextView m = ak.m;
                    ajut ajut6;
                    if ((ah.b & 0x200) != 0x0) {
                        if ((ajut6 = ah.h) == null) {
                            ajut6 = ajut.a;
                        }
                    }
                    else {
                        ajut6 = null;
                    }
                    m.setText((CharSequence)acak.b(ajut6));
                    final anjr j2 = ah.j;
                    anjr a6;
                    if (j2 == null) {
                        a6 = anjr.a;
                    }
                    else {
                        a6 = j2;
                    }
                    aicz aicz5 = aicz;
                    if ((a6.b & 0x1) != 0x0) {
                        anjr a7;
                        if ((a7 = j2) == null) {
                            a7 = anjr.a;
                        }
                        if ((aicz5 = a7.c) == null) {
                            aicz5 = aicz.a;
                        }
                    }
                    ((acsx)ak.n).b(aicz5, ak.d);
                    ((acsx)ak.n).c = (acsw)new ezm(ak, 16);
                    anjn anjn2;
                    if ((anjn2 = ah.d) == null) {
                        anjn2 = anjn.a;
                    }
                    if (!anjn2.d && ah.k) {
                        ak.i.performClick();
                    }
                }
                else {
                    if (n == 0) {
                        ttr.b("Missing PlaylistContributionState for playlist collaboration settings page to work.");
                    }
                    ak.c.setVisibility(8);
                }
            }
        }
        final hxe a8 = this.a;
        a8.ai = a8.o();
        ((fzf)this.a.af.a()).l();
        this.a.aj.a();
    }
    
    public final void mY() {
    }
}
