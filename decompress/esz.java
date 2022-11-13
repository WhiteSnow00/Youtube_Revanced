import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esz implements arkq, arll
{
    public final avi a;
    private final eqy b;
    private atke c;
    private atke d;
    private atke e;
    private atke f;
    private final esz g;
    
    public esz() {
    }
    
    public esz(final eqy b, final avi a) {
        this.g = this;
        this.b = b;
        this.a = a;
        this.c = (atke)new erf(b, this, 0);
        this.d = (atke)new erf(b, this, 1);
        this.e = (atke)new erf(b, this, 2);
        this.f = (atke)new erf(b, this, 3);
    }
    
    public final Map a() {
        return afev.p("com.google.android.libraries.youtube.metadataeditor.thumbnail.FrameSelectorVideoViewModel", this.c, "com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel", this.d, "com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.LocalMediaGreenScreenControllerViewModel", this.e, "com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel", this.f);
    }
}
