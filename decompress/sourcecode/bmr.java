import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashSet;
import android.os.Looper;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bmr implements bnx
{
    private final ArrayList a;
    private Looper b;
    private azl c;
    private bgz d;
    public final HashSet p;
    public final bny q;
    public final trg r;
    
    public bmr() {
        this.a = new ArrayList(1);
        this.p = new HashSet(1);
        this.q = new bny();
        this.r = new trg();
    }
    
    public final void A(final bkm bkm) {
        final trg r = this.r;
        for (final eaa eaa : (CopyOnWriteArrayList)r.b) {
            if (eaa.b == bkm) {
                ((CopyOnWriteArrayList)r.b).remove(eaa);
            }
        }
    }
    
    public final void B(final bnz bnz) {
        final bny q = this.q;
        for (final eaa eaa : (CopyOnWriteArrayList)q.c) {
            if (eaa.a == bnz) {
                ((CopyOnWriteArrayList)q.c).remove(eaa);
            }
        }
    }
    
    protected final bny C(final ayx ayx) {
        return this.q.p(0, ayx, 0L);
    }
    
    protected final bny D(final ayx ayx, final long n) {
        return this.q.p(0, ayx, n);
    }
    
    protected final trg F(final ayx ayx) {
        return this.r.C(0, ayx);
    }
    
    protected final bgz q() {
        final bgz d = this.d;
        dk.e((Object)d);
        return d;
    }
    
    public final void s(final Handler handler, final bnz bnz) {
        dk.d((Object)bnz);
        this.q.b(handler, bnz);
    }
    
    protected abstract void sL(final bcn p0);
    
    protected abstract void sN();
    
    public final void sP(final Handler handler, final bkm bkm) {
        dk.d((Object)bkm);
        this.r.o(handler, bkm);
    }
    
    public final void t(final bnw bnw) {
        final boolean empty = this.p.isEmpty();
        this.p.remove(bnw);
        if ((empty ^ true) && this.p.isEmpty()) {
            this.u();
        }
    }
    
    protected void u() {
    }
    
    public final void v(final bnw bnw) {
        dk.d((Object)this.b);
        final boolean empty = this.p.isEmpty();
        this.p.add(bnw);
        if (empty) {
            this.w();
        }
    }
    
    protected void w() {
    }
    
    public final void x(final bnw bnw, final bcn bcn, final bgz d) {
        final Looper myLooper = Looper.myLooper();
        final Looper b = this.b;
        boolean b2 = true;
        if (b != null) {
            b2 = (b == myLooper && b2);
        }
        dk.f(b2);
        this.d = d;
        final azl c = this.c;
        this.a.add(bnw);
        if (this.b == null) {
            this.b = myLooper;
            this.p.add(bnw);
            this.sL(bcn);
            return;
        }
        if (c != null) {
            this.v(bnw);
            bnw.a((bnx)this, c);
        }
    }
    
    public final void y(final azl c) {
        this.c = c;
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((bnw)a.get(i)).a((bnx)this, c);
        }
    }
    
    public final void z(final bnw bnw) {
        this.a.remove(bnw);
        if (this.a.isEmpty()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.p.clear();
            this.sN();
            return;
        }
        this.t(bnw);
    }
}
