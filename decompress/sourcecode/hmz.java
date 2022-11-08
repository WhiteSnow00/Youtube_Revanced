import java.util.Collection;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;

// 
// Decompiled by Procyon v0.6.0
// 

final class hmz implements znj
{
    final /* synthetic */ ReelSequenceController$PendingContinuation a;
    final /* synthetic */ int b;
    final /* synthetic */ hsb c;
    final /* synthetic */ long d;
    final /* synthetic */ hnb e;
    final /* synthetic */ int f;
    
    public hmz(final hnb e, final ReelSequenceController$PendingContinuation a, final int b, final hsb c, final int f, final long d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    public final void a(final dbi dbi) {
        Object o = this.e.d;
        monitorenter(o);
        try {
            final ReelSequenceController$PendingContinuation a = this.a;
            int i = 0;
            a.a = false;
            monitorexit(o);
            trn.d("ReelWatchSequence Error", (Throwable)dbi);
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
                    ((hna)list.get(i)).a();
                    ++i;
                }
                if ((boolean)this.e.k.l(45381542L).aG() && c == 2) {
                    o = this.e;
                    final agza builder = ((agzi)aijs.a).createBuilder();
                    builder.copyOnWrite();
                    final aijs aijs = (aijs)builder.instance;
                    aijs.c = 22;
                    aijs.b |= 0x1;
                    builder.copyOnWrite();
                    final aijs aijs2 = (aijs)builder.instance;
                    aijs2.g = 117;
                    aijs2.b |= 0x10;
                    final aijs c2 = (aijs)builder.build();
                    final trg a3 = ((hnb)o).c.a((Throwable)dbi);
                    final agza builder2 = ((agzi)aijv.a).createBuilder();
                    final Object c3 = a3.c;
                    builder2.copyOnWrite();
                    final aijv aijv = (aijv)builder2.instance;
                    aijv.b |= 0x1;
                    aijv.c = (String)c3;
                    final aijv e = (aijv)builder2.build();
                    final agza builder3 = ((agzi)aijq.a).createBuilder();
                    builder3.copyOnWrite();
                    final aijq aijq = (aijq)builder3.instance;
                    c2.getClass();
                    aijq.c = c2;
                    aijq.b |= 0x1;
                    builder3.copyOnWrite();
                    final aijq aijq2 = (aijq)builder3.instance;
                    e.getClass();
                    aijq2.e = e;
                    aijq2.b |= 0x4;
                    ((hnb)o).l.i((aijq)builder3.build());
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
