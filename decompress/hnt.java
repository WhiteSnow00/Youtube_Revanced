import java.util.Collection;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnt implements zpf
{
    final ReelSequenceController$PendingContinuation a;
    final int b;
    final hsx c;
    final long d;
    final hnw e;
    final int f;
    
    public hnt(final hnw e, final ReelSequenceController$PendingContinuation a, final int b, final hsx c, final int f, final long d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    public final void a(final dbj dbj) {
        Object o = this.e.d;
        monitorenter(o);
        try {
            final ReelSequenceController$PendingContinuation a = this.a;
            int i = 0;
            a.a = false;
            monitorexit(o);
            ttr.d("ReelWatchSequence Error", (Throwable)dbj);
            final int n = this.b - 1;
            if (n >= 0) {
                this.e.d(this.a, this.c, n, this.f);
                return;
            }
            o = this.e.d;
            synchronized (o) {
                final ArrayList list = new ArrayList(this.e.g);
                this.e.g.clear();
                final ReelSequenceController$PendingContinuation a2 = this.a;
                final int c = a2.c;
                a2.c = 1;
                monitorexit(o);
                while (i < list.size()) {
                    ((hnv)list.get(i)).a();
                    ++i;
                }
                if ((boolean)this.e.k.l(45381542L).aM() && c == 2) {
                    o = this.e;
                    final ahaz builder = ((ahbh)ailq.a).createBuilder();
                    builder.copyOnWrite();
                    final ailq ailq = (ailq)builder.instance;
                    ailq.c = 22;
                    ailq.b |= 0x1;
                    builder.copyOnWrite();
                    final ailq ailq2 = (ailq)builder.instance;
                    ailq2.g = 117;
                    ailq2.b |= 0x10;
                    final ailq c2 = (ailq)builder.build();
                    final ttl a3 = ((hnw)o).c.a((Throwable)dbj);
                    final ahaz builder2 = ((ahbh)ailt.a).createBuilder();
                    final Object c3 = a3.c;
                    builder2.copyOnWrite();
                    final ailt ailt = (ailt)builder2.instance;
                    ailt.b |= 0x1;
                    ailt.c = (String)c3;
                    final ailt e = (ailt)builder2.build();
                    final ahaz builder3 = ((ahbh)ailo.a).createBuilder();
                    builder3.copyOnWrite();
                    final ailo ailo = (ailo)builder3.instance;
                    c2.getClass();
                    ailo.c = c2;
                    ailo.b |= 0x1;
                    builder3.copyOnWrite();
                    final ailo ailo2 = (ailo)builder3.instance;
                    e.getClass();
                    ailo2.e = e;
                    ailo2.b |= 0x4;
                    ((hnw)o).l.i((ailo)builder3.build());
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final /* bridge */ void mX(final Object o) {
        final akqr akqr = (akqr)o;
        final long n = this.e.a.d() - this.d;
        if (((vai)this.e.n.a).f(45377236L)) {
            this.e.a(this.a, akqr, n);
            return;
        }
        this.e.b.execute(new hns(this, this.a, akqr, n));
    }
    
    public final void mY() {
    }
}
