import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.features.queue.PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jes implements abok
{
    private final aboe a;
    private final abfz b;
    private final arkg c;
    private final asid d;
    private final vai e;
    private final elx f;
    private final agkz g;
    
    public jes(final aboe a, final agkz g, final abfz b, final arkg c, final vai e, final asid d, final elx f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = f;
    }
    
    private final aboq a(final aboq aboq) {
        final jer jer = new jer(aboq, (abon)aboq, (abor)aboq, this.c, this.b, this.e, this.d, (asht)this.f.j());
        jer.c = jer.b.af(jer.a).aH((asjm)new jdq(jer, 4));
        return jer;
    }
    
    @Override
    public final aboj b(final PlaybackStartDescriptor playbackStartDescriptor) {
        Object b;
        if (!playbackStartDescriptor.i().isEmpty()) {
            b = this.b.b(playbackStartDescriptor);
        }
        else {
            b = new abom(playbackStartDescriptor.i(), this.a.d(), (aezs)iim.f);
        }
        return (aboj)this.g.I(this.a((aboq)b));
    }
    
    @Override
    public final aboj c(final SequencerState sequencerState) {
        if (!(sequencerState instanceof OmegaSequencerState)) {
            return null;
        }
        final SequenceNavigatorState c = ((OmegaSequencerState)sequencerState).c;
        Object c2;
        if (c instanceof AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState) {
            c2 = new abom((AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState)c, (aezs)iim.g);
        }
        else if (c instanceof PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState) {
            c2 = this.b.c((PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState)c);
        }
        else {
            c2 = null;
        }
        if (c2 == null) {
            return null;
        }
        return (aboj)this.g.I(this.a((aboq)c2));
    }
    
    @Override
    public final boolean f(final PlaybackStartDescriptor playbackStartDescriptor, final aboj aboj) {
        if (!(aboj instanceof aboh)) {
            return false;
        }
        if (playbackStartDescriptor.i().isEmpty()) {
            return ((aboh)aboj).k((Class)abgd.class);
        }
        return ((aboh)aboj).k((Class)abom.class);
    }
}
