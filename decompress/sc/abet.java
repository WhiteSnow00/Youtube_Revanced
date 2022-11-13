import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abet implements Runnable, abfb
{
    private final abfc a;
    private final PlaybackStartDescriptor b;
    private final abjy c;
    private final acc d;
    
    public abet(final abfc a, final acc d, final PlaybackStartDescriptor b, final abjy c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Throwable t) {
    }
    
    public final void b(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            this.d.d((Throwable)new IllegalArgumentException("Empty prefetch response."));
        }
        if (!aakv.o(playerResponseModel.y())) {
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
        tbi.e();
        final abfc a = this.a;
        final PlaybackStartDescriptor b = this.b;
        final abjy c = this.c;
        a.a(b, c.b, (abfb)this, c.a, (zdj)null, (xan)null);
    }
}
