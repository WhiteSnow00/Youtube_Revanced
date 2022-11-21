import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashSet;
import android.os.Looper;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bmv implements bob
{
    private final ArrayList a;
    private Looper b;
    private azn c;
    private bhd d;
    public final HashSet p;
    public final boc q;
    public final tun r;
    
    public bmv() {
        this.a = new ArrayList(1);
        this.p = new HashSet(1);
        this.q = new boc();
        this.r = new tun();
    }
    
    @Override
    public final void A(final bkq bkq) {
        final tun r = this.r;
        for (final eae eae : (CopyOnWriteArrayList)r.b) {
            if (eae.b == bkq) {
                ((CopyOnWriteArrayList)r.b).remove(eae);
            }
        }
    }
    
    @Override
    public final void B(final bod bod) {
        final boc q = this.q;
        for (final eae eae : (CopyOnWriteArrayList)q.c) {
            if (eae.a == bod) {
                ((CopyOnWriteArrayList)q.c).remove(eae);
            }
        }
    }
    
    protected final boc C(final ayz ayz) {
        return this.q.p(0, ayz, 0L);
    }
    
    protected final boc D(final ayz ayz, final long n) {
        return this.q.p(0, ayz, n);
    }
    
    @Override
    public void E() {
    }
    
    protected final tun F(final ayz ayz) {
        return this.r.C(0, ayz);
    }
    
    @Override
    public azn p() {
        return null;
    }
    
    protected final bhd q() {
        final bhd d = this.d;
        bad.c(d);
        return d;
    }
    
    @Override
    public final void s(final Handler handler, final bod bod) {
        bad.b(bod);
        this.q.b(handler, bod);
    }
    
    protected abstract void sR(final bcq p0);
    
    protected abstract void sT();
    
    @Override
    public final void sV(final Handler handler, final bkq bkq) {
        bad.b(bkq);
        this.r.o(handler, bkq);
    }
    
    @Override
    public final void t(final boa boa) {
        final boolean empty = this.p.isEmpty();
        this.p.remove(boa);
        if ((empty ^ true) && this.p.isEmpty()) {
            this.u();
        }
    }
    
    protected void u() {
    }
    
    @Override
    public final void v(final boa boa) {
        bad.b(this.b);
        final boolean empty = this.p.isEmpty();
        this.p.add(boa);
        if (empty) {
            this.w();
        }
    }
    
    protected void w() {
    }
    
    @Override
    public final void x(final boa boa, final bcq bcq, final bhd d) {
        final Looper myLooper = Looper.myLooper();
        final Looper b = this.b;
        boolean b2 = true;
        if (b != null) {
            b2 = (b == myLooper && b2);
        }
        bad.d(b2);
        this.d = d;
        final azn c = this.c;
        this.a.add(boa);
        if (this.b == null) {
            this.b = myLooper;
            this.p.add(boa);
            this.sR(bcq);
            return;
        }
        if (c != null) {
            this.v(boa);
            boa.a(this, c);
        }
    }
    
    public final void y(final azn c) {
        this.c = c;
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((boa)a.get(i)).a(this, c);
        }
    }
    
    @Override
    public final void z(final boa boa) {
        this.a.remove(boa);
        if (this.a.isEmpty()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.p.clear();
            this.sT();
            return;
        }
        this.t(boa);
    }
}
