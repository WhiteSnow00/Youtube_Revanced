import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnu
{
    public final Bitmap a;
    public final aorm b;
    public final aorm c;
    
    public fnu() {
    }
    
    public fnu(final Bitmap a, final aorm b, final aorm c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fnu) {
            final fnu fnu = (fnu)o;
            final Bitmap a = this.a;
            if (a == null) {
                if (fnu.a != null) {
                    return false;
                }
            }
            else if (!a.equals(fnu.a)) {
                return false;
            }
            final aorm b = this.b;
            if (b == null) {
                if (fnu.b != null) {
                    return false;
                }
            }
            else if (!((agzi)b).equals((Object)fnu.b)) {
                return false;
            }
            final aorm c = this.c;
            final aorm c2 = fnu.c;
            if (c == null) {
                if (c2 != null) {
                    return false;
                }
            }
            else if (!((agzi)c).equals((Object)c2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Bitmap a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final aorm b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ((agzi)b).hashCode();
        }
        final aorm c = this.c;
        if (c != null) {
            hashCode = ((agzi)c).hashCode();
        }
        return ((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("PlaybackStartContext{videoThumbnailBitmap=");
        sb.append(value);
        sb.append(", videoThumbnail=");
        sb.append(value2);
        sb.append(", firstFrameThumbnail=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
