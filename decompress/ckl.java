import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class ckl extends Drawable$ConstantState
{
    int a;
    ckk b;
    ColorStateList c;
    PorterDuff$Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff$Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;
    
    public ckl() {
        this.c = null;
        this.d = ckn.a;
        this.b = new ckk();
    }
    
    public ckl(final ckl ckl) {
        this.c = null;
        this.d = ckn.a;
        if (ckl != null) {
            this.a = ckl.a;
            this.b = new ckk(ckl.b);
            final Paint c = ckl.b.c;
            if (c != null) {
                this.b.c = new Paint(c);
            }
            final Paint b = ckl.b.b;
            if (b != null) {
                this.b.b = new Paint(b);
            }
            this.c = ckl.c;
            this.d = ckl.d;
            this.e = ckl.e;
        }
    }
    
    public final void a(final int n, final int n2) {
        this.f.eraseColor(0);
        final Canvas canvas = new Canvas(this.f);
        final ckk b = this.b;
        b.a(b.d, ckk.a, canvas, n, n2);
    }
    
    public final boolean b() {
        final ckk b = this.b;
        if (b.k == null) {
            b.k = b.d.c();
        }
        return b.k;
    }
    
    public int getChangingConfigurations() {
        return this.a;
    }
    
    public final Drawable newDrawable() {
        return new ckn(this);
    }
    
    public final Drawable newDrawable(final Resources resources) {
        return new ckn(this);
    }
}
