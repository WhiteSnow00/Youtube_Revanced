import java.util.List;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class oyo
{
    public final double a;
    public final double b;
    public final double c;
    public final Integer d;
    public final afcr e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double j;
    private final double k;
    private final Rect l;
    private final Rect m;
    
    public oyo() {
    }
    
    public oyo(final double a, final double f, final double g, final double b, final double h, final double i, final double c, final double j, final double k, final Rect l, final Rect m, final Integer d, final afcr e) {
        this.a = a;
        this.f = f;
        this.g = g;
        this.b = b;
        this.h = h;
        this.i = i;
        this.c = c;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.d = d;
        this.e = e;
    }
    
    static oyn a() {
        final oyn oyn = new oyn();
        oyn.b(-1.0);
        oyn.c(-1.0);
        oyn.f(-1.0);
        oyn.k(-1.0);
        oyn.e(-1.0);
        oyn.h(-1.0);
        oyn.j(-1.0);
        oyn.d(-1.0);
        oyn.g(-1.0);
        final Long value = 0L;
        oyn.i(afcr.v((Object)value, (Object)value, (Object)value, (Object)value, (Object)value));
        return oyn;
    }
    
    private static Double[] g(final double n, final double n2, final double n3) {
        if (n == n2 && n3 == n2) {
            return new Double[] { n2 };
        }
        return new Double[] { n, n2, n3 };
    }
    
    public final Double[] b() {
        return g(this.g, this.a, this.f);
    }
    
    public final Double[] c() {
        return g(this.k, this.c, this.j);
    }
    
    public final Double[] d() {
        return g(this.i, this.b, this.h);
    }
    
    public final Integer[] e() {
        final Rect m = this.m;
        if (m != null) {
            return new Integer[] { m.top, m.left, m.bottom, m.right };
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oyo) {
            final oyo oyo = (oyo)o;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(oyo.a) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(oyo.f) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(oyo.g) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(oyo.b) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(oyo.h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(oyo.i) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(oyo.c) && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(oyo.j) && Double.doubleToLongBits(this.k) == Double.doubleToLongBits(oyo.k)) {
                final Rect l = this.l;
                if (l == null) {
                    if (oyo.l != null) {
                        return false;
                    }
                }
                else if (!l.equals((Object)oyo.l)) {
                    return false;
                }
                final Rect m = this.m;
                if (m == null) {
                    if (oyo.m != null) {
                        return false;
                    }
                }
                else if (!m.equals((Object)oyo.m)) {
                    return false;
                }
                final Integer d = this.d;
                if (d == null) {
                    if (oyo.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(oyo.d)) {
                    return false;
                }
                if (adwd.ar((List)this.e, oyo.e)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final Integer[] f() {
        final Rect l = this.l;
        final Integer[] array = new Integer[4];
        if (l != null) {
            array[0] = l.top;
            array[1] = l.left;
            array[2] = l.bottom;
            array[3] = l.right;
        }
        else {
            final Integer value = 0;
            array[1] = (array[0] = value);
            array[3] = (array[2] = value);
        }
        return array;
    }
    
    @Override
    public final int hashCode() {
        final int n = (int)(Double.doubleToLongBits(this.a) >>> 32 ^ Double.doubleToLongBits(this.a));
        final int n2 = (int)(Double.doubleToLongBits(this.f) >>> 32 ^ Double.doubleToLongBits(this.f));
        final int n3 = (int)(Double.doubleToLongBits(this.g) >>> 32 ^ Double.doubleToLongBits(this.g));
        final int n4 = (int)(Double.doubleToLongBits(this.b) >>> 32 ^ Double.doubleToLongBits(this.b));
        final int n5 = (int)(Double.doubleToLongBits(this.h) >>> 32 ^ Double.doubleToLongBits(this.h));
        final int n6 = (int)(Double.doubleToLongBits(this.i) >>> 32 ^ Double.doubleToLongBits(this.i));
        final int n7 = (int)(Double.doubleToLongBits(this.c) >>> 32 ^ Double.doubleToLongBits(this.c));
        final int n8 = (int)(Double.doubleToLongBits(this.j) >>> 32 ^ Double.doubleToLongBits(this.j));
        final int n9 = (int)(Double.doubleToLongBits(this.k) >>> 32 ^ Double.doubleToLongBits(this.k));
        final Rect l = this.l;
        int hashCode = 0;
        int hashCode2;
        if (l == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = l.hashCode();
        }
        final Rect m = this.m;
        int hashCode3;
        if (m == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = m.hashCode();
        }
        final Integer d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return this.e.hashCode() ^ ((((((((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003;
    }
    
    @Override
    public final String toString() {
        final double a = this.a;
        final double f = this.f;
        final double g = this.g;
        final double b = this.b;
        final double h = this.h;
        final double i = this.i;
        final double c = this.c;
        final double j = this.j;
        final double k = this.k;
        final String value = String.valueOf(this.l);
        final String value2 = String.valueOf(this.m);
        final Integer d = this.d;
        final String value3 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("QuartileSnapshot{exposure=");
        sb.append(a);
        sb.append(", maxExposure=");
        sb.append(f);
        sb.append(", minExposure=");
        sb.append(g);
        sb.append(", volume=");
        sb.append(b);
        sb.append(", maxVolume=");
        sb.append(h);
        sb.append(", minVolume=");
        sb.append(i);
        sb.append(", screenShare=");
        sb.append(c);
        sb.append(", maxScreenShare=");
        sb.append(j);
        sb.append(", minScreenShare=");
        sb.append(k);
        sb.append(", position=");
        sb.append(value);
        sb.append(", containerPosition=");
        sb.append(value2);
        sb.append(", instantaneousState=");
        sb.append(d);
        sb.append(", mtosBuckets=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
