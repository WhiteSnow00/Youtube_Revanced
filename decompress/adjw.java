import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjw
{
    public final Uri a;
    public final aezp b;
    public final aezp c;
    
    public adjw() {
    }
    
    public adjw(final Uri a, final aezp b, final aezp c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static asbe a(final Uri a) {
        a.getClass();
        final asbe asbe = new asbe((byte[])null, (byte[])null, (byte[])null);
        asbe.a = a;
        final aeyo a2 = aeyo.a;
        asbe.b = a2;
        asbe.c = a2;
        return asbe;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adjw) {
            final adjw adjw = (adjw)o;
            if (this.a.equals((Object)adjw.a) && this.b.equals((Object)adjw.b) && this.c.equals((Object)adjw.c)) {
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
