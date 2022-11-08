import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aalo
{
    public static final aalo a;
    private final abij b;
    private final PlayerResponseModel c;
    private final WatchNextResponseModel d;
    private final aioe e;
    
    static {
        a = new aalo(abij.a, null, null, null);
    }
    
    public aalo(final abij b, final PlayerResponseModel c, final WatchNextResponseModel d, final aioe e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public WatchNextResponseModel a() {
        return this.d;
    }
    
    public PlayerResponseModel b() {
        return this.c;
    }
    
    public abij c() {
        return this.b;
    }
    
    public aioe d() {
        return this.e;
    }
}
