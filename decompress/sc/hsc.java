import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsc implements abkw
{
    private final hsh a;
    private final afaq b;
    private final arwh c;
    private final lkx d;
    
    public hsc(final hsh a, final lkx d, final arwh c, final afaq b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abjt abjt, final boolean b) {
        if (((ahbc)playbackStartDescriptor.b).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) == null) {
            return new Pair((Object)null, (Object)null);
        }
        return new Pair((Object)this.b(playbackStartDescriptor.k(), s, playbackStartDescriptor, abjt, b), (Object)this.d(playbackStartDescriptor, abjt));
    }
    
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final boolean b) {
        final aiqj b2 = playbackStartDescriptor.b;
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)b2).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = null;
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null) {
            return null;
        }
        final zpe zpe = new zpe();
        ansk ansk;
        if ((ansk = this.c.f().u) == null) {
            ansk = ansk.a;
        }
        answ answ;
        if ((answ = ansk.d) == null) {
            answ = answ.a;
        }
        if (answ.B && !TextUtils.isEmpty((CharSequence)s)) {
            final lkx d = this.d;
            final zdj h = abjt.h;
            playbackStartDescriptor.g = true;
            final aiqj b3 = playbackStartDescriptor.b;
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = reelWatchEndpointOuterClass$ReelWatchEndpoint2;
            if (b3 != null) {
                reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)b3).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            }
            return ((abkz)d.f).l(playbackStartDescriptor, s2, true, d.k(reelWatchEndpointOuterClass$ReelWatchEndpoint3, s2, h));
        }
        final hsh a = this.a;
        final zdj h2 = abjt.h;
        boolean b4 = false;
        Label_0273: {
            Label_0270: {
                if (playbackStartDescriptor.f) {
                    if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
                        final answ answ2 = (answ)this.b.a();
                        if (answ2 == null || !answ2.F) {
                            if (vjf.f(this.c, playbackStartDescriptor.f(), s2, playbackStartDescriptor.c(), h2, playbackStartDescriptor.y()) == null) {
                                break Label_0270;
                            }
                        }
                        b4 = true;
                        break Label_0273;
                    }
                }
            }
            b4 = false;
        }
        a.d(b2, s2, false, false, b4, zpg.a, (zpf)zpe);
        return (ListenableFuture)zpe;
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abjt abjt) {
        return null;
    }
    
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        final zpe zpe = new zpe();
        ((aftm)zpe).set((Object)null);
        return (ListenableFuture)zpe;
    }
    
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final abjy abjy, final xan xan) {
        ansk ansk;
        if ((ansk = this.c.f().u) == null) {
            ansk = ansk.a;
        }
        answ answ;
        if ((answ = ansk.d) == null) {
            answ = answ.a;
        }
        if (!answ.B) {
            return null;
        }
        final lkx d = this.d;
        final long a = abjy.a;
        playbackStartDescriptor.g = true;
        return ((abkz)d.f).m(playbackStartDescriptor, abjy.b.b(), xan, a);
    }
    
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final ancs ancs, final xan xan) {
        ansk ansk;
        if ((ansk = this.c.f().u) == null) {
            ansk = ansk.a;
        }
        answ answ;
        if ((answ = ansk.d) == null) {
            answ = answ.a;
        }
        if (!answ.B) {
            return null;
        }
        return this.d.l(playbackStartDescriptor, ancs, xan);
    }
    
    public final asht g(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abjt abjt) {
        final Pair a = this.a(playbackStartDescriptor, s, abjt, true);
        return asht.ad(vdh.aZ((ListenableFuture)a.first).J((asjr)hsb.b).k(), vdh.aZ((ListenableFuture)a.second).J((asjr)hsb.a).k()).k();
    }
}
