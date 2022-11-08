import java.util.Arrays;
import android.graphics.PathEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzh
{
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final dzh dzh = (dzh)o;
                if (dzh.a == this.a && dzh.b == this.b && dzh.c == this.c && dzh.d == this.d && this.e == dzh.e && this.f == dzh.f && this.g == dzh.g && this.h == dzh.h && col.j((Object)null, (Object)null) && Arrays.equals(this.j, dzh.j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((((int)this.a * 31 + (int)this.b) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 961 + Arrays.hashCode(this.j);
    }
}
