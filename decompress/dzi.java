import java.util.Arrays;
import android.graphics.PathEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzi
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
                final dzi dzi = (dzi)o;
                if (dzi.a == this.a && dzi.b == this.b && dzi.c == this.c && dzi.d == this.d && this.e == dzi.e && this.f == dzi.f && this.g == dzi.g && this.h == dzi.h && com.j((Object)null, (Object)null) && Arrays.equals(this.j, dzi.j)) {
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
