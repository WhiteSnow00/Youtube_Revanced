import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aben implements abeb
{
    public final atjj a;
    public WeakReference b;
    private final atjj c;
    private final Set d;
    
    public aben(final atjj a, final atjj c) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.d = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    final Object b() {
        final Object o = new Object();
        this.d.add(o);
        return o;
    }
    
    final void c(final Object o) {
        this.d.remove(o);
    }
    
    public final void d(final fqh fqh, final aepj aepj, final boolean b) {
        final abno abno = (abno)this.a.a();
        final abni abni = (abni)this.c.a();
        if (fqh == null) {
            if (abno.p() != null) {
                abno.I();
            }
            return;
        }
        PlaybackStartDescriptor playbackStartDescriptor;
        if (aepj != null) {
            if (((abno)((aben)aepj.a).a.a()).f()) {
                playbackStartDescriptor = fqh.a();
            }
            else {
                final abhx e = fqh.a().e();
                e.c(true);
                playbackStartDescriptor = e.a();
            }
        }
        else {
            playbackStartDescriptor = fqh.a();
        }
        if (b) {
            abno.I();
        }
        else if (abno.S(playbackStartDescriptor)) {
            return;
        }
        abni.d(playbackStartDescriptor);
    }
}
