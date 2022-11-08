import java.util.Iterator;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import java.util.function.Function;
import j$.util.Optional;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fno implements abmk, abjd
{
    public final Set a;
    public fnl b;
    private final arhr c;
    private final Map d;
    private final Map e;
    private final boolean f;
    
    public fno(final arhr c, final atjj atjj, final atjj atjj2, final arhr arhr, final arhr arhr2, final uyf uyf) {
        this.c = c;
        this.b = fnl.a;
        final afct h = afcw.h();
        h.g((Object)fnl.a, (Object)atjj);
        h.g((Object)fnl.b, (Object)atjj2);
        this.d = (Map)h.c();
        final afct h2 = afcw.h();
        h2.g((Object)fnl.a, (Object)arhr);
        h2.g((Object)fnl.b, (Object)arhr2);
        this.e = (Map)h2.c();
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        anqa anqa;
        if ((anqa = uyf.b().A) == null) {
            anqa = anqa.a;
        }
        this.f = anqa.d;
    }
    
    public final abjc a(final PlaybackStartDescriptor playbackStartDescriptor) {
        return (abjc)Optional.ofNullable((Object)this.e.get(this.b)).map((Function)new fnm(playbackStartDescriptor, 2)).orElse((Object)null);
    }
    
    public final abmj b(final PlaybackStartDescriptor playbackStartDescriptor) {
        final abmk abmk = (abmk)Optional.ofNullable((Object)this.d.get(this.b)).map((Function)fan.g).orElse((Object)null);
        abmk.getClass();
        return abmk.b(playbackStartDescriptor);
    }
    
    public final abmj c(final SequencerState sequencerState) {
        return (abmj)Optional.ofNullable((Object)this.d.get(this.b)).map((Function)fan.g).map((Function)new fnm(sequencerState, 0)).orElse((Object)null);
    }
    
    public final void d(final fnn fnn) {
        this.a.add(fnn);
    }
    
    public final void e(final fnl b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((fnn)iterator.next()).o(b);
        }
        if (!this.f) {
            ((abno)this.c.a()).t();
        }
    }
    
    public final boolean f(final PlaybackStartDescriptor playbackStartDescriptor, final abmj abmj) {
        final abmk abmk = (abmk)Optional.ofNullable((Object)this.d.get(this.b)).map((Function)fan.g).orElse((Object)null);
        abmk.getClass();
        return abmk.f(playbackStartDescriptor, abmj);
    }
}
