import java.util.Iterator;
import android.os.Handler;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bnc extends bms
{
    public final HashMap a;
    private Handler b;
    private bco c;
    
    protected bnc() {
        this.a = new HashMap();
    }
    
    protected int d(final Object o, final int n) {
        return n;
    }
    
    protected abstract void e(final Object p0, final bny p1, final azm p2);
    
    public final void g(final Object o, final bny bny) {
        dk.f(this.a.containsKey(o) ^ true);
        final bna bna = new bna(this, o);
        final bnb bnb = new bnb(this, o);
        this.a.put(o, new eg(bny, (bnx)bna, bnb));
        final Handler b = this.b;
        dk.d((Object)b);
        bny.s(b, (boa)bnb);
        final Handler b2 = this.b;
        dk.d((Object)b2);
        bny.sV(b2, (bkn)bnb);
        bny.x((bnx)bna, this.c, this.q());
        if (!super.p.isEmpty()) {
            return;
        }
        bny.t((bnx)bna);
    }
    
    public final void j(final Object o) {
        final eg eg = this.a.remove(o);
        dk.d((Object)eg);
        ((bny)eg.b).z((bnx)eg.d);
        ((bny)eg.b).B((boa)eg.c);
        ((bny)eg.b).A((bkn)eg.c);
    }
    
    protected ayy k(final Object o, final ayy ayy) {
        throw null;
    }
    
    protected void l(final Object o) {
    }
    
    public void sQ() {
        final Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((bny)((eg)iterator.next()).b).sQ();
        }
    }
    
    protected void sR(final bco c) {
        this.c = c;
        this.b = bax.E();
    }
    
    protected void sT() {
        for (final eg eg : this.a.values()) {
            ((bny)eg.b).z((bnx)eg.d);
            ((bny)eg.b).B((boa)eg.c);
            ((bny)eg.b).A((bkn)eg.c);
        }
        this.a.clear();
    }
    
    protected final void u() {
        for (final eg eg : this.a.values()) {
            ((bny)eg.b).t((bnx)eg.d);
        }
    }
    
    protected void w() {
        for (final eg eg : this.a.values()) {
            ((bny)eg.b).v((bnx)eg.d);
        }
    }
}
