import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import java.util.List;
import android.widget.RatingBar;
import android.widget.TextView;
import app.revanced.integrations.patches.HideHomeAdsPatch;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjp implements acko
{
    private final fyt a;
    private final View b;
    private final kjn c;
    private final kjn d;
    private kjn e;
    
    protected kjp(final Context context, final acgs acgs, final vcy vcy, final acpn acpn, final rzy rzy, final oyy oyy, final vgy vgy, final hyx hyx, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        final View inflate = LayoutInflater.from(context).inflate(2131625108, viewGroup, false);
        this.b = inflate;
        this.c = new kjn(context, acgs, vcy, acpn, rzy, oyy, vgy, hyx, inflate, 2131430690, null, null, null, null, null);
        this.d = new kjn(context, acgs, vcy, acpn, rzy, oyy, vgy, hyx, inflate, 2131430692, null, null, null, null, null);
        inflate.setBackground((Drawable)(this.a = kkx.h(context)));
    }
    
    @Override
    public final View a() {
        return this.b;
    }
    
    @Override
    public final void c(final acku acku) {
        final kjn e = this.e;
        if (e != null) {
            ((kki)e.m).c();
            this.e = null;
        }
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final anor anor = (anor)o;
        anor.getClass();
        this.e = null;
        Label_0134: {
            if ((anor.b & 0x800) != 0x0) {
                anoq anoq;
                if ((anoq = anor.o) == null) {
                    anoq = anoq.a;
                }
                final int cs = aqsx.cs(anoq.b);
                while (true) {
                    Label_0084: {
                        if (cs == 0) {
                            break Label_0084;
                        }
                        if (cs != 3) {
                            break Label_0084;
                        }
                        final kjn e = this.c;
                        this.e = e;
                        break Label_0134;
                    }
                    anoq anoq2;
                    if ((anoq2 = anor.o) == null) {
                        anoq2 = anoq.a;
                    }
                    final int cs2 = aqsx.cs(anoq2.b);
                    if (cs2 != 0) {
                        if (cs2 == 2) {
                            final kjn e = this.d;
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        final kjn e2 = this.e;
        if (e2 != null) {
            if (e2.n == null) {
                e2.n = e2.d.inflate();
                e2.o = e2.n.findViewById(2131428429);
                e2.p = e2.n.findViewById(2131428216);
                e2.x = (ImageView)e2.o.findViewById(2131432009);
                e2.y = e2.o.findViewById(2131428448);
                final View o2 = e2.o;
                HideHomeAdsPatch.HideHomeAds(o2);
                e2.q = (TextView)o2.findViewById(2131427495);
                e2.r = (TextView)e2.o.findViewById(2131432095);
                e2.s = (TextView)e2.o.findViewById(2131430780);
                e2.t = (RatingBar)e2.o.findViewById(2131430772);
                e2.u = (TextView)e2.o.findViewById(2131427946);
                e2.v = (TextView)e2.o.findViewById(2131428624);
                e2.w = (TextView)e2.o.findViewById(2131427439);
                tpe.r(e2.o, (Drawable)null);
                e2.y.setBackground((Drawable)null);
                e2.m = new kmh(e2.e, e2.g, e2.A, e2.i, e2.j, e2.B, e2.n, e2.o, e2.p, e2.y, e2.k, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            final kmh m = e2.m;
            final wyw a = ackm.a;
            final String r = anor.r;
            final ahbx i = anor.i;
            aiqj aiqj;
            if ((aiqj = anor.h) == null) {
                aiqj = aiqj.a;
            }
            final long n = anor.n;
            final long j = anor.m;
            ahmo ahmo;
            if ((anor.b & 0x1000) != 0x0) {
                if ((ahmo = anor.p) == null) {
                    ahmo = ahmo.a;
                }
            }
            else {
                ahmo = null;
            }
            m.w(a, (Object)anor, r, (List)i, aiqj, n, j, ahmo, anor.q.I());
            if ((anor.b & 0x1) != 0x0) {
                final acgs f = e2.f;
                final ImageView x = e2.x;
                aotp aotp;
                if ((aotp = anor.c) == null) {
                    aotp = aotp.a;
                }
                f.g(x, aotp);
                e2.x.setVisibility(0);
            }
            else {
                e2.x.setVisibility(8);
            }
            if ((anor.b & 0x800) != 0x0) {
                anoq anoq3;
                if ((anoq3 = anor.o) == null) {
                    anoq3 = anoq.a;
                }
                int n2;
                if (anoq3.c > 0L) {
                    anoq anoq4;
                    if ((anoq4 = anor.o) == null) {
                        anoq4 = anoq.a;
                    }
                    n2 = (int)anoq4.c;
                }
                else {
                    n2 = 40;
                }
                final int n3 = (int)TypedValue.applyDimension(1, (float)n2, e2.l.getDisplayMetrics());
                e2.x.getLayoutParams().height = n3;
                e2.x.getLayoutParams().width = n3;
            }
            anop anop;
            if ((anop = anor.l) == null) {
                anop = anop.a;
            }
            if ((anop.b & 0x1) != 0x0) {
                e2.q.setVisibility(0);
            }
            else {
                e2.q.setVisibility(8);
            }
            if ((anor.b & 0x2) != 0x0) {
                final TextView r2 = e2.r;
                ajut ajut;
                if ((ajut = anor.d) == null) {
                    ajut = ajut.a;
                }
                r2.setText((CharSequence)acak.b(ajut));
                e2.r.setVisibility(0);
            }
            else {
                e2.r.setVisibility(8);
            }
            final float e3 = anor.e;
            if (Float.compare(e3, 0.0f) > 0) {
                float rating = e3;
                if (Float.compare(e3, 5.0f) > 0) {
                    rating = 5.0f;
                }
                final TextView s = e2.s;
                if (s != null) {
                    s.setVisibility(0);
                    e2.s.setText((CharSequence)String.format("%1.1f", rating));
                }
                e2.t.setVisibility(0);
                e2.t.setRating(rating);
            }
            else {
                final TextView s2 = e2.s;
                if (s2 != null) {
                    s2.setVisibility(8);
                }
                e2.t.setVisibility(8);
            }
            if ((anor.b & 0x8) != 0x0) {
                final TextView u = e2.u;
                ajut ajut2;
                if ((ajut2 = anor.f) == null) {
                    ajut2 = ajut.a;
                }
                u.setText((CharSequence)acak.b(ajut2));
                e2.u.setVisibility(0);
            }
            else {
                e2.u.setVisibility(8);
            }
            if ((anor.b & 0x10) != 0x0) {
                final TextView v = e2.v;
                ajut ajut3;
                if ((ajut3 = anor.g) == null) {
                    ajut3 = ajut.a;
                }
                v.setText((CharSequence)acak.b(ajut3));
                e2.v.setVisibility(0);
            }
            else {
                e2.v.setVisibility(8);
            }
            aida aida;
            if ((aida = anor.j) == null) {
                aida = aida.a;
            }
            if ((aida.b & 0x1) != 0x0) {
                final TextView w = e2.w;
                aida aida2;
                if ((aida2 = anor.j) == null) {
                    aida2 = aida.a;
                }
                aicz aicz;
                if ((aicz = aida2.c) == null) {
                    aicz = aicz.a;
                }
                ajut ajut4;
                if ((aicz.b & 0x200) != 0x0) {
                    aida aida3;
                    if ((aida3 = anor.j) == null) {
                        aida3 = aida.a;
                    }
                    aicz aicz2;
                    if ((aicz2 = aida3.c) == null) {
                        aicz2 = aicz.a;
                    }
                    if ((ajut4 = aicz2.i) == null) {
                        ajut4 = ajut.a;
                    }
                }
                else {
                    ajut4 = null;
                }
                w.setText((CharSequence)acak.b(ajut4));
                final TextView w2 = e2.w;
                aida aida4;
                if ((aida4 = anor.j) == null) {
                    aida4 = aida.a;
                }
                aicz aicz3;
                if ((aicz3 = aida4.c) == null) {
                    aicz3 = aicz.a;
                }
                int aa;
                if (aicz3.c != 1 || (aa = aefb.aa((int)aicz3.d)) == 0) {
                    aa = 1;
                }
                if (aa - 1 != 13) {
                    w2.setTextColor(e2.b);
                    if (e2.z == null) {
                        e2.z = (Drawable)new ColorDrawable(e2.c);
                    }
                    w2.setBackground(e2.z);
                }
                else {
                    w2.setTextColor(e2.a);
                    w2.setBackground((Drawable)null);
                }
                e2.w.setVisibility(0);
            }
            else {
                e2.w.setVisibility(8);
            }
            amgv amgv;
            if ((amgv = anor.k) == null) {
                amgv = amgv.a;
            }
            if ((amgv.b & 0x1) != 0x0) {
                final acpn h = e2.h;
                final View rootView = e2.n.getRootView();
                final View y = e2.y;
                amgv amgv2;
                if ((amgv2 = anor.k) == null) {
                    amgv2 = amgv.a;
                }
                amgs amgs;
                if ((amgs = amgv2.c) == null) {
                    amgs = amgs.a;
                }
                h.f(rootView, y, amgs, (Object)anor, ackm.a);
                e2.y.setClickable(false);
                e2.y.setVisibility(0);
            }
            else {
                e2.y.setVisibility(8);
            }
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
    }
}
