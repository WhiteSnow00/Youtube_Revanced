import java.util.Arrays;
import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cea
{
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;
    
    public cea(final int a, final int b) {
        this.c = Color.red(a);
        this.d = Color.green(a);
        this.e = Color.blue(a);
        this.a = a;
        this.b = b;
    }
    
    private final void d() {
        if (!this.f) {
            final int d = ahz.d(-1, this.a, 4.5f);
            final int d2 = ahz.d(-1, this.a, 3.0f);
            if (d != -1 && d2 != -1) {
                this.h = ahz.f(-1, d);
                this.g = ahz.f(-1, d2);
                this.f = true;
                return;
            }
            final int d3 = ahz.d(-16777216, this.a, 4.5f);
            final int d4 = ahz.d(-16777216, this.a, 3.0f);
            if (d3 != -1 && d4 != -1) {
                this.h = ahz.f(-16777216, d3);
                this.g = ahz.f(-16777216, d4);
                this.f = true;
                return;
            }
            int h;
            if (d != -1) {
                h = ahz.f(-1, d);
            }
            else {
                h = ahz.f(-16777216, d3);
            }
            this.h = h;
            int g;
            if (d2 != -1) {
                g = ahz.f(-1, d2);
            }
            else {
                g = ahz.f(-16777216, d4);
            }
            this.g = g;
            this.f = true;
        }
    }
    
    public final int a() {
        this.d();
        return this.h;
    }
    
    public final int b() {
        this.d();
        return this.g;
    }
    
    public final float[] c() {
        if (this.i == null) {
            this.i = new float[3];
        }
        ahz.g(this.c, this.d, this.e, this.i);
        return this.i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final cea cea = (cea)o;
                if (this.b == cea.b && this.a == cea.a) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(this.c()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        sb.append(Integer.toHexString(this.b()));
        sb.append("] [Body Text: #");
        sb.append(Integer.toHexString(this.a()));
        sb.append(']');
        return sb.toString();
    }
}
