import android.content.res.Configuration;
import android.view.View$OnClickListener;
import java.util.Collection;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acoy extends acov implements acpt, tgg
{
    private final tgd a;
    private boolean b;
    public final acle i;
    public acqe j;
    public boolean k;
    public acaa l;
    
    public acoy(final vmj vmj, final tgd tgd, final tqd tqd, final wyw wyw) {
        this(vmj, tgd, tqd, wyw, null, new acle());
    }
    
    protected acoy(final vmj vmj, final tgd a, final tqd tqd, final wyw wyw, final acrm acrm, final acle i) {
        super(acrm.a(acrm), vmj, a, tgd.c(), tqd, wyw, (Executor)afum.a);
        a.getClass();
        this.a = a;
        final xqn xqn = new xqn(this, 18);
        final acow acow = new acow(this);
        this.i = i;
        if (acrm instanceof acox) {
            final acox acox = (acox)acrm;
            i.p((Collection)acox.a);
            final boolean b = acox.b;
            this.k = acox.c;
            this.l = acox.d;
            final acqe e = acox.e;
            this.M(aald.r(e.a, e.b, (View$OnClickListener)xqn, (acqf)acow));
        }
        else {
            this.k = true;
            this.M(aald.r((acot)null, this.Z(), (View$OnClickListener)xqn, (acqf)acow));
        }
        a.j((Object)this, (Class)acoy.class, this.Z());
        this.b = true;
    }
    
    private final boolean j() {
        if (!((tfz)this.i).isEmpty()) {
            final acle i = this.i;
            if (((tfz)i).get(((tfz)i).size() - 1) == this.j) {
                return true;
            }
        }
        return false;
    }
    
    protected final void E(final Object o) {
        this.F(o, ((tfz)this.i).size() - (this.j() ? 1 : 0));
    }
    
    protected void F(final Object o, final int n) {
        boolean b = false;
        if (n >= 0) {
            b = b;
            if (n <= ((tfz)this.i).size() - (this.j() ? 1 : 0)) {
                b = true;
            }
        }
        adkp.Q(b);
        ((tfz)this.i).add(n, o);
        this.M(this.j);
    }
    
    protected final void G(final Collection collection) {
        this.H(collection, ((tfz)this.i).size() - (this.j() ? 1 : 0));
    }
    
    public final void H(final Collection collection, final int n) {
        ((tfz)this.i).addAll(n, collection);
        this.M(this.j);
    }
    
    public final void I(final acpb acpb) {
        this.mD(acpb.a());
    }
    
    public void J(final Object o) {
        if (o != null) {
            this.i.remove(o);
        }
    }
    
    protected void K(final aezs aezs) {
        if (aezs != null) {
            this.i.m(aezs);
        }
    }
    
    protected final void L(final Object o, final Object o2) {
        if (o != null && o2 != null) {
            this.i.o(o, o2);
        }
    }
    
    public final void M(final acqe j) {
        Label_0077: {
            if (!this.k) {
                if (this.b) {
                    if (!((tfz)this.i).contains((Object)this.j)) {
                        this.i.add((Object)j);
                        break Label_0077;
                    }
                    final acqe i = this.j;
                    if (i != j) {
                        this.i.o((Object)i, (Object)j);
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
    
    public acjn a() {
        return (acjn)this.i;
    }
    
    public void lI(final Configuration configuration) {
    }
    
    protected final void lJ(final dbj dbj, final acaa l) {
        super.lJ(dbj, l);
        this.l = l;
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return aald.u(this, o, n);
    }
    
    public acrm qA() {
        return (acrm)new acox(super.qA(), this.i, this.k, this.l, this.j);
    }
    
    protected void qL() {
        ((tfz)this.i).clear();
        this.rW();
    }
    
    public void sa() {
        super.sa();
        this.a.m((Object)this);
    }
}
