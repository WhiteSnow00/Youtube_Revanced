import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hub
{
    public final Uri a;
    public final String b;
    
    public hub() {
    }
    
    public hub(final Uri a, final String b) {
        if (a == null) {
            throw new NullPointerException("Null filePath");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoDuration");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hub) {
            final hub hub = (hub)o;
            if (this.a.equals((Object)hub.a) && this.b.equals(hub.b)) {
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
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("ThumbnailModel{filePath=");
        sb.append(string);
        sb.append(", videoDuration=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
