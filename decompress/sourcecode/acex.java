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

public final class acex
{
    private static final acel e;
    public final ImageView a;
    public final acew b;
    public tne c;
    public tnd d;
    private final tni f;
    private final int g;
    private acel h;
    private aorm i;
    private Uri j;
    
    static {
        e = (acel)acev.a;
    }
    
    public acex(final tni tni, final ImageView imageView) {
        this(tni, imageView, false);
    }
    
    public acex(final tni tni, final ImageView imageView, final boolean b) {
        this(tni, (tne)new tng(imageView.getContext()), imageView, b);
    }
    
    public acex(final tni tni, final tne tne, final acel acel, final ImageView imageView, final boolean b) {
        this(tni, tne, acel, imageView, b, null);
    }
    
    public acex(final tni f, final tne tne, final acel acel, final ImageView a, final boolean b, final uyf uyf) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        int j;
        if (uyf != null && uyf.b() != null && (uyf.b().b & 0x4000000) != 0x0) {
            aook aook;
            if ((aook = uyf.b().s) == null) {
                aook = aook.a;
            }
            j = aook.j;
            this.g = j;
        }
        else {
            j = 0;
            this.g = 0;
        }
        this.b = new acew(this, b, j);
        this.f(tne);
        this.h(acel);
    }
    
    public acex(final tni tni, final tne tne, final ImageView imageView, final boolean b) {
        this(tni, tne, acex.e, imageView, b);
    }
    
    public final void a() {
        this.b();
        this.a.setImageDrawable((Drawable)null);
    }
    
    public final void b() {
        tnj.a(this.a);
        this.b.b();
        this.d = null;
        this.i = null;
        this.j = null;
    }
    
    public final void c(final Uri uri, final tnh tnh, final tnd tnd) {
        tnj.c(this.f, tnd, this.c, uri, this.a, tnh);
    }
    
    public final void d(final tnh tnh, final tnd tnd, final int n) {
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
                this.b.a(tnh);
                return;
            }
        }
        final aorm i = this.i;
        agot.u(width >= 0);
        boolean b2 = b;
        if (n2 >= 0) {
            b2 = true;
        }
        agot.u(b2);
        aorl aorl;
        if (!actc.M(i)) {
            aorl = null;
        }
        else {
            final ArrayList list = new ArrayList<Object>(i.c);
            Collections.sort((List<E>)list, (Comparator<? super E>)zox.m);
            aorl = (aorl)list.get(Math.min(list.indexOf(actc.I(i, width, n2)) + n, list.size() - 1));
        }
        Uri ch;
        if (aorl != null && (aorl.b & 0x1) != 0x0) {
            ch = tmy.cH(aorl.c);
        }
        else {
            ch = null;
        }
        if (ch == null || !ch.equals((Object)this.j)) {
            if ((this.j = ch) != null) {
                this.c(ch, tnh, tnd);
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
    
    public final void f(final tne c) {
        c.getClass();
        this.c = c;
    }
    
    public final void g(final int imageResource) {
        this.b();
        this.a.setImageResource(imageResource);
    }
    
    public final void h(final acel acel) {
        acel e = acel;
        if (acel == null) {
            e = acex.e;
        }
        this.h = e;
    }
    
    public final void i(final ImageView$ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }
    
    @Deprecated
    public final void j(final vey vey) {
        aorm e;
        if (vey != null) {
            e = vey.e();
        }
        else {
            e = null;
        }
        this.m(e, true, true, null);
    }
    
    public final void k(final aorm aorm) {
        this.m(aorm, true, true, null);
    }
    
    public final void l(final aorm aorm, final tnh tnh) {
        this.m(aorm, true, true, tnh);
    }
    
    public final void m(final aorm i, final boolean b, final boolean b2, final tnh tnh) {
        if (i != this.i) {
            this.d = this.h.a();
            this.i = i;
            this.j = null;
            if (b) {
                this.a.setImageDrawable((Drawable)null);
            }
            this.b.b();
        }
        if (!actc.M(i)) {
            return;
        }
        if (!this.b.a && this.a.isLayoutRequested() && b2) {
            this.b.a(tnh);
            return;
        }
        this.d(tnh, this.d, this.g);
    }
    
    public final void n() {
        this.a.setBackground((Drawable)null);
    }
    
    public final void o() {
        this.a.setVisibility(8);
    }
}
