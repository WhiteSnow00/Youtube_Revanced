import java.util.Iterator;
import android.text.Spanned;
import java.util.List;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnLayoutChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khm extends acld
{
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final vai G;
    private final arwh H;
    public final TextView a;
    public heo b;
    private final Context c;
    private final acgs d;
    private final vcy e;
    private final ackr f;
    private final isn g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final acpn n;
    private final ChipCloudView o;
    private final CompoundButton p;
    private final Resources q;
    private final aaoq r;
    private aodm s;
    private final ackk t;
    private final int u;
    private final int v;
    private final int x;
    private final int y;
    private final int z;
    
    public khm(final Context c, final gjh f, final acgs d, final vcy e, final acpn n, final isn g, final arwh h, final vai g2, final byte[] array, final byte[] array2) {
        this.t = new ackk(e, (ackr)f);
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.f = (ackr)f;
        n.getClass();
        this.n = n;
        g.getClass();
        this.g = g;
        this.H = h;
        this.G = g2;
        final Resources resources = c.getResources();
        this.q = resources;
        this.u = resources.getDimensionPixelSize(2131169561);
        this.v = resources.getDimensionPixelSize(2131169549);
        this.x = resources.getDimensionPixelSize(2131169556);
        this.y = resources.getDimensionPixelSize(2131169560);
        this.z = resources.getDimensionPixelSize(2131169548);
        this.A = resources.getDimensionPixelSize(2131169550);
        this.B = resources.getDimensionPixelSize(2131169554);
        this.C = resources.getDimensionPixelSize(2131169557);
        this.D = resources.getDimensionPixelSize(2131169555);
        this.E = resources.getDimensionPixelSize(2131169552);
        this.F = resources.getDimensionPixelSize(2131169553);
        final View inflate = View.inflate(c, 2131625381, (ViewGroup)null);
        this.h = inflate;
        this.i = (TextView)inflate.findViewById(2131432095);
        this.a = (TextView)inflate.findViewById(2131427718);
        this.j = (TextView)inflate.findViewById(2131427721);
        this.k = (TextView)inflate.findViewById(2131431822);
        final ChipCloudView o = (ChipCloudView)inflate.findViewById(2131427776);
        this.o = o;
        final int dimensionPixelSize = c.getResources().getDimensionPixelSize(2131165833);
        o.a(dimensionPixelSize, dimensionPixelSize);
        this.l = (ImageView)inflate.findViewById(2131432009);
        this.m = inflate.findViewById(2131428448);
        final CompoundButton p10 = (CompoundButton)inflate.findViewById(2131427719);
        this.p = p10;
        this.r = (aaoq)new jrg(this, 4);
        p10.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jrh(this, g, 2));
        inflate.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jcy(this, 7));
        f.c(inflate);
    }
    
    private static aidi g(final aodm aodm) {
        aodd aodd;
        if ((aodd = aodm.n) == null) {
            aodd = aodd.a;
        }
        if ((aodd.b & 0x1) != 0x0) {
            aodd aodd2;
            if ((aodd2 = aodm.n) == null) {
                aodd2 = aodd.a;
            }
            aidi aidi;
            if ((aidi = aodd2.c) == null) {
                aidi = aidi.a;
            }
            return aidi;
        }
        return null;
    }
    
    private static CharSequence h(final ahil ahil, final CharSequence charSequence) {
        if (ahil == null) {
            return charSequence;
        }
        if ((ahil.b & 0x1) != 0x0) {
            ahik ahik;
            if ((ahik = ahil.c) == null) {
                ahik = ahik.a;
            }
            if ((ahik.b & 0x2) != 0x0) {
                return ahik.c;
            }
        }
        return charSequence;
    }
    
    public final View a() {
        return ((gjh)this.f).a;
    }
    
    public final void c(final acku acku) {
        this.t.c();
        this.g.h(this.r);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aodm)o).u.I();
    }
    
    public final void f() {
        final boolean i = this.g.i();
        this.p.setChecked(i);
        final heo b = this.b;
        if (b != null) {
            b.B(i);
        }
    }
    
    protected final void lR(final ackm ackm, final Object o) {
        final aodm s = (aodm)o;
        final ackk t = this.t;
        final wyw a = ackm.a;
        aiqj aiqj;
        if ((s.b & 0x2000) != 0x0) {
            if ((aiqj = s.o) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        t.a(a, aiqj, ackm.e());
        this.s = s;
        aodi aodi;
        if ((aodi = s.h) == null) {
            aodi = aodi.a;
        }
        int bw;
        if ((bw = aqsx.bw(aodi.b)) == 0) {
            bw = 1;
        }
        Label_0247: {
            if (--bw != 0 && bw != 1) {
                if (bw == 2) {
                    this.i.setTextAppearance(2132083636);
                    break Label_0247;
                }
                if (bw == 3) {
                    this.i.setTextAppearance(2132083634);
                    break Label_0247;
                }
                if (bw != 4) {
                    if (bw == 6) {
                        this.i.setTextAppearance(2132083635);
                        break Label_0247;
                    }
                    if (bw != 7) {
                        final Context c = this.c;
                        int n;
                        if (!this.G.aT()) {
                            n = 2130970858;
                        }
                        else {
                            n = 2130970829;
                        }
                        fal.t(ackm, tpe.cr(c, n));
                        this.i.setTextAppearance(2132083632);
                        break Label_0247;
                    }
                }
            }
            this.i.setTextAppearance(2132083631);
        }
        ajut ajut;
        if ((s.b & 0x1) != 0x0) {
            if ((ajut = s.f) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        final Spanned b = acak.b(ajut);
        if (g(this.s) == null) {
            this.i.setText((CharSequence)b);
            final TextView i = this.i;
            final String value = String.valueOf(b);
            final String string = this.q.getString(2132017279);
            final StringBuilder sb = new StringBuilder();
            sb.append(value);
            sb.append(" ");
            sb.append(string);
            i.setContentDescription((CharSequence)sb.toString());
            this.i.setVisibility(0);
            this.a.setVisibility(8);
        }
        else {
            this.a.setText((CharSequence)b);
            this.i.setVisibility(8);
            this.a.setVisibility(0);
        }
        if (tpe.bq(this.c) && (s.b & 0x1) == 0x0) {
            this.i.setVisibility(8);
            this.h.setMinimumHeight(this.c.getResources().getDimensionPixelSize(2131169558));
        }
        boolean b2 = false;
        Label_0937: {
            if (tpe.bq(this.c) && (this.s.b & 0x1) == 0x0) {
                final View h = this.h;
                h.setPadding(h.getPaddingLeft(), this.C, this.h.getPaddingRight(), this.D);
            }
            else if (this.s.q.size() > 0) {
                final View h2 = this.h;
                h2.setPadding(h2.getPaddingLeft(), this.u, this.h.getPaddingRight(), this.A);
            }
            else {
                aodj aodj;
                if ((aodj = this.s.p) == null) {
                    aodj = aodj.a;
                }
                if ((aodj.b & 0x1) != 0x0) {
                    final View h3 = this.h;
                    h3.setPadding(h3.getPaddingLeft(), this.x, this.h.getPaddingRight(), this.B);
                    b2 = true;
                    break Label_0937;
                }
                if (g(this.s) == null) {
                    int n2 = this.u;
                    int n3 = this.y;
                    final int dimensionPixelSize = this.q.getDimensionPixelSize(2131169559);
                    final aodi h4 = this.s.h;
                    aodi a2;
                    if (h4 == null) {
                        a2 = aodi.a;
                    }
                    else {
                        a2 = h4;
                    }
                    final int bw2 = aqsx.bw(a2.b);
                    int dimensionPixelSize2 = 0;
                    Label_0871: {
                        if (bw2 != 0) {
                            if (bw2 == 4) {
                                n2 = this.q.getDimensionPixelSize(2131169562);
                                dimensionPixelSize2 = dimensionPixelSize;
                                break Label_0871;
                            }
                        }
                        aodi a3;
                        if (h4 == null) {
                            a3 = aodi.a;
                        }
                        else {
                            a3 = h4;
                        }
                        final int bw3 = aqsx.bw(a3.b);
                        if (bw3 != 0) {
                            if (bw3 == 6) {
                                n2 = this.q.getDimensionPixelSize(2131169562);
                                dimensionPixelSize2 = this.q.getDimensionPixelSize(2131169551);
                                break Label_0871;
                            }
                        }
                        aodi a4;
                        if ((a4 = h4) == null) {
                            a4 = aodi.a;
                        }
                        final int bw4 = aqsx.bw(a4.b);
                        if (bw4 == 0) {
                            dimensionPixelSize2 = dimensionPixelSize;
                        }
                        else {
                            dimensionPixelSize2 = dimensionPixelSize;
                            if (bw4 == 7) {
                                n2 = this.q.getDimensionPixelSize(2131169564);
                                n3 = this.q.getDimensionPixelSize(2131169563);
                                dimensionPixelSize2 = dimensionPixelSize;
                            }
                        }
                    }
                    this.h.setMinimumHeight(dimensionPixelSize2);
                    final View h5 = this.h;
                    h5.setPadding(h5.getPaddingLeft(), n2, this.h.getPaddingRight(), n3);
                }
                else {
                    final View h6 = this.h;
                    h6.setPadding(h6.getPaddingLeft(), this.v, this.h.getPaddingRight(), this.z);
                }
            }
            b2 = false;
        }
        final View m = this.m;
        int n4;
        if (b2) {
            n4 = this.E;
        }
        else {
            n4 = this.F;
        }
        tpe.aF(m, tpe.aB(n4), (Class)ViewGroup$MarginLayoutParams.class);
        ajut ajut2;
        if ((ajut2 = s.g) == null) {
            ajut2 = ajut.a;
        }
        final Spanned b3 = acak.b(ajut2);
        if (!TextUtils.isEmpty((CharSequence)b3)) {
            this.k.setText((CharSequence)b3);
            this.k.setVisibility(0);
        }
        else {
            ajut ajut3;
            if ((ajut3 = s.j) == null) {
                ajut3 = ajut.a;
            }
            final Spanned b4 = acak.b(ajut3);
            if (!TextUtils.isEmpty((CharSequence)b4)) {
                this.k.setText((CharSequence)b4);
                this.k.setVisibility(0);
            }
            else {
                this.k.setVisibility(8);
            }
        }
        final acgs d = this.d;
        final ImageView l = this.l;
        aotp aotp;
        if ((aotp = s.k) == null) {
            aotp = aotp.a;
        }
        d.g(l, aotp);
        final ImageView j = this.l;
        aotp aotp2;
        if ((aotp2 = s.k) == null) {
            aotp2 = aotp.a;
        }
        int visibility;
        if (!aald.S(aotp2)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        j.setVisibility(visibility);
        final acpn n5 = this.n;
        final View a5 = ((gjh)this.f).a;
        final View k = this.m;
        aodj aodj2;
        if ((aodj2 = s.p) == null) {
            aodj2 = aodj.a;
        }
        amgs amgs;
        if ((aodj2.b & 0x1) != 0x0) {
            aodj aodj3;
            if ((aodj3 = s.p) == null) {
                aodj3 = aodj.a;
            }
            if ((amgs = aodj3.c) == null) {
                amgs = amgs.a;
            }
        }
        else {
            amgs = null;
        }
        n5.f(a5, k, amgs, (Object)s, ackm.a);
        final aidi g = g(this.s);
        if (g != null) {
            final boolean i2 = this.g.i();
            ajut ajut4;
            if ((g.b & 0x40) != 0x0) {
                if ((ajut4 = g.h) == null) {
                    ajut4 = ajut.a;
                }
            }
            else {
                ajut4 = null;
            }
            final Spanned b5 = acak.b(ajut4);
            ajut ajut5;
            if ((g.b & 0x2000) != 0x0) {
                if ((ajut5 = g.n) == null) {
                    ajut5 = ajut.a;
                }
            }
            else {
                ajut5 = null;
            }
            Object b6;
            if (TextUtils.isEmpty((CharSequence)(b6 = acak.b(ajut5)))) {
                b6 = b5;
            }
            this.p.setVisibility(0);
            this.j.setVisibility(0);
            final TextView j2 = this.j;
            Object text;
            if (!i2) {
                text = b5;
            }
            else {
                text = b6;
            }
            j2.setText((CharSequence)text);
            this.g.e(this.r);
            ahil ahil;
            if ((g.b & 0x200000) != 0x0) {
                if ((ahil = g.s) == null) {
                    ahil = ahil.a;
                }
            }
            else {
                ahil = null;
            }
            final CharSequence h7 = h(ahil, (CharSequence)b6);
            ahil ahil2;
            if ((g.b & 0x100000) != 0x0) {
                if ((ahil2 = g.r) == null) {
                    ahil2 = ahil.a;
                }
            }
            else {
                ahil2 = null;
            }
            this.b = new heo((View)this.p, h(ahil2, (CharSequence)b5), h7);
            this.f();
        }
        else {
            this.p.setVisibility(8);
            this.j.setVisibility(8);
            this.g.h(this.r);
            this.b = null;
        }
        if (s.q.size() == 0) {
            this.o.setVisibility(8);
        }
        else {
            this.o.setVisibility(0);
            final Iterator<Object> iterator = ((List<Object>)s.q).iterator();
            int n6 = 0;
            int n7;
            while (true) {
                n7 = n6;
                if (!iterator.hasNext()) {
                    break;
                }
                final aode aode = iterator.next();
                if ((aode.b & 0x1) == 0x0) {
                    continue;
                }
                if (n6 >= this.o.getChildCount()) {
                    View.inflate(this.c, 2131625380, (ViewGroup)this.o);
                }
                final TextView textView = (TextView)this.o.getChildAt(n6);
                int az;
                if (fbu.aR(this.H) && this.q.getConfiguration().orientation == 1) {
                    az = tpe.aZ(this.q.getDisplayMetrics(), 16);
                }
                else {
                    az = 0;
                }
                final ChipCloudView o2 = this.o;
                o2.setPadding(o2.getPaddingLeft(), this.o.getPaddingTop(), this.o.getPaddingRight(), az);
                aodh aodh;
                if ((aodh = aode.c) == null) {
                    aodh = aodh.a;
                }
                ajut ajut6;
                if ((aodh.b & 0x1) != 0x0) {
                    aodh aodh2;
                    if ((aodh2 = aode.c) == null) {
                        aodh2 = aodh.a;
                    }
                    if ((ajut6 = aodh2.c) == null) {
                        ajut6 = ajut.a;
                    }
                }
                else {
                    ajut6 = null;
                }
                tpe.t(textView, (CharSequence)acak.b(ajut6));
                ++n6;
            }
            while (n7 < this.o.getChildCount()) {
                this.o.getChildAt(n7).setVisibility(8);
                ++n7;
            }
        }
        vdh.c(this.e, (List)s.t, (Object)s);
        this.f.e(ackm);
    }
    
    protected final boolean pX() {
        return true;
    }
}
