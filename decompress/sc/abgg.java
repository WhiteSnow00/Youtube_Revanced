import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgg implements abfu
{
    public final atke a;
    public WeakReference b;
    private final atke c;
    private final Set d;
    
    public abgg(final atke a, final atke c) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.d = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final /* bridge */ void a(final Object o) {
        if (!this.d.isEmpty()) {
            return;
        }
        this.d((fqq)o, new afhd(this), false);
    }
    
    final Object b() {
        final Object o = new Object();
        this.d.add(o);
        return o;
    }
    
    final void c(final Object o) {
        this.d.remove(o);
    }
    
    public final void d(final fqq fqq, final afhd afhd, final boolean b) {
        final abpq abpq = (abpq)this.a.a();
        final abpl abpl = (abpl)this.c.a();
        if (fqq == null) {
            if (abpq.p() != null) {
                abpq.H();
            }
            return;
        }
        PlaybackStartDescriptor playbackStartDescriptor;
        if (afhd != null) {
            if (((abpq)((abgg)afhd.a).a.a()).f()) {
                playbackStartDescriptor = fqq.a();
            }
            else {
                final abjp e = fqq.a().e();
                e.c(true);
                playbackStartDescriptor = e.a();
            }
        }
        else {
            playbackStartDescriptor = fqq.a();
        }
        if (b) {
            abpq.H();
        }
        else if (abpq.R(playbackStartDescriptor)) {
            return;
        }
        abpl.d(playbackStartDescriptor);
    }
}
