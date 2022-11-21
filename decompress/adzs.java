import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzs implements adzu
{
    private final float a;
    
    public adzs(final float a) {
        this.a = a;
    }
    
    public final float a(final RectF rectF) {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof adzs && this.a == ((adzs)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
