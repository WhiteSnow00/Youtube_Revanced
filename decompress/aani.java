import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aani
{
    public static final aani a;
    private final abkb b;
    private final PlayerResponseModel c;
    private final WatchNextResponseModel d;
    private final aiqj e;
    
    static {
        a = new aani(abkb.a, null, null, null);
    }
    
    public aani(final abkb b, final PlayerResponseModel c, final WatchNextResponseModel d, final aiqj e) {
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
    
    public abkb c() {
        return this.b;
    }
    
    public aiqj d() {
        return this.e;
    }
}
