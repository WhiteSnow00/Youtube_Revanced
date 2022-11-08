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

public abstract class iyw extends aazp implements fqb, abbq, iyy
{
    public final asgt a;
    public boolean b;
    public Bitmap c;
    private final aceo d;
    private final acej e;
    private final boolean f;
    private final atid g;
    private iyv h;
    private boolean i;
    private final aucj j;
    
    public iyw(final Context context, final aceo d, final aucj j, final arud arud, final uyi uyi, final uyi uyi2, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context);
        this.j = j;
        this.d = d;
        this.b = false;
        mrm.A((Callable)new imb(this, uyi2, 4));
        final acej b = acek.b.b();
        b.f = 1;
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        if (alvs.au) {
            b.g = 2;
        }
        else {
            alvs alvs2;
            if ((alvs2 = arud.f().e) == null) {
                alvs2 = alvs.a;
            }
            if (alvs2.av) {
                b.g = 3;
            }
        }
        this.e = b;
        this.f = uyi.f(45362307L);
        final atid ad = atid.aD();
        this.g = ad;
        this.a = ((asgt)ad).J().p().V();
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new absc(-1, -1, false);
    }
    
    public final void e(final Context context, final View view) {
        final ImageView k = this.k(view);
        if (k == null) {
            return;
        }
        int backgroundColor;
        if (!this.i) {
            backgroundColor = -16777216;
        }
        else {
            backgroundColor = 0;
        }
        k.setBackgroundColor(backgroundColor);
        final Bitmap c = this.c;
        if (c != null && !c.isRecycled()) {
            k.setImageBitmap(this.c);
            return;
        }
        final aceo d = this.d;
        final aucj j = this.j;
        final iyv h = this.h;
        aorm b = null;
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
        final acej e = this.e;
        e.c = (acem)new iyu(h, this.b);
        ezp.j(d, j, k, a, b, e.a());
    }
    
    public final void j(final fkk fkk) {
        if (this.i != fkk.d()) {
            this.i = fkk.d();
            this.Y();
        }
    }
    
    protected abstract ImageView k(final View p0);
    
    public final void l() {
        this.c = null;
        this.Y();
    }
    
    public final void m() {
        this.c = null;
        this.p(null);
    }
    
    protected final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
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
    
    public final void n(final Bitmap c) {
        this.c = c;
        this.Y();
    }
    
    public final void o(final Bitmap bitmap) {
    }
    
    public final boolean oU() {
        final iyv h = this.h;
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
    
    public final boolean ow(final fkk fkk) {
        return !fkk.h();
    }
    
    public final void oy(final int n) {
        boolean b = true;
        if (n != 1) {
            b = (n == 2 && b);
        }
        this.g.tr((Object)b);
    }
    
    public final void p(final iyv h) {
        final Bitmap c = this.c;
        if (c != null && !c.isRecycled()) {
            return;
        }
        if (aeda.v((Object)this.h, (Object)h)) {
            return;
        }
        final iyv h2 = this.h;
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
