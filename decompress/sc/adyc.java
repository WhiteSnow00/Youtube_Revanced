import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyc implements adyd
{
    private final adyd a;
    private final float b;
    
    public adyc(float b, adyd a) {
        while (a instanceof adyc) {
            a = ((adyc)a).a;
            b += ((adyc)a).b;
        }
        this.a = a;
        this.b = b;
    }
    
    public final float a(final RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof adyc)) {
            return false;
        }
        final adyc adyc = (adyc)o;
        return this.a.equals(adyc.a) && this.b == adyc.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
