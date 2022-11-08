import j$.util.Objects;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otx
{
    public float a;
    public int b;
    public RectCornersProxy c;
    public Drawable d;
    public cdn e;
    
    public otx() {
        this.a = 0.0f;
        this.b = 0;
        this.e = null;
        this.d = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof otx) {
            final otx otx = (otx)o;
            if (Objects.equals((Object)this.d, (Object)otx.d) && (long)(this.a * 10000.0f) == (long)(otx.a * 10000.0f) && Objects.equals((Object)this.e, (Object)otx.e) && this.b == otx.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.d, this.a, this.e, this.b });
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final float a = this.a;
        final String value2 = String.valueOf(this.e);
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("StyleBuilderImpl(backgroundDrawable:");
        sb.append(value);
        sb.append(", cornerRadiusPx:");
        sb.append(a);
        sb.append(", border:");
        sb.append(value2);
        sb.append(", borderColor:");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
