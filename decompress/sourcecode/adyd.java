import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public class adyd extends adwf
{
    public final RectF g;
    
    public adyd(final adwk adwk) {
        adwk adwk2 = adwk;
        if (adwk == null) {
            adwk2 = new adwk();
        }
        super(adwk2);
        this.g = new RectF();
    }
    
    public final void z(final float n, final float n2, final float n3, final float n4) {
        if (n == this.g.left && n2 == this.g.top && n3 == this.g.right && n4 == this.g.bottom) {
            return;
        }
        this.g.set(n, n2, n3, n4);
        this.invalidateSelf();
    }
}
