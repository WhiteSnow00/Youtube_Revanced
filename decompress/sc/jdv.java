import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdv implements kzz
{
    public final jds a;
    public final jdu b;
    public final Rect c;
    public final msr d;
    
    public jdv(final jds a, final jdu b, final msr d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = new Rect();
        this.b = b;
        this.d = d;
    }
    
    public final Rect a(Rect rect) {
        rect = new Rect(rect);
        rect.left += this.c.left;
        rect.right -= this.c.right;
        return this.a.a(rect);
    }
    
    public final void g(final pvh pvh) {
        this.a.g(pvh);
    }
    
    public final void h(final pvh pvh) {
        this.a.h(pvh);
    }
}
