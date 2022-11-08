import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawf extends aawg
{
    private final aave a;
    private final aioe b;
    
    public aawf(final aave a, final aioe b) {
        this.a = a;
        this.b = b;
    }
    
    public final aawg a() {
        return new aawe(this.b);
    }
    
    public final aawg b(final aioe aioe) {
        this.a.r(true);
        return new aawf(this.a, aioe);
    }
    
    public final aexr c(final PlayerResponseModel playerResponseModel, final String s) {
        return this.f().c(playerResponseModel, s);
    }
    
    public final aexr d(final WatchNextResponseModel watchNextResponseModel, final String s) {
        return this.f().d(watchNextResponseModel, s);
    }
    
    public final aioe e() {
        return this.b;
    }
    
    public final aawg f() {
        final aave a = this.a;
        return new aawd(a, a.b(this.b), this.b);
    }
}
