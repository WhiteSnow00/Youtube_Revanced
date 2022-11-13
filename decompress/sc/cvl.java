import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvl implements cuv, cvm
{
    public final boolean a;
    public final cvr b;
    public final cvr c;
    public final cvr d;
    public final int e;
    private final List f;
    
    public cvl(final cxp cxp, final cxn cxn) {
        this.f = new ArrayList();
        this.a = cxn.d;
        this.e = cxn.e;
        final cvr a = cxn.a.a();
        this.b = a;
        final cvr a2 = cxn.b.a();
        this.c = a2;
        final cvr a3 = cxn.c.a();
        this.d = a3;
        cxp.h(a);
        cxp.h(a2);
        cxp.h(a3);
        a.g((cvm)this);
        a2.g((cvm)this);
        a3.g((cvm)this);
    }
    
    final void a(final cvm cvm) {
        this.f.add(cvm);
    }
    
    public final void d() {
        for (int i = 0; i < this.f.size(); ++i) {
            ((cvm)this.f.get(i)).d();
        }
    }
    
    public final void f(final List list, final List list2) {
    }
    
    public final String g() {
        throw null;
    }
}
