import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public class aebx extends adzz
{
    public final RectF g;
    
    public aebx(final aeae aeae) {
        aeae aeae2 = aeae;
        if (aeae == null) {
            aeae2 = new aeae();
        }
        super(aeae2);
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
