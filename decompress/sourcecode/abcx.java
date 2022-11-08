import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcx implements Runnable, abdg
{
    private final abdh a;
    private final PlaybackStartDescriptor b;
    private final abig c;
    private final acb d;
    
    public abcx(final abdh a, final acb d, final PlaybackStartDescriptor b, final abig c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            this.d.d((Throwable)new IllegalArgumentException("Empty prefetch response."));
        }
        if (!aaja.o(playerResponseModel.y())) {
            this.d.d((Throwable)new IllegalArgumentException("Prefetch not playable."));
        }
    }
    
    public final void c(final int n) {
        if (n == 4) {
            this.d.d((Throwable)new IllegalArgumentException("Prefetch failed."));
        }
    }
    
    @Override
    public final void run() {
        szc.e();
        final abdh a = this.a;
        final PlaybackStartDescriptor b = this.b;
        final abig c = this.c;
        a.a(b, c.b, (abdg)this, c.a, (zbq)null, (wyn)null);
    }
}
