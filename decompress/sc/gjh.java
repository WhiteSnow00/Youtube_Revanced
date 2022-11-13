import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjh implements ackr
{
    public View a;
    private final Context b;
    private final boolean c;
    private fyt d;
    private View$OnClickListener e;
    private boolean f;
    private final jki g;
    
    @Deprecated
    public gjh(final Context b, final jki g, final boolean c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        b.getClass();
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = this.f(0, 0, 0);
    }
    
    public gjh(final Context context, final jki jki, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this(context, jki, false, null, null, null, null, null);
    }
    
    private final fyt f(int orElse, final int n, int dimensionPixelSize) {
        final jki g = this.g;
        Object b2;
        if (g != null && g.r()) {
            final ColorDrawable b = new ColorDrawable(orElse);
            final acve a = acve.a(this.b);
            a.b = (Drawable)b;
            b2 = a.b();
        }
        else {
            final Context b3 = this.b;
            int n2;
            if (!this.c) {
                n2 = 2130970231;
            }
            else {
                n2 = 2130970233;
            }
            final Drawable drawable = (Drawable)tpe.cw(b3, n2).orElse((Object)null);
            b2 = new ColorDrawable(orElse);
            if (drawable != null) {
                b2 = new LayerDrawable(new Drawable[] { (Drawable)b2, drawable });
            }
        }
        orElse = dimensionPixelSize;
        if (dimensionPixelSize == 0) {
            orElse = tpe.cx(this.b, 2130969745).orElse(0);
        }
        if ((dimensionPixelSize = n) <= 0) {
            dimensionPixelSize = this.b.getResources().getDimensionPixelSize(2131167245);
        }
        return new fyt((Drawable)b2, orElse, dimensionPixelSize);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final boolean b) {
        this.f = b;
        final View a = this.a;
        if (a != null) {
            a.setClickable(b);
        }
    }
    
    public final void c(final View a) {
        a.getClass();
        (this.a = a).setOnClickListener(this.e);
        this.a.setClickable(this.f);
    }
    
    public final void d(final View$OnClickListener view$OnClickListener) {
        this.e = view$OnClickListener;
        final View a = this.a;
        if (a != null) {
            a.setOnClickListener(view$OnClickListener);
        }
    }
    
    public final void e(final ackm ackm) {
        this.a.getClass();
        int n = 0;
        final int b = ackm.b("setBackgroundColor", 0);
        final fyt d = this.d;
        this.d = this.f(b, (int)(float)d.a, d.a());
        boolean b3 = false;
        Label_0121: {
            if (acjw.a(ackm).b()) {
                final int b2 = ackm.b("lineSeparatorOverride", 0);
                b3 = true;
                if (b2 != 0) {
                    if (b2 == 1) {
                        break Label_0121;
                    }
                    if (b2 != 2) {
                        throw new IllegalArgumentException("LineSeparatorOverrideOps not supported");
                    }
                }
                else if (ackm.j("showLineSeparator", false)) {
                    break Label_0121;
                }
            }
            b3 = false;
        }
        this.d.e(b3);
        if (b3) {
            final int b4 = ackm.b("lineSeparatorGravityOverride", 0);
            if (b4 == 3 || b4 == 5 || b4 == 16 || b4 == 48 || b4 == 80 || b4 == 8388611 || b4 == 8388613) {
                n = b4;
            }
            if (n != 0) {
                this.d.c(n);
            }
        }
        tpe.d(this.a, (Drawable)this.d);
    }
}
