import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeab implements adzu
{
    private final float a;
    
    public aeab(final float a) {
        this.a = a;
    }
    
    public final float a(final RectF rectF) {
        return this.a * Math.min(rectF.width(), rectF.height());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aeab && this.a == ((aeab)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
