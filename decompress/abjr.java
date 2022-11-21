import android.graphics.Rect;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjr
{
    public final Bitmap a;
    private final Rect b;
    
    public abjr() {
    }
    
    public abjr(final Bitmap a, final Rect b) {
        this.a = a;
        this.b = b;
    }
    
    public static abjr a(final Bitmap bitmap) {
        return new abjr(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abjr) {
            final abjr abjr = (abjr)o;
            if (this.a.equals(abjr.a) && this.b.equals((Object)abjr.b)) {
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
