import android.content.res.Configuration;
import android.view.View$OnClickListener;
import java.util.Collection;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acqk extends acqh implements acre, thj
{
    private final thg a;
    private boolean b;
    public final acmr i;
    public acrp j;
    public boolean k;
    public acbk l;
    
    public acqk(final vnq vnq, final thg thg, final tre tre, final xab xab) {
        this(vnq, thg, tre, xab, null, new acmr());
    }
    
    protected acqk(final vnq vnq, final thg a, final tre tre, final xab xab, final acsx acsx, final acmr i) {
        super(acsx.a(acsx), vnq, a, thg.c(), tre, xab, afwd.a);
        a.getClass();
        this.a = a;
        final zhw zhw = new zhw(this, 17);
        final acqi acqi = new acqi(this);
        this.i = i;
        if (acsx instanceof acqj) {
            final acqj acqj = (acqj)acsx;
            i.p((Collection)acqj.a);
            final boolean b = acqj.b;
            this.k = acqj.c;
            this.l = acqj.d;
            final acrp e = acqj.e;
            this.M(aamz.u(e.a, e.b, (View$OnClickListener)zhw, (acrq)acqi));
        }
        else {
            this.k = true;
            this.M(aamz.u(null, this.Z(), (View$OnClickListener)zhw, (acrq)acqi));
        }
        a.j((Object)this, (Class)acqk.class, this.Z());
        this.b = true;
    }
    
    private final boolean j() {
        if (!this.i.isEmpty()) {
            final acmr i = this.i;
            if (i.get(i.size() - 1) == this.j) {
                return true;
            }
        }
        return false;
    }
    
    protected final void E(final Object o) {
        this.F(o, this.i.size() - (this.j() ? 1 : 0));
    }
    
    protected void F(final Object o, final int n) {
        boolean b = false;
        if (n >= 0) {
            b = b;
            if (n <= this.i.size() - (this.j() ? 1 : 0)) {
                b = true;
            }
        }
        adme.T(b);
        this.i.add(n, o);
        this.M(this.j);
    }
    
    protected final void G(final Collection collection) {
        this.H(collection, this.i.size() - (this.j() ? 1 : 0));
    }
    
    public final void H(final Collection collection, final int n) {
        this.i.addAll(n, collection);
        this.M(this.j);
    }
    
    public final void I(final acqn acqn) {
        this.mB(acqn.a());
    }
    
    public void J(final Object o) {
        if (o != null) {
            this.i.remove(o);
        }
    }
    
    protected void K(final afbk afbk) {
        if (afbk != null) {
            this.i.m(afbk);
        }
    }
    
    protected final void L(final Object o, final Object o2) {
        if (o != null && o2 != null) {
            this.i.o(o, o2);
        }
    }
    
    public final void M(final acrp j) {
        Label_0077: {
            if (!this.k) {
                if (this.b) {
                    if (!this.i.contains((Object)this.j)) {
                        this.i.add((Object)j);
                        break Label_0077;
                    }
                    final acrp i = this.j;
                    if (i != j) {
                        this.i.o(i, j);
                    }
                    break Label_0077;
                }
            }
            this.i.remove((Object)this.j);
        }
        this.j = j;
    }
    
    public final void N(final boolean b) {
        if (this.b != b) {
            this.b = b;
            this.M(this.j);
        }
    }
    
    @Override
    public acla a() {
        return this.i;
    }
    
    @Override
    public void lI(final Configuration configuration) {
    }
    
    @Override
    protected final void lJ(final dbm dbm, final acbk l) {
        super.lJ(dbm, l);
        this.l = l;
    }
    
    public Class[] mr(final Class clazz, final Object o, final int n) {
        return aamz.x(this, o, n);
    }
    
    protected void qK() {
        this.i.clear();
        this.rW();
    }
    
    @Override
    public acsx qz() {
        return new acqj(super.qz(), this.i, this.k, this.l, this.j);
    }
    
    @Override
    public void sa() {
        super.sa();
        this.a.m((Object)this);
    }
}
