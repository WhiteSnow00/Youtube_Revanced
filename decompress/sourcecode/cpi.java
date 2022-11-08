import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cpi implements coz
{
    public final cpv a;
    public final List b;
    public final List c;
    public Object d;
    public cph e;
    
    public cpi(final cpv a) {
        this.a = a;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    public final void a(final Object d) {
        this.d = d;
        this.e(this.e, d);
    }
    
    public abstract boolean b(final crg p0);
    
    public abstract boolean c(final Object p0);
    
    public final void d(final cph e) {
        if (this.e != e) {
            this.e(this.e = e, this.d);
        }
    }
    
    public final void e(final cph cph, final Object o) {
        if (!this.b.isEmpty()) {
            if (cph != null) {
                if (o != null) {
                    if (!this.c(o)) {
                        final List b = this.b;
                        synchronized (((cpd)cph).b) {
                            final ArrayList list = new ArrayList();
                            for (final Object next : b) {
                                if (((cpd)cph).c(((crg)next).c)) {
                                    list.add(next);
                                }
                            }
                            for (final crg crg : list) {
                                cmr.a();
                                final int a = cpe.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Constraints met for ");
                                sb.append(crg);
                            }
                            final cpb a2 = ((cpd)cph).a;
                            if (a2 != null) {
                                a2.e((List)list);
                            }
                            return;
                        }
                    }
                }
                final List b2 = this.b;
                synchronized (((cpd)cph).b) {
                    final cpb a3 = ((cpd)cph).a;
                    if (a3 != null) {
                        a3.f(b2);
                    }
                }
            }
        }
    }
}
