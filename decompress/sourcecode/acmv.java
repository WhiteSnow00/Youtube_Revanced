import android.content.res.Configuration;
import android.view.View$OnClickListener;
import java.util.Collection;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acmv extends acms implements acnp, tec
{
    private final tdz a;
    private boolean b;
    public final acjb i;
    public acoa j;
    public boolean k;
    public abxx l;
    
    public acmv(final vke vke, final tdz tdz, final tny tny, final wwv wwv) {
        this(vke, tdz, tny, wwv, null, new acjb());
    }
    
    protected acmv(final vke vke, final tdz a, final tny tny, final wwv wwv, final acpi acpi, final acjb i) {
        super(acpi.a(acpi), vke, a, tdz.c(), tny, wwv, (Executor)afsl.a);
        a.getClass();
        this.a = a;
        final zee zee = new zee(this, 17);
        final acmt acmt = new acmt(this);
        this.i = i;
        if (acpi instanceof acmu) {
            final acmu acmu = (acmu)acpi;
            i.p((Collection)acmu.a);
            final boolean b = acmu.b;
            this.k = acmu.c;
            this.l = acmu.d;
            final acoa e = acmu.e;
            this.M(actc.l(e.a, e.b, (View$OnClickListener)zee, (acob)acmt));
        }
        else {
            this.k = true;
            this.M(actc.l((acmq)null, this.Z(), (View$OnClickListener)zee, (acob)acmt));
        }
        a.j((Object)this, (Class)acmv.class, this.Z());
        this.b = true;
    }
    
    private final boolean j() {
        if (!((tdv)this.i).isEmpty()) {
            final acjb i = this.i;
            if (((tdv)i).get(((tdv)i).size() - 1) == this.j) {
                return true;
            }
        }
        return false;
    }
    
    protected final void E(final Object o) {
        this.F(o, ((tdv)this.i).size() - (this.j() ? 1 : 0));
    }
    
    protected void F(final Object o, final int n) {
        boolean b = false;
        if (n >= 0) {
            b = b;
            if (n <= ((tdv)this.i).size() - (this.j() ? 1 : 0)) {
                b = true;
            }
        }
        agot.D(b);
        ((tdv)this.i).add(n, o);
        this.M(this.j);
    }
    
    protected final void G(final Collection collection) {
        this.H(collection, ((tdv)this.i).size() - (this.j() ? 1 : 0));
    }
    
    public final void H(final Collection collection, final int n) {
        ((tdv)this.i).addAll(n, collection);
        this.M(this.j);
    }
    
    public final void I(final acmy acmy) {
        this.mD(acmy.a());
    }
    
    public void J(final Object o) {
        if (o != null) {
            this.i.remove(o);
        }
    }
    
    protected void K(final aext aext) {
        if (aext != null) {
            this.i.m(aext);
        }
    }
    
    protected final void L(final Object o, final Object o2) {
        if (o != null && o2 != null) {
            this.i.o(o, o2);
        }
    }
    
    public final void M(final acoa j) {
        Label_0077: {
            if (!this.k) {
                if (this.b) {
                    if (!((tdv)this.i).contains((Object)this.j)) {
                        this.i.add((Object)j);
                        break Label_0077;
                    }
                    final acoa i = this.j;
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
    
    public achk a() {
        return (achk)this.i;
    }
    
    public void lI(final Configuration configuration) {
    }
    
    protected final void lJ(final dbi dbi, final abxx l) {
        super.lJ(dbi, l);
        this.l = l;
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return actc.o(this, o, n);
    }
    
    protected void qG() {
        ((tdv)this.i).clear();
        this.rQ();
    }
    
    public acpi qv() {
        return (acpi)new acmu(super.qv(), this.i, this.k, this.l, this.j);
    }
    
    public void rU() {
        super.rU();
        this.a.m((Object)this);
    }
}
