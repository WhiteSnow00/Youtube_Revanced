import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcp extends zpe
{
    final hcq a;
    
    protected hcp(final hcq a) {
        this.a = a;
    }
    
    public final void a(final dbj exception) {
        ttr.d("SCMusicController: Error getting player response", exception.getCause());
        ((aftm)this).setException((Throwable)exception);
    }
    
    public final /* bridge */ void mX(final Object o) {
        final PlayerResponseModel playerResponseModel = (PlayerResponseModel)o;
        ((aftm)this).set((Object)playerResponseModel);
        this.a.m(playerResponseModel);
    }
}
