import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abof implements abok
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public abof(final acxl c, final agkz b, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public abof(final hzn b, final agkz c, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final aboj b(final PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.a != 0) {
            final aiqj b = playbackStartDescriptor.b;
            boolean b2 = false;
            if (b != null) {
                b2 = b2;
                if (((ahbc)b).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    b2 = true;
                }
            }
            adkp.M(b2, "[%s] should be reel playback", (Object)playbackStartDescriptor);
            return (aboj)((agkz)this.c).I((aboq)((hzn)this.b).k());
        }
        tbi.f();
        final Object c = this.c;
        playbackStartDescriptor.getClass();
        Object o;
        if (playbackStartDescriptor.l() != null) {
            o = new abos(playbackStartDescriptor);
        }
        else {
            final String i = playbackStartDescriptor.i();
            final acxl acxl = (acxl)c;
            o = new abom(i, ((aboe)acxl.b).d(), (aezs)acxl.a);
        }
        return (aboj)((agkz)this.b).I((aboq)o);
    }
    
    public final aboj c(final SequencerState sequencerState) {
        if (this.a != 0) {
            if (sequencerState instanceof OmegaSequencerState) {
                if (((OmegaSequencerState)sequencerState).c instanceof ReelSequenceNavigator$ReelSequenceNavigatorState) {
                    return (aboj)((agkz)this.c).I((aboq)((hzn)this.b).k());
                }
            }
            return null;
        }
        if (sequencerState != null) {
            if (sequencerState instanceof OmegaSequencerState) {
                final Object c = this.c;
                final SequenceNavigatorState c2 = ((OmegaSequencerState)sequencerState).c;
                Object o;
                if (c2 instanceof VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) {
                    o = new abos((VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState)c2);
                }
                else if (c2 instanceof AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState) {
                    o = new abom((AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState)c2, (aezs)((acxl)c).a);
                }
                else {
                    o = null;
                }
                if (o != null) {
                    return (aboj)((agkz)this.b).I((aboq)o);
                }
            }
            else {
                zlm.b(zll.a, zlk.j, "Sequencer state restoration failed: ".concat(String.valueOf(sequencerState.getClass().getSimpleName())));
            }
        }
        return null;
    }
    
    public final boolean f(final PlaybackStartDescriptor playbackStartDescriptor, final aboj aboj) {
        return false;
    }
}
