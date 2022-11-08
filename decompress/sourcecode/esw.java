import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esw implements arib, ariw
{
    public final avh a;
    private final eqv b;
    private atjj c;
    private atjj d;
    private atjj e;
    private atjj f;
    private final esw g;
    
    public esw() {
    }
    
    public esw(final eqv b, final avh a) {
        this.g = this;
        this.b = b;
        this.a = a;
        this.c = new erc(b, this, 0, 0);
        this.d = new erc(b, this, 1, 0);
        this.e = new erc(b, this, 2, 0);
        this.f = new erc(b, this, 3, 0);
    }
    
    @Override
    public final Map a() {
        return (Map)afcw.p((Object)"com.google.android.libraries.youtube.metadataeditor.thumbnail.FrameSelectorVideoViewModel", (Object)this.c, (Object)"com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel", (Object)this.d, (Object)"com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.LocalMediaGreenScreenControllerViewModel", (Object)this.e, (Object)"com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel", (Object)this.f);
    }
}
