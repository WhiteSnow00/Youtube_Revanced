import java.util.Iterator;
import android.content.Context;
import java.util.ArrayList;
import android.text.Spanned;
import java.util.List;
import android.view.ViewStub;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

class khx
{
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    public final View d;
    public final khy e;
    final khz f;
    private View g;
    
    public khx(final khz f, final int n) {
        this.f = f;
        final View inflate = View.inflate(f.a, n, (ViewGroup)null);
        this.d = inflate;
        this.e = new khy(f.a, f.b, inflate, f.c, f.l, f.m, f.k, f.f, f.p, f.j, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = (ImageView)inflate.findViewById(2131428086);
        this.b = (TextView)inflate.findViewById(2131430521);
        this.c = (TextView)inflate.findViewById(2131430533);
    }
    
    public void a(ackm ackm) {
        this.c(ackm);
        ackm = new ackm(ackm);
        ackm.b = this.f.i.d();
        this.b(((kds)this.e).x, ackm);
    }
    
    protected final void b(final View view, final ackm ackm) {
        final khz f = this.f;
        final acpn d = f.d;
        final View d2 = this.d;
        final hzo i = f.i;
        amgv amgv;
        if ((amgv = i.a().v) == null) {
            amgv = amgv.a;
        }
        amgs amgs;
        if ((amgv.b & 0x1) != 0x0) {
            amgv amgv2;
            if ((amgv2 = i.a().v) == null) {
                amgv2 = amgv.a;
            }
            if ((amgs = amgv2.c) == null) {
                amgs = amgs.a;
            }
        }
        else {
            amgs = null;
        }
        d.f(d2, view, amgs, (Object)this.f.i, ackm.a);
    }
    
    public final void c(final ackm ackm) {
        final apog a = this.f.i.a();
        final acgs b = this.f.b;
        final ImageView a2 = this.a;
        aijz a3;
        if (a.d == 33) {
            a3 = (aijz)a.e;
        }
        else {
            a3 = aijz.a;
        }
        aika aika;
        if ((aika = a3.c) == null) {
            aika = aika.a;
        }
        aotp aotp;
        if ((aika.b & 0x1) != 0x0) {
            aika aika2;
            if ((aika2 = a3.c) == null) {
                aika2 = aika.a;
            }
            if ((aotp = aika2.c) == null) {
                aotp = aotp.a;
            }
        }
        else if (a.d == 19) {
            aotp = (aotp)a.e;
        }
        else {
            aotp = aotp.a;
        }
        b.g(a2, aotp);
        this.a.setOnClickListener((View$OnClickListener)new keq(this, a, 13));
        final ackm ackm2 = new ackm(ackm);
        ackm2.b = this.f.i.d();
        final ajsk a4 = this.f.i.a;
        final int b2 = a4.b;
        final aiaf aiaf = null;
        ajut ajut;
        if ((b2 & 0x20) != 0x0) {
            if ((ajut = a4.g) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        final Spanned b3 = acak.b(ajut);
        final boolean b4 = TextUtils.isEmpty((CharSequence)b3) ^ true;
        tpe.v((View)this.b, b4);
        tpe.v((View)this.c, b4);
        boolean b5 = false;
        if (b4) {
            final TextView b6 = this.b;
            final ajsk a5 = this.f.i.a;
            ajut ajut2;
            if ((a5.b & 0x8) != 0x0) {
                if ((ajut2 = a5.f) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            b6.setText((CharSequence)acak.b(ajut2));
            final khz f = this.f;
            final ajsk a6 = f.i.a;
            int a7;
            if (a6.c == 14) {
                final acpk e = f.e;
                akdh akdh;
                if ((akdh = akdh.b(((akdi)a6.d).c)) == null) {
                    akdh = akdh.a;
                }
                a7 = e.a(akdh);
            }
            else {
                a7 = 0;
            }
            apj.i(this.b, a7, 0);
            this.c.setText((CharSequence)b3);
        }
        if (this.f.i.a().w) {
            if (this.g == null) {
                this.g = ((ViewStub)this.d.findViewById(2131432461)).inflate();
            }
            this.g.setVisibility(0);
        }
        else {
            final View g = this.g;
            if (g != null) {
                g.setVisibility(8);
            }
        }
        final khy e2 = this.e;
        ajut ajut3;
        if ((a.b & 0x8) != 0x0) {
            if ((ajut3 = a.h) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        ((kds)e2).A((CharSequence)acak.b(ajut3));
        final khy e3 = this.e;
        final ArrayList o = agpi.O();
        final Context g2 = ((kds)e3).g;
        final oby a8 = e3.a;
        apfs apfs;
        if ((a.b & 0x2000000) != 0x0) {
            if ((apfs = a.t) == null) {
                apfs = apfs.a;
            }
        }
        else {
            apfs = null;
        }
        final CharSequence x = khl.x(g2, a8, apfs);
        if (!TextUtils.isEmpty(x)) {
            o.add(x);
        }
        else {
            ajut ajut4;
            if ((ajut4 = a.n) == null) {
                ajut4 = ajut.a;
            }
            Spanned spanned;
            if (!TextUtils.isEmpty((CharSequence)acak.b(ajut4))) {
                ajut ajut5;
                if ((ajut5 = a.n) == null) {
                    ajut5 = ajut.a;
                }
                spanned = acak.b(ajut5);
            }
            else {
                ajut ajut6;
                if ((a.b & 0x10000) != 0x0) {
                    if ((ajut6 = a.m) == null) {
                        ajut6 = ajut.a;
                    }
                }
                else {
                    ajut6 = null;
                }
                spanned = acak.b(ajut6);
            }
            o.add(fbu.y((CharSequence)spanned));
            ajut ajut7;
            if ((a.b & 0x4000) != 0x0) {
                if ((ajut7 = a.j) == null) {
                    ajut7 = ajut.a;
                }
            }
            else {
                ajut7 = null;
            }
            o.add(fbu.y((CharSequence)acak.b(ajut7)));
        }
        ajut ajut8;
        if ((a.b & 0x2000) != 0x0) {
            if ((ajut8 = a.i) == null) {
                ajut8 = ajut.a;
            }
        }
        else {
            ajut8 = null;
        }
        final CharSequence y = fbu.y((CharSequence)acak.b(ajut8));
        if (khz.b(a) != null) {
            b5 = true;
        }
        ((kds)e3).k(y, (List)o, b5);
        final khy e4 = this.e;
        ajut ajut9;
        if ((a.b & 0x8000) != 0x0) {
            if ((ajut9 = a.k) == null) {
                ajut9 = ajut.a;
            }
        }
        else {
            ajut9 = null;
        }
        final Spanned b7 = acak.b(ajut9);
        ajut ajut10;
        if ((0x8000 & a.b) != 0x0) {
            if ((ajut10 = a.k) == null) {
                ajut10 = ajut.a;
            }
        }
        else {
            ajut10 = null;
        }
        final CharSequence i = acak.i(ajut10);
        final ahbx x2 = a.x;
        apfs apfs2;
        if ((a.b & 0x2000000) != 0x0) {
            if ((apfs2 = a.t) == null) {
                apfs2 = apfs.a;
            }
        }
        else {
            apfs2 = null;
        }
        ((kds)e4).p((CharSequence)b7, i, (List)x2, apfs2);
        final khy e5 = this.e;
        aotp aotp2;
        if ((aotp2 = a.g) == null) {
            aotp2 = aotp.a;
        }
        ((kds)e5).y(aotp2);
        ((kds)this.e).t(jgk.e((List)a.x));
        final khy e6 = this.e;
        aiao aiao;
        if ((aiao = a.r) == null) {
            aiao = aiao.a;
        }
        aias aias;
        if ((aiao.b & 0x1) != 0x0) {
            aiao aiao2;
            if ((aiao2 = a.r) == null) {
                aiao2 = aiao.a;
            }
            if ((aias = aiao2.c) == null) {
                aias = aias.a;
            }
        }
        else {
            aias = null;
        }
        ((kds)e6).w(aias);
        final khy e7 = this.e;
        final aiao q = a.q;
        aiao a9;
        if (q == null) {
            a9 = aiao.a;
        }
        else {
            a9 = q;
        }
        aiap aiap;
        if ((a9.b & 0x4) != 0x0) {
            aiao a10;
            if ((a10 = q) == null) {
                a10 = aiao.a;
            }
            if ((aiap = a10.e) == null) {
                aiap = aiap.a;
            }
        }
        else {
            aiap = null;
        }
        ((kds)e7).u(aiap);
        this.e.r.a(khz.b(a));
        final khy e8 = this.e;
        final aiao s = a.s;
        aiao a11;
        if (s == null) {
            a11 = aiao.a;
        }
        else {
            a11 = s;
        }
        amhp amhp;
        if ((a11.b & 0x8) != 0x0) {
            aiao a12;
            if ((a12 = s) == null) {
                a12 = aiao.a;
            }
            if ((amhp = a12.f) == null) {
                amhp = amhp.a;
            }
        }
        else {
            amhp = null;
        }
        ((kds)e8).r(amhp);
        final khz f2 = this.f;
        final Iterator<Object> iterator = ((List<Object>)a.p).iterator();
        while (true) {
            aiae aiae;
            do {
                final aiaf h = aiaf;
                if (!iterator.hasNext()) {
                    f2.h = h;
                    final khz f3 = this.f;
                    f3.g.b(((kds)this.e).q, f3.h);
                    this.e.b(ackm2, a);
                    return;
                }
                aiae = iterator.next();
            } while ((aiae.b & 0x80000) == 0x0);
            aiaf h;
            if ((h = aiae.g) == null) {
                h = aiaf.a;
            }
            continue;
        }
    }
}
