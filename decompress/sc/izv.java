import android.text.TextUtils;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.concurrent.Callable;
import android.content.Context;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class izv extends abbk implements fqk, abdl, izx
{
    public final ashi a;
    public boolean b;
    public Bitmap c;
    private final acgs d;
    private final acgn e;
    private final boolean f;
    private final ativ g;
    private izu h;
    private boolean i;
    private final auda j;
    
    public izv(final Context context, final acgs d, final auda j, final arwh arwh, final vai vai, final vai vai2, final msr msr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context);
        this.j = j;
        this.d = d;
        this.b = false;
        msr.Q((Callable)new imy(this, vai2, 4));
        final acgn b = acgo.b.b();
        b.f = 1;
        alxw alxw;
        if ((alxw = arwh.f().e) == null) {
            alxw = alxw.a;
        }
        if (alxw.au) {
            b.g = 2;
        }
        else {
            alxw alxw2;
            if ((alxw2 = arwh.f().e) == null) {
                alxw2 = alxw.a;
            }
            if (alxw2.av) {
                b.g = 3;
            }
        }
        this.e = b;
        this.f = vai.f(45362307L);
        final ativ ae = ativ.aE();
        this.g = ae;
        this.a = ((ashi)ae).J().p().V();
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new abud(-1, -1, false);
    }
    
    public final void e(final Context context, final View view) {
        final ImageView l = this.l(view);
        if (l == null) {
            return;
        }
        int backgroundColor;
        if (!this.i) {
            backgroundColor = -16777216;
        }
        else {
            backgroundColor = 0;
        }
        l.setBackgroundColor(backgroundColor);
        final Bitmap c = this.c;
        if (c != null && !c.isRecycled()) {
            l.setImageBitmap(this.c);
            return;
        }
        final acgs d = this.d;
        final auda j = this.j;
        final izu h = this.h;
        aotp b = null;
        String a;
        if (h != null) {
            a = h.a;
        }
        else {
            a = null;
        }
        if (h != null) {
            b = h.b;
        }
        final acgn e = this.e;
        e.c = (acgq)new izt(h, this.b);
        ezt.j(d, j, l, a, b, e.a());
    }
    
    public final void k(final fkr fkr) {
        if (this.i != fkr.d()) {
            this.i = fkr.d();
            this.Y();
        }
    }
    
    protected abstract ImageView l(final View p0);
    
    public final void m() {
        this.c = null;
        this.Y();
    }
    
    protected final abbn mj(final Context context) {
        final abbn mj = super.mj(context);
        mj.a = 0;
        mj.b = 0;
        mj.f = true;
        mj.g = true;
        mj.b();
        mj.a();
        mj.e = false;
        return mj;
    }
    
    public final String mr() {
        return "player_overlay_splash_screen";
    }
    
    public final void n() {
        this.c = null;
        this.q(null);
    }
    
    public final void o(final Bitmap c) {
        this.c = c;
        this.Y();
    }
    
    public final boolean oV() {
        final izu h = this.h;
        boolean b = true;
        if (h == null) {
            final Bitmap c = this.c;
            if (c != null) {
                if (c.isRecycled()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean ow(final fkr fkr) {
        return !fkr.h();
    }
    
    public final void oy(final int n) {
        boolean b = true;
        if (n != 1) {
            b = (n == 2 && b);
        }
        this.g.tu((Object)b);
    }
    
    public final void p(final Bitmap bitmap) {
    }
    
    public final void q(final izu h) {
        final Bitmap c = this.c;
        if (c != null && !c.isRecycled()) {
            return;
        }
        if (adkp.ae(this.h, h)) {
            return;
        }
        final izu h2 = this.h;
        if (this.f && h2 != null && h != null) {
            final String a = h.a;
            if (a != null && h2.b != null && h.b != null && TextUtils.equals((CharSequence)h2.a, (CharSequence)a)) {
                return;
            }
        }
        this.h = h;
        this.Y();
    }
}
