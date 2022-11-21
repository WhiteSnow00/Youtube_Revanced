import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adll
{
    public final Uri a;
    public final afbh b;
    public final afbh c;
    
    public adll() {
    }
    
    public adll(final Uri a, final afbh b, final afbh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static asdz a(final Uri a) {
        a.getClass();
        final asdz asdz = new asdz((byte[])null, (byte[])null, (byte[])null);
        asdz.a = a;
        final afag a2 = afag.a;
        asdz.b = a2;
        asdz.c = a2;
        return asdz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adll) {
            final adll adll = (adll)o;
            if (this.a.equals((Object)adll.a) && this.b.equals(adll.b) && this.c.equals(adll.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("PendingMedia{uri=");
        sb.append(value);
        sb.append(", presetFrontendId=");
        sb.append(value2);
        sb.append(", presetThumbnailFilePath=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
