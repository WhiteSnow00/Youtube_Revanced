import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class aawd extends aawg
{
    private final aave a;
    private final wyg b;
    private final aioe c;
    
    public aawd(final aave a, final wyg b, final aioe c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final aawg a() {
        this.a.l(this.b);
        return new aawe(this.c);
    }
    
    public final aawg b(final aioe aioe) {
        this.a.l(this.b);
        this.a.r(true);
        return new aawf(this.a, aioe);
    }
    
    public final aexr c(final PlayerResponseModel playerResponseModel, final String s) {
        return aexr.a((Object)this, (Object)Optional.of((Object)this.a.c(this.b, playerResponseModel, s)));
    }
    
    public final aexr d(final WatchNextResponseModel watchNextResponseModel, final String s) {
        if (watchNextResponseModel == null) {
            return aexr.a((Object)this, (Object)Optional.empty());
        }
        return aexr.a((Object)this, (Object)Optional.of((Object)this.a.d(this.b, watchNextResponseModel, s)));
    }
    
    public final aioe e() {
        return this.c;
    }
}
