import java.util.Collection;
import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class mky extends TimerTask
{
    final /* synthetic */ mlb a;
    
    public mky(final mlb a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final mlb a = this.a;
        if (!a.h.isEmpty()) {
            if (a.i == null && a.b != 0L) {
                final mlu c = a.c;
                final int[] l = mmt.l(a.h);
                kgk.aQ("Must be called from the main thread.");
                Object w;
                if (!c.n()) {
                    w = mlu.w();
                }
                else {
                    w = new mli(c, l);
                    mlu.v((mlr)w);
                }
                (a.i = (mpy)w).g((mqc)new mkx(a, 0));
                a.h.clear();
            }
        }
    }
}
