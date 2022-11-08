import android.graphics.Rect;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgq
{
    public final Bitmap a;
    private final Rect b;
    
    public abgq() {
    }
    
    public abgq(final Bitmap a, final Rect b) {
        this.a = a;
        this.b = b;
    }
    
    public static abgq a(final Bitmap bitmap) {
        return new abgq(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abgq) {
            final abgq abgq = (abgq)o;
            if (this.a.equals(abgq.a) && this.b.equals((Object)abgq.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("StoryboardFrame{mosaic=");
        sb.append(string);
        sb.append(", rect=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
