import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaps
{
    public static final aaps a;
    private final WatchNextResponseModel b;
    private final PlaybackStartDescriptor c;
    
    static {
        a = new aaps(null, null);
    }
    
    public aaps(final PlaybackStartDescriptor c, final WatchNextResponseModel b) {
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
