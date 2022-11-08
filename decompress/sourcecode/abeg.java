import java.util.Iterator;
import com.google.android.libraries.youtube.player.features.queue.PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.CopyOnWriteArraySet;
import android.util.SparseArray;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abeg
{
    private final aben a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final SparseArray e;
    private final abei f;
    private final abef g;
    private volatile abed h;
    private final alm i;
    
    static {
        trn.a("PlaybackQueueManager");
    }
    
    public abeg(final aben a, final alm i, final byte[] array, final byte[] array2) {
        this.i = i;
        this.a = a;
        this.b = new CopyOnWriteArraySet();
        this.c = new CopyOnWriteArraySet();
        this.d = new CopyOnWriteArraySet();
        this.g = new abef();
        this.h = (abed)new abdw();
        (this.f = new abei()).c(this.h);
        this.e = new SparseArray(2);
        final int[] b = abed.b;
        for (int j = 0; j < 2; ++j) {
            final int n = b[j];
            final abem abem = new abem(n);
            abem.b(this.h);
            this.e.put(n, (Object)abem);
        }
        this.d((abeb)a);
        this.d((abeb)this.g);
        final abef g = this.g;
        this.c.add(g);
        this.h.m((abec)g);
    }
    
    public final int a() {
        return this.h.j();
    }
    
    public final abmq b(final PlaybackStartDescriptor playbackStartDescriptor) {
        synchronized (this) {
            final boolean b = this.h instanceof abdx;
            final abmp abmp = null;
            Object o;
            if (b) {
                o = this.h;
            }
            else {
                o = new abdu(this.h, this.i, (byte[])null, (byte[])null);
            }
            final abek abek = new abek((abdx)o, this.a);
            abmp c = abmp;
            if (!this.h.y(playbackStartDescriptor)) {
                c = ((abmq)abek).c(playbackStartDescriptor, (abib)null);
            }
            if (c != null) {
                ((abmq)abek).f(c, ((abmq)abek).a(c));
            }
            return (abmq)abek;
        }
    }
    
    public final abmq c(final PlaybackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState playbackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState) {
        synchronized (this) {
            Object o;
            if (this.h instanceof abdx) {
                o = this.h;
            }
            else {
                o = new abdu(this.h, this.i, (byte[])null, (byte[])null);
            }
            return (abmq)new abek((abdx)o, this.a, playbackQueueSequenceNavigator$PlaybackQueueSequenceNavigatorState);
        }
    }
    
    public final void d(final abeb abeb) {
        this.d.add(abeb);
        this.h.l(abeb);
    }
    
    public final fqh e() {
        final abed h = this.h;
        final int j = h.j();
        if (j != -1) {
            return h.C(0, j);
        }
        return null;
    }
    
    public final tdt f() {
        return (tdt)this.e.get(0);
    }
    
    public final void g(final abed h) {
        monitorenter(this);
        try {
            if (this.h == h) {
                monitorexit(this);
                return;
            }
            final Object b = this.a.b();
            final abed h2 = this.h;
            final int a = this.a();
            final fqh e = this.e();
            this.h = h;
            this.f.c(this.h);
            final int[] b2 = abed.b;
            for (int i = 0; i < 2; ++i) {
                ((abem)this.e.get(b2[i])).b(this.h);
            }
            final int a2 = this.a();
            final fqh e2 = this.e();
            for (final abec abec : this.c) {
                h2.x(abec);
                h.m(abec);
                if (a != a2) {
                    abec.d();
                }
            }
            final boolean v = aeda.v((Object)e, (Object)e2);
            for (final abeb abeb : this.d) {
                h2.w(abeb);
                h.l(abeb);
                if (v ^ true) {
                    abeb.a(e2);
                }
            }
            this.a.d(this.e(), (aepj)null, true);
            this.a.c(b);
            final Iterator iterator3 = this.b.iterator();
            while (iterator3.hasNext()) {
                ((abee)iterator3.next()).a();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
