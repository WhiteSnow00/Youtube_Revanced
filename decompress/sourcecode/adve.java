import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class adve
{
    final aduq a;
    protected advd b;
    
    public adve(final aduq a) {
        this.a = a;
    }
    
    public abstract int a();
    
    public abstract int b();
    
    public abstract void c(final Canvas p0, final Rect p1, final float p2);
    
    public abstract void d(final Canvas p0, final Paint p1, final float p2, final float p3, final int p4);
    
    public abstract void e(final Canvas p0, final Paint p1);
    
    final void f(final Canvas canvas, final Rect rect, final float n) {
        this.a.a();
        this.c(canvas, rect, n);
    }
}
