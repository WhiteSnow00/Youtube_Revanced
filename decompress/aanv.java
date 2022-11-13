import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aanv
{
    public static final aanv a;
    private final WatchNextResponseModel b;
    private final PlaybackStartDescriptor c;
    
    static {
        a = new aanv(null, null);
    }
    
    public aanv(final PlaybackStartDescriptor c, final WatchNextResponseModel b) {
        this.b = b;
        this.c = c;
    }
    
    public WatchNextResponseModel a() {
        return this.b;
    }
    
    public PlaybackStartDescriptor b() {
        return this.c;
    }
}
