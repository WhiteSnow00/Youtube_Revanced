import java.util.Iterator;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import android.text.Spanned;
import java.util.ArrayList;
import android.view.ViewStub;
import java.util.List;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kho implements acko
{
    private final Context a;
    private final vcy b;
    private final acpn c;
    private final acgs d;
    private final FrameLayout e;
    private final ackk f;
    private khn g;
    private khn h;
    private khn i;
    private final jki j;
    
    public kho(final Context a, final acgs d, final vcy b, final acpn c, final jki j, final byte[] array, final byte[] array2) {
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.j = j;
        final FrameLayout e = new FrameLayout(a);
        (this.e = e).setBackground((Drawable)new fyt(tpe.cr(a, 2130970822), a.getResources().getDimensionPixelSize(2131167245)));
        this.f = new ackk(b, (View)e);
    }
    
    @Override
    public final View a() {
        return (View)this.e;
    }
    
    @Override
    public final void c(final acku acku) {
        this.f.c();
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final hzn hzn = (hzn)o;
        final ackk f = this.f;
        final wyw a = ackm.a;
        aiqj aiqj;
        if ((aiqj = hzn.a().g) == null) {
            aiqj = aiqj.a;
        }
        f.a(a, aiqj, ackm.e());
        this.e.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation == 2) {
            if (this.h == null) {
                this.h = new khn(this.a, this.d, this.b, this.c, this.j, null, null);
            }
            this.i = this.h;
        }
        else {
            if (this.g == null) {
                this.g = new khn(this.a, this.d, this.b, this.c, this.j, null, null);
            }
            this.i = this.g;
        }
        final khn i = this.i;
        hzn.getClass();
        final aogt a2 = hzn.a();
        a2.getClass();
        final boolean equals = ((ahbh)a2).equals((Object)i.n);
        final aotp aotp = null;
        if (!equals) {
            i.o = null;
        }
        i.n = a2;
        ackm.a.t((wzz)new wyt(i.n.l), (alhi)null);
        vdh.c(i.b, (List)((ajsk)hzn.a).i, (Object)i.n);
        i.e.d(i.c);
        final acgs e = i.e;
        final ImageView c = i.c;
        aogz aogz;
        if ((aogz = i.n.d) == null) {
            aogz = aogz.a;
        }
        aotp aotp2;
        if ((aogz.b & 0x1) != 0x0) {
            aogz aogz2;
            if ((aogz2 = i.n.d) == null) {
                aogz2 = aogz.a;
            }
            aogy aogy;
            if ((aogy = aogz2.c) == null) {
                aogy = aogy.a;
            }
            if ((aotp2 = aogy.b) == null) {
                aotp2 = aotp.a;
            }
        }
        else {
            aotp2 = null;
        }
        e.g(c, aotp2);
        final View j = i.i;
        if (j != null) {
            if (i.q == null) {
                i.q = new glh((ViewStub)j, (byte[])null);
            }
            final glh q = i.q;
            if (i.o == null) {
                final ArrayList<Spanned> list = new ArrayList<Spanned>();
                for (final aotd aotd : i.n.e) {
                    aoss aoss;
                    if ((aoss = aotd.d) == null) {
                        aoss = aoss.a;
                    }
                    if ((aoss.b & 0x1) != 0x0) {
                        aoss aoss2;
                        if ((aoss2 = aotd.d) == null) {
                            aoss2 = aoss.a;
                        }
                        ajut ajut;
                        if ((ajut = aoss2.c) == null) {
                            ajut = ajut.a;
                        }
                        list.add(acak.b(ajut));
                    }
                }
                i.o = TextUtils.join((CharSequence)System.getProperty("line.separator"), (Iterable)list);
            }
            final CharSequence o2 = i.o;
            if (TextUtils.isEmpty(o2)) {
                q.a.setVisibility(8);
            }
            else {
                if (!q.b) {
                    q.c = q.a.inflate();
                    q.b = true;
                }
                final View c2 = q.c;
                if (c2 != null) {
                    ((TextView)c2).setText(o2);
                    ((TextView)q.c).setVisibility(0);
                    q.a.setVisibility(0);
                }
            }
        }
        final View h = i.h;
        if (h != null) {
            if (i.p == null) {
                i.p = new glh((ViewStub)h);
            }
            i.p.a(jgk.e((List)i.n.e));
        }
        final wyw a3 = ackm.a;
        final acpn f2 = i.f;
        final View a4 = i.a;
        final View g = i.g;
        amgv amgv;
        if ((amgv = i.n.k) == null) {
            amgv = amgv.a;
        }
        amgs amgs;
        if ((amgv.b & 0x1) != 0x0) {
            amgv amgv2;
            if ((amgv2 = i.n.k) == null) {
                amgv2 = amgv.a;
            }
            if ((amgs = amgv2.c) == null) {
                amgs = amgs.a;
            }
        }
        else {
            amgs = null;
        }
        f2.f(a4, g, amgs, (Object)i.n, a3);
        final TextView k = i.j;
        final aogt n = i.n;
        ajut ajut2;
        if ((n.b & 0x1) != 0x0) {
            if ((ajut2 = n.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(k, (CharSequence)acak.b(ajut2));
        final aogt n2 = i.n;
        ajut ajut3;
        if ((n2.b & 0x10) != 0x0) {
            if ((ajut3 = n2.h) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        final Spanned a5 = vde.a(ajut3, i.b, false);
        if (!TextUtils.isEmpty((CharSequence)a5)) {
            tpe.t(i.k, (CharSequence)a5);
            i.l.setVisibility(8);
        }
        else {
            final TextView l = i.l;
            final aogt n3 = i.n;
            ajut ajut4;
            if ((n3.b & 0x20) != 0x0) {
                if ((ajut4 = n3.i) == null) {
                    ajut4 = ajut.a;
                }
            }
            else {
                ajut4 = null;
            }
            tpe.t(l, (CharSequence)vde.a(ajut4, i.b, false));
            i.k.setVisibility(8);
        }
        final jhe m = i.m;
        aiao aiao;
        if ((aiao = i.n.j) == null) {
            aiao = aiao.a;
        }
        aiaq aiaq;
        if ((aiao.b & 0x2) != 0x0) {
            aiao aiao2;
            if ((aiao2 = i.n.j) == null) {
                aiao2 = aiao.a;
            }
            if ((aiaq = aiao2.d) == null) {
                aiaq = aiaq.a;
            }
        }
        else {
            aiaq = null;
        }
        m.a(aiaq);
        i.e.d(i.d);
        final acgs e2 = i.e;
        final ImageView d = i.d;
        aijz aijz;
        if ((aijz = i.n.f) == null) {
            aijz = aijz.a;
        }
        aika aika;
        if ((aika = aijz.c) == null) {
            aika = aika.a;
        }
        aotp aotp3 = aotp;
        if ((aika.b & 0x1) != 0x0) {
            aijz aijz2;
            if ((aijz2 = i.n.f) == null) {
                aijz2 = aijz.a;
            }
            aika aika2;
            if ((aika2 = aijz2.c) == null) {
                aika2 = aika.a;
            }
            if ((aotp3 = aika2.c) == null) {
                aotp3 = aotp.a;
            }
        }
        e2.g(d, aotp3);
        this.e.addView(this.i.a);
    }
}
