import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cpj implements cpa
{
    public final cpw a;
    public final List b;
    public final List c;
    public Object d;
    public cpi e;
    
    public cpj(final cpw a) {
        this.a = a;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    @Override
    public final void a(final Object d) {
        this.d = d;
        this.e(this.e, d);
    }
    
    public abstract boolean b(final crh p0);
    
    public abstract boolean c(final Object p0);
    
    public final void d(final cpi e) {
        if (this.e != e) {
            this.e(this.e = e, this.d);
        }
    }
    
    public final void e(final cpi cpi, final Object o) {
        if (!this.b.isEmpty()) {
            if (cpi != null) {
                if (o != null) {
                    if (!this.c(o)) {
                        final List b = this.b;
                        synchronized (((cpe)cpi).b) {
                            final ArrayList list = new ArrayList();
                            for (final Object next : b) {
                                if (((cpe)cpi).c(((crh)next).c)) {
                                    list.add(next);
                                }
                            }
                            for (final crh crh : list) {
                                cms.a();
                                final int a = cpf.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Constraints met for ");
                                sb.append(crh);
                            }
                            final cpc a2 = ((cpe)cpi).a;
                            if (a2 != null) {
                                a2.e(list);
                            }
                            return;
                        }
                    }
                }
                final List b2 = this.b;
                synchronized (((cpe)cpi).b) {
                    final cpc a3 = ((cpe)cpi).a;
                    if (a3 != null) {
                        a3.f(b2);
                    }
                }
            }
        }
    }
}
