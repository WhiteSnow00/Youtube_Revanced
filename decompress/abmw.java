import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmw
{
    public final PlaybackStartDescriptor a;
    public final abla b;
    
    public abmw() {
    }
    
    public abmw(final PlaybackStartDescriptor a, final abla b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null playbackStartParameters");
    }
    
    public static abmw a(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla) {
        return new abmw(playbackStartDescriptor, abla);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abmw) {
            final abmw abmw = (abmw)o;
            if (this.a.equals(abmw.a) && this.b.equals(abmw.b)) {
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
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("WatchNextFetcherDescriptor{playbackStartDescriptor=");
        sb.append(string);
        sb.append(", playbackStartParameters=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
