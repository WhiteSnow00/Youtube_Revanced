import java.util.Iterator;
import java.util.List;
import android.text.TextUtils;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khe extends acld
{
    private final Context a;
    private final acgs b;
    private final acpk c;
    private final ackr d;
    private final ackk e;
    private final View f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final ViewGroup m;
    private final acsy n;
    
    public khe(final Context a, final acgs b, final acpk c, final aeea aeea, final ziy ziy, final gjh d, final vai vai, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (ackr)d;
        this.e = aeea.ab((ackr)d);
        final View inflate = LayoutInflater.from(a).inflate(2131625097, viewGroup, false);
        this.f = inflate;
        if (vai.aS()) {
            final View viewById = inflate.findViewById(2131432029);
            viewById.setClipToOutline(true);
            viewById.setBackgroundResource(2131231033);
        }
        this.g = (ImageView)inflate.findViewById(2131432009);
        this.h = (TextView)inflate.findViewById(2131432033);
        this.i = (TextView)inflate.findViewById(2131432013);
        this.j = (TextView)inflate.findViewById(2131432095);
        this.k = (TextView)inflate.findViewById(2131431822);
        this.l = (TextView)inflate.findViewById(2131429866);
        this.m = (ViewGroup)inflate.findViewById(2131427882);
        this.n = ziy.ap((TextView)inflate.findViewById(2131430109));
        ((ackr)d).c(inflate);
    }
    
    public final View a() {
        return ((gjh)this.d).a;
    }
    
    public final void c(final acku acku) {
        this.e.c();
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((anmy)o).l.I();
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final anmy anmy = (anmy)o;
        final ackk e = this.e;
        final wyw a = ackm.a;
        final int b = anmy.b;
        final Object o2 = null;
        aiqj aiqj;
        if ((b & 0x20) != 0x0) {
            if ((aiqj = anmy.j) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        e.a(a, aiqj, ackm.e());
        final acgs b2 = this.b;
        final ImageView g = this.g;
        final int b3 = anmy.b;
        boolean b4 = true;
        aotp aotp;
        if ((b3 & 0x1) != 0x0) {
            if ((aotp = anmy.c) == null) {
                aotp = aotp.a;
            }
        }
        else {
            aotp = null;
        }
        b2.g(g, aotp);
        final TextView h = this.h;
        final ahbx d = anmy.d;
        String join;
        if (d != null && !((List)d).isEmpty()) {
            final ArrayList list = new ArrayList();
            for (final aotd aotd : d) {
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
            join = TextUtils.join((CharSequence)System.getProperty("line.separator"), (Iterable)list);
        }
        else {
            join = null;
        }
        tpe.t(h, (CharSequence)join);
        final TextView i = this.i;
        ajut ajut2;
        if ((ajut2 = anmy.e) == null) {
            ajut2 = ajut.a;
        }
        tpe.t(i, (CharSequence)acak.b(ajut2));
        final TextView j = this.j;
        ajut ajut3;
        if ((ajut3 = anmy.f) == null) {
            ajut3 = ajut.a;
        }
        tpe.t(j, (CharSequence)acak.b(ajut3));
        final TextView k = this.k;
        ajut ajut4;
        if ((ajut4 = anmy.g) == null) {
            ajut4 = ajut.a;
        }
        tpe.t(k, (CharSequence)acak.b(ajut4));
        final TextView l = this.l;
        ajut ajut5;
        if ((ajut5 = anmy.h) == null) {
            ajut5 = ajut.a;
        }
        tpe.t(l, (CharSequence)acak.b(ajut5));
        gaf.d(this.a, this.m, this.c, (List)anmy.i);
        final ViewGroup m = this.m;
        if (m.getChildCount() <= 0) {
            b4 = false;
        }
        tpe.v((View)m, b4);
        Object o3 = o2;
        if ((anmy.b & 0x80) != 0x0 && (o3 = anmy.k) == null) {
            o3 = anuv.a;
        }
        ((acsx)this.n).b((aicz)aezp.j(o3).b((aezf)jtb.t).f(), ackm.a);
        this.d.e(ackm);
    }
}
