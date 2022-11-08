import android.graphics.Canvas;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class adwt
{
    static final Matrix c;
    final Matrix d;
    
    static {
        c = new Matrix();
    }
    
    public adwt() {
        this.d = new Matrix();
    }
    
    public abstract void a(final Matrix p0, final advy p1, final int p2, final Canvas p3);
    
    public final void c(final advy advy, final int n, final Canvas canvas) {
        this.a(adwt.c, advy, n, canvas);
    }
}
