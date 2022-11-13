import android.widget.ImageView$ScaleType;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achb
{
    private static final acgp e;
    public final ImageView a;
    public final acha b;
    public tpk c;
    public tpj d;
    private final tpo f;
    private final int g;
    private acgp h;
    private aotp i;
    private Uri j;
    
    static {
        e = (acgp)acgz.a;
    }
    
    public achb(final tpo tpo, final ImageView imageView) {
        this(tpo, imageView, false);
    }
    
    public achb(final tpo tpo, final ImageView imageView, final boolean b) {
        this(tpo, (tpk)new tpm(imageView.getContext()), imageView, b);
    }
    
    public achb(final tpo tpo, final tpk tpk, final acgp acgp, final ImageView imageView, final boolean b) {
        this(tpo, tpk, acgp, imageView, b, null);
    }
    
    public achb(final tpo f, final tpk tpk, final acgp acgp, final ImageView a, final boolean b, final vaf vaf) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        int j;
        if (vaf != null && vaf.b() != null && (vaf.b().b & 0x4000000) != 0x0) {
            aoqn aoqn;
            if ((aoqn = vaf.b().s) == null) {
                aoqn = aoqn.a;
            }
            j = aoqn.j;
            this.g = j;
        }
        else {
            j = 0;
            this.g = 0;
        }
        this.b = new acha(this, b, j);
        this.f(tpk);
        this.h(acgp);
    }
    
    public achb(final tpo tpo, final tpk tpk, final ImageView imageView, final boolean b) {
        this(tpo, tpk, achb.e, imageView, b);
    }
    
    public final void a() {
        this.b();
        this.a.setImageDrawable((Drawable)null);
    }
    
    public final void b() {
        tpp.a(this.a);
        this.b.b();
        this.d = null;
        this.i = null;
        this.j = null;
    }
    
    public final void c(final Uri uri, final tpn tpn, final tpj tpj) {
        tpp.c(this.f, tpj, this.c, uri, this.a, tpn);
    }
    
    public final void d(final tpn tpn, final tpj tpj, final int n) {
        if (this.i == null) {
            return;
        }
        final int width = this.a.getWidth();
        final int height = this.a.getHeight();
        final boolean b = false;
        int n2 = height;
        Label_0066: {
            if (width != 0) {
                if ((n2 = height) != 0) {
                    break Label_0066;
                }
                n2 = 0;
            }
            if (this.i.c.size() != 1) {
                this.b.a(tpn);
                return;
            }
        }
        final aotp i = this.i;
        adkp.H(width >= 0);
        boolean b2 = b;
        if (n2 >= 0) {
            b2 = true;
        }
        adkp.H(b2);
        aoto aoto;
        if (!aald.S(i)) {
            aoto = null;
        }
        else {
            final ArrayList list = new ArrayList<Object>((Collection<?>)i.c);
            Collections.sort((List<E>)list, (Comparator<? super E>)zks.n);
            aoto = (aoto)list.get(Math.min(list.indexOf(aald.O(i, width, n2)) + n, list.size() - 1));
        }
        Uri cl;
        if (aoto != null && (aoto.b & 0x1) != 0x0) {
            cl = tpe.cL(aoto.c);
        }
        else {
            cl = null;
        }
        if (cl == null || !cl.equals((Object)this.j)) {
            if ((this.j = cl) != null) {
                this.c(cl, tpn, tpj);
            }
            else {
                this.a.setImageDrawable((Drawable)null);
            }
        }
        this.b.b();
    }
    
    public final void e(final int backgroundResource) {
        this.a.setBackgroundResource(backgroundResource);
    }
    
    public final void f(final tpk c) {
        c.getClass();
        this.c = c;
    }
    
    public final void g(final int imageResource) {
        this.b();
        this.a.setImageResource(imageResource);
    }
    
    public final void h(final acgp acgp) {
        acgp e = acgp;
        if (acgp == null) {
            e = achb.e;
        }
        this.h = e;
    }
    
    public final void i(final ImageView$ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }
    
    @Deprecated
    public final void j(final vgy vgy) {
        aotp e;
        if (vgy != null) {
            e = vgy.e();
        }
        else {
            e = null;
        }
        this.m(e, true, true, null);
    }
    
    public final void k(final aotp aotp) {
        this.m(aotp, true, true, null);
    }
    
    public final void l(final aotp aotp, final tpn tpn) {
        this.m(aotp, true, true, tpn);
    }
    
    public final void m(final aotp i, final boolean b, final boolean b2, final tpn tpn) {
        if (i != this.i) {
            this.d = this.h.a();
            this.i = i;
            this.j = null;
            if (b) {
                this.a.setImageDrawable((Drawable)null);
            }
            this.b.b();
        }
        if (!aald.S(i)) {
            return;
        }
        if (!this.b.a && this.a.isLayoutRequested() && b2) {
            this.b.a(tpn);
            return;
        }
        this.d(tpn, this.d, this.g);
    }
    
    public final void n() {
        this.a.setBackground((Drawable)null);
    }
    
    public final void o() {
        this.a.setVisibility(8);
    }
}
