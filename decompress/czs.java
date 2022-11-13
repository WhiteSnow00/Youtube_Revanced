import android.graphics.PointF;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public class czs
{
    private final ctv a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public PointF m;
    public PointF n;
    private float o;
    private float p;
    
    public czs(final ctv a, final Object b, final Object c, final Interpolator d, final float g, final Float h) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = g;
        this.h = h;
    }
    
    public czs(final ctv a, final Object b, final Object c, final Interpolator e, final Interpolator f, final float g) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = null;
    }
    
    protected czs(final ctv a, final Object b, final Object c, final Interpolator d, final Interpolator e, final Interpolator f, final float g, final Float h) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public czs(final Object o) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = o;
        this.c = o;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.MAX_VALUE;
    }
    
    public final float b() {
        final ctv a = this.a;
        final float n = 1.0f;
        if (a == null) {
            return 1.0f;
        }
        float p = this.p;
        if (p == Float.MIN_VALUE) {
            if (this.h == null) {
                this.p = 1.0f;
                p = n;
            }
            else {
                p = (this.h - this.g) / this.a.b() + this.c();
                this.p = p;
            }
        }
        return p;
    }
    
    public final float c() {
        final ctv a = this.a;
        if (a == null) {
            return 0.0f;
        }
        float o;
        if ((o = this.o) == Float.MIN_VALUE) {
            o = (this.g - a.h) / a.b();
            this.o = o;
        }
        return o;
    }
    
    public final boolean d(final float n) {
        return n >= this.c() && n < this.b();
    }
    
    public final boolean e() {
        return this.d == null && this.e == null && this.f == null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final float g = this.g;
        final Float h = this.h;
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(value);
        sb.append(", endValue=");
        sb.append(value2);
        sb.append(", startFrame=");
        sb.append(g);
        sb.append(", endFrame=");
        sb.append(h);
        sb.append(", interpolator=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
