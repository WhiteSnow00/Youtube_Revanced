import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class jem
{
    public final afeq a;
    public final int b;
    
    public jem() {
    }
    
    public jem(final afeq a, final int b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null playlistPanelVideos");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jem) {
            final jem jem = (jem)o;
            if (agpi.V((List)this.a, (Object)jem.a) && this.b == jem.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("PlaylistPanelVideosAndPlaybackPosition{playlistPanelVideos=");
        sb.append(value);
        sb.append(", playbackPosition=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
