import android.view.animation.Interpolator;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbv
{
    public final BitmapDrawable a;
    public float b;
    public final Rect c;
    public Interpolator d;
    public long e;
    public final Rect f;
    public int g;
    public float h;
    public float i;
    public long j;
    public boolean k;
    public boolean l;
    public dhf m;
    
    public cbv(final BitmapDrawable a, Rect bounds) {
        this.b = 1.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.a = a;
        this.f = bounds;
        bounds = new Rect(bounds);
        this.c = bounds;
        if (a != null) {
            a.setAlpha((int)(this.b * 255.0f));
            a.setBounds(bounds);
        }
    }
}
