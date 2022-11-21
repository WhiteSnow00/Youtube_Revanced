import com.google.common.util.concurrent.ListenableFuture;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaeh implements abmd
{
    private final aafa a;
    private final aaff b;
    
    public aaeh(final aafa a, final aaff b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abla abla, final boolean b) {
        return new Pair((Object)this.a.a(playbackStartDescriptor), (Object)this.h(playbackStartDescriptor));
    }
    
    @Override
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final boolean b) {
        return this.a.a(playbackStartDescriptor);
    }
    
    @Override
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abla abla) {
        return this.a.b(playbackStartDescriptor);
    }
    
    @Override
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla) {
        return this.h(playbackStartDescriptor);
    }
    
    @Override
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final ablf ablf, final xbt xbt) {
        return null;
    }
    
    @Override
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final anez anez, final xbt xbt) {
        return this.a.a(playbackStartDescriptor);
    }
    
    @Override
    public final askp g(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abla abla) {
        final Pair a = this.a(playbackStartDescriptor, s, abla, true);
        return askp.ad(ume.N((ListenableFuture)a.first).J((asmn)zjn.n).k(), ume.N((ListenableFuture)a.second).J((asmn)zjn.o).k()).k();
    }
    
    protected final ListenableFuture h(final PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b.b(playbackStartDescriptor, true);
    }
}
