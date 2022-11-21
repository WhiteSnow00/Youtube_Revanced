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

public final class acip
{
    private static final acid e;
    public final ImageView a;
    public final acio b;
    public tql c;
    public tqk d;
    private final tqp f;
    private final int g;
    private acid h;
    private aowb i;
    private Uri j;
    
    static {
        e = (acid)acin.a;
    }
    
    public acip(final tqp tqp, final ImageView imageView) {
        this(tqp, imageView, false);
    }
    
    public acip(final tqp tqp, final ImageView imageView, final boolean b) {
        this(tqp, (tql)new tqn(imageView.getContext()), imageView, b);
    }
    
    public acip(final tqp tqp, final tql tql, final acid acid, final ImageView imageView, final boolean b) {
        this(tqp, tql, acid, imageView, b, null);
    }
    
    public acip(final tqp f, final tql tql, final acid acid, final ImageView a, final boolean b, final vbo vbo) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        int j;
        if (vbo != null && vbo.b() != null && (vbo.b().b & 0x4000000) != 0x0) {
            aosy aosy;
            if ((aosy = vbo.b().s) == null) {
                aosy = aosy.a;
            }
            j = aosy.j;
            this.g = j;
        }
        else {
            j = 0;
            this.g = 0;
        }
        this.b = new acio(this, b, j);
        this.f(tql);
        this.h(acid);
    }
    
    public acip(final tqp tqp, final tql tql, final ImageView imageView, final boolean b) {
        this(tqp, tql, acip.e, imageView, b);
    }
    
    public final void a() {
        this.b();
        this.a.setImageDrawable((Drawable)null);
    }
    
    public final void b() {
        tqq.a(this.a);
        this.b.b();
        this.d = null;
        this.i = null;
        this.j = null;
    }
    
    public final void c(final Uri uri, final tqo tqo, final tqk tqk) {
        tqq.c(this.f, tqk, this.c, uri, this.a, tqo);
    }
    
    public final void d(final tqo tqo, final tqk tqk, final int n) {
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
                this.b.a(tqo);
                return;
            }
        }
        final aowb i = this.i;
        adme.K(width >= 0);
        boolean b2 = b;
        if (n2 >= 0) {
            b2 = true;
        }
        adme.K(b2);
        aowa aowa;
        if (!aamz.W(i)) {
            aowa = null;
        }
        else {
            final ArrayList list = new ArrayList<Object>((Collection<?>)i.c);
            Collections.sort((List<E>)list, (Comparator<? super E>)zmm.n);
            aowa = (aowa)list.get(Math.min(list.indexOf(aamz.S(i, width, n2)) + n, list.size() - 1));
        }
        Uri cl;
        if (aowa != null && (aowa.b & 0x1) != 0x0) {
            cl = tqf.cL(aowa.c);
        }
        else {
            cl = null;
        }
        if (cl == null || !cl.equals((Object)this.j)) {
            if ((this.j = cl) != null) {
                this.c(cl, tqo, tqk);
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
    
    public final void f(final tql c) {
        c.getClass();
        this.c = c;
    }
    
    public final void g(final int imageResource) {
        this.b();
        this.a.setImageResource(imageResource);
    }
    
    public final void h(final acid acid) {
        acid e = acid;
        if (acid == null) {
            e = acip.e;
        }
        this.h = e;
    }
    
    public final void i(final ImageView$ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }
    
    @Deprecated
    public final void j(final vig vig) {
        aowb e;
        if (vig != null) {
            e = vig.e();
        }
        else {
            e = null;
        }
        this.m(e, true, true, null);
    }
    
    public final void k(final aowb aowb) {
        this.m(aowb, true, true, null);
    }
    
    public final void l(final aowb aowb, final tqo tqo) {
        this.m(aowb, true, true, tqo);
    }
    
    public final void m(final aowb i, final boolean b, final boolean b2, final tqo tqo) {
        if (i != this.i) {
            this.d = this.h.a();
            this.i = i;
            this.j = null;
            if (b) {
                this.a.setImageDrawable((Drawable)null);
            }
            this.b.b();
        }
        if (!aamz.W(i)) {
            return;
        }
        if (!this.b.a && this.a.isLayoutRequested() && b2) {
            this.b.a(tqo);
            return;
        }
        this.d(tqo, this.d, this.g);
    }
    
    public final void n() {
        this.a.setBackground((Drawable)null);
    }
    
    public final void o() {
        this.a.setVisibility(8);
    }
}
