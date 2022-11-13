import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayb extends aayc
{
    private final aawy a;
    private final aiqj b;
    
    public aayb(final aawy a, final aiqj b) {
        this.a = a;
        this.b = b;
    }
    
    public final aayc a() {
        return new aaya(this.b);
    }
    
    public final aayc b(final aiqj aiqj) {
        this.a.r(true);
        return new aayb(this.a, aiqj);
    }
    
    public final aezq c(final PlayerResponseModel playerResponseModel, final String s) {
        return this.f().c(playerResponseModel, s);
    }
    
    public final aezq d(final WatchNextResponseModel watchNextResponseModel, final String s) {
        return this.f().d(watchNextResponseModel, s);
    }
    
    public final aiqj e() {
        return this.b;
    }
    
    public final aayc f() {
        final aawy a = this.a;
        return new aaxz(a, a.b(this.b), this.b);
    }
}
