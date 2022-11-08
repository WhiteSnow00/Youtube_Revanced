import com.google.common.util.concurrent.ListenableFuture;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaaq implements abjc
{
    private final aabh a;
    private final aabm b;
    
    public aaaq(final aabh a, final aabm b) {
        this.a = a;
        this.b = b;
    }
    
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abib abib, final boolean b) {
        return new Pair((Object)this.a.a(playbackStartDescriptor), (Object)this.g(playbackStartDescriptor));
    }
    
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abib abib, final boolean b) {
        return this.a.a(playbackStartDescriptor);
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abib abib) {
        return this.a.b(playbackStartDescriptor);
    }
    
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abib abib) {
        return this.g(playbackStartDescriptor);
    }
    
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final abig abig, final wyn wyn) {
        return null;
    }
    
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final anao anao, final wyn wyn) {
        return this.a.a(playbackStartDescriptor);
    }
    
    protected final ListenableFuture g(final PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b.b(playbackStartDescriptor, true);
    }
}
