import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ihw
{
    public final afeq a;
    public final afev b;
    public final int c;
    
    public ihw() {
    }
    
    public ihw(final afeq a, final afev b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ihw) {
            final ihw ihw = (ihw)o;
            if (agpi.V((List)this.a, ihw.a) && agpi.N(this.b, ihw.b) && this.c == ihw.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("PlaylistRefreshConditions{playlistIdsToRefresh=");
        sb.append(value);
        sb.append(", playlistIdToStreamDownloadConditionMap=");
        sb.append(value2);
        sb.append(", nextPlaylistAutoSyncIntervalSecs=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
