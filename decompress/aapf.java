import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aapf
{
    public static final aapf a;
    private final abli b;
    private final PlayerResponseModel c;
    private final WatchNextResponseModel d;
    private final aisc e;
    
    static {
        a = new aapf(abli.a, null, null, null);
    }
    
    public aapf(final abli b, final PlayerResponseModel c, final WatchNextResponseModel d, final aisc e) {
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
    
    public abli c() {
        return this.b;
    }
    
    public aisc d() {
        return this.e;
    }
}
