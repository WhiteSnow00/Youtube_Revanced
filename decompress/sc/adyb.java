import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyb implements adyd
{
    private final float a;
    
    public adyb(final float a) {
        this.a = a;
    }
    
    public final float a(final RectF rectF) {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof adyb && this.a == ((adyb)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
