import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class jeh extends jek
{
    private final WatchNextResponseModel a;
    
    public jeh(final WatchNextResponseModel a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null watchNextResponseModel");
    }
    
    public WatchNextResponseModel a() {
        return this.a;
    }
    
    public boolean equals(final Object o) {
        return o == this || (o instanceof jek && this.a.equals(((jek)o).a()));
    }
    
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("UpdateWatchPlaylistPanelEvent{watchNextResponseModel=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
