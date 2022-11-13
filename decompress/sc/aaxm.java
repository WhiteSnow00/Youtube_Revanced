import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxm implements aaxo
{
    final aaxq a;
    private final aiqj b;
    private final int c;
    private final Object d;
    
    public aaxm(final aaxq a, final WatchNextResponseModel d, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public aaxm(final aaxq a, final PlayerResponseModel d, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final aaxp a(final aiqj aiqj) {
        if (this.c != 0) {
            return new aaxp(this.a, aiqj, true);
        }
        return new aaxp(this.a, aiqj, true);
    }
    
    @Override
    public final aaxu b() {
        if (this.c != 0) {
            return aaxu.c;
        }
        return aaxu.d;
    }
    
    @Override
    public final aiqj c() {
        if (this.c != 0) {
            return this.b;
        }
        return this.b;
    }
    
    @Override
    public final Optional d(final aani aani) {
        if (this.c != 0) {
            return Optional.of((Object)new aaxm(this.a, aani.a(), aani.d(), 0));
        }
        return Optional.empty();
    }
    
    @Override
    public final void e() {
        if (this.c != 0) {
            final aawy a = this.a.a;
            a.c((xag)a.f, (PlayerResponseModel)this.d, a.g);
            return;
        }
        final aawy a2 = this.a.a;
        a2.d((xag)a2.f, (WatchNextResponseModel)this.d, a2.g);
    }
}
