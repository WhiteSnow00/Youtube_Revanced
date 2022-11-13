import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView$ScaleType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeo extends dst
{
    @dyi(a = 0)
    @dyj(a = dyk.a)
    float a;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    int b;
    
    private eeo() {
        super("SolidColor");
        this.a = -1.0f;
    }
    
    public static een b(final dsx dsx) {
        final een een = new een();
        een.d(een, dsx, new eeo());
        return een;
    }
    
    protected final dst c(final dsx dsx) {
        final float a = this.a;
        int f;
        if (a >= 0.0f) {
            f = ahz.f(0, (int)(Math.min(1.0f, a) * 255.0f));
        }
        else {
            f = 0;
        }
        final ecm ecm = new ecm();
        ecm.d(ecm, dsx, new ecn());
        ecm.a.b = ImageView$ScaleType.FIT_XY;
        ecm.a.a = (Drawable)new ColorDrawable(f);
        ecm.d.set(0);
        return ecm.c();
    }
}
