import java.util.Iterator;
import android.os.Handler;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bnb extends bmr
{
    public final HashMap a;
    private Handler b;
    private bcn c;
    
    protected bnb() {
        this.a = new HashMap();
    }
    
    protected int d(final Object o, final int n) {
        return n;
    }
    
    protected abstract void e(final Object p0, final bnx p1, final azl p2);
    
    public final void g(final Object o, final bnx bnx) {
        dk.f(this.a.containsKey(o) ^ true);
        final bmz bmz = new bmz(this, o);
        final bna bna = new bna(this, o);
        this.a.put(o, new eg(bnx, (bnw)bmz, bna));
        final Handler b = this.b;
        dk.d((Object)b);
        bnx.s(b, (bnz)bna);
        final Handler b2 = this.b;
        dk.d((Object)b2);
        bnx.sP(b2, (bkm)bna);
        bnx.x((bnw)bmz, this.c, this.q());
        if (!super.p.isEmpty()) {
            return;
        }
        bnx.t((bnw)bmz);
    }
    
    public final void j(final Object o) {
        final eg eg = this.a.remove(o);
        dk.d((Object)eg);
        ((bnx)eg.b).z((bnw)eg.d);
        ((bnx)eg.b).B((bnz)eg.c);
        ((bnx)eg.b).A((bkm)eg.c);
    }
    
    protected ayx k(final Object o, final ayx ayx) {
        throw null;
    }
    
    protected void l(final Object o) {
    }
    
    public void sK() {
        final Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((bnx)((eg)iterator.next()).b).sK();
        }
    }
    
    protected void sL(final bcn c) {
        this.c = c;
        this.b = baw.E();
    }
    
    protected void sN() {
        for (final eg eg : this.a.values()) {
            ((bnx)eg.b).z((bnw)eg.d);
            ((bnx)eg.b).B((bnz)eg.c);
            ((bnx)eg.b).A((bkm)eg.c);
        }
        this.a.clear();
    }
    
    protected final void u() {
        for (final eg eg : this.a.values()) {
            ((bnx)eg.b).t((bnw)eg.d);
        }
    }
    
    protected void w() {
        for (final eg eg : this.a.values()) {
            ((bnx)eg.b).v((bnw)eg.d);
        }
    }
}
