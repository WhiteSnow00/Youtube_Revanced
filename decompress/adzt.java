import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzt implements adzu
{
    private final adzu a;
    private final float b;
    
    public adzt(float b, adzu a) {
        while (a instanceof adzt) {
            a = ((adzt)a).a;
            b += ((adzt)a).b;
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
        if (!(o instanceof adzt)) {
            return false;
        }
        final adzt adzt = (adzt)o;
        return this.a.equals(adzt.a) && this.b == adzt.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
