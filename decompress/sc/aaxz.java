import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxz extends aayc
{
    private final aawy a;
    private final xag b;
    private final aiqj c;
    
    public aaxz(final aawy a, final xag b, final aiqj c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final aayc a() {
        this.a.l(this.b);
        return new aaya(this.c);
    }
    
    @Override
    public final aayc b(final aiqj aiqj) {
        this.a.l(this.b);
        this.a.r(true);
        return new aayb(this.a, aiqj);
    }
    
    @Override
    public final aezq c(final PlayerResponseModel playerResponseModel, final String s) {
        return aezq.a((Object)this, (Object)Optional.of((Object)this.a.c(this.b, playerResponseModel, s)));
    }
    
    @Override
    public final aezq d(final WatchNextResponseModel watchNextResponseModel, final String s) {
        if (watchNextResponseModel == null) {
            return aezq.a((Object)this, (Object)Optional.empty());
        }
        return aezq.a((Object)this, (Object)Optional.of((Object)this.a.d(this.b, watchNextResponseModel, s)));
    }
    
    @Override
    public final aiqj e() {
        return this.c;
    }
}
