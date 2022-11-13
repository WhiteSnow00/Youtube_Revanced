import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public class dd
{
    public final br a;
    public final HashSet b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    private final List g;
    
    public dd(final int e, final int f, final br a, final ajl ajl) {
        this.g = new ArrayList();
        this.b = new HashSet();
        this.c = false;
        this.d = false;
        this.e = e;
        this.f = f;
        this.a = a;
        ajl.b((ajk)new dc(this));
    }
    
    public void a() {
        if (this.d) {
            return;
        }
        if (cl.W(2)) {
            new StringBuilder("SpecialEffectsController: ").append(this);
        }
        this.d = true;
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
    }
    
    public void b() {
    }
    
    final void c(final Runnable runnable) {
        this.g.add(runnable);
    }
    
    final void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b.isEmpty()) {
            this.a();
            return;
        }
        final ArrayList list = new ArrayList(this.b);
        for (int size = list.size(), i = 0; i < size; ++i) {
            ((ajl)list.get(i)).a();
        }
    }
    
    public final void e(final ajl ajl) {
        this.b();
        this.b.add(ajl);
    }
    
    final void f(final int e, int n) {
        if (--n != 1) {
            if (n == 2) {
                if (cl.W(2)) {
                    new StringBuilder("SpecialEffectsController: For fragment ").append(this.a);
                    di.qh(this.e);
                    di.g(this.f);
                }
                this.e = 1;
                this.f = 3;
                return;
            }
            if (this.e != 1) {
                if (cl.W(2)) {
                    new StringBuilder("SpecialEffectsController: For fragment ").append(this.a);
                    di.qh(this.e);
                    di.qh(e);
                }
                this.e = e;
            }
        }
        else if (this.e == 1) {
            if (cl.W(2)) {
                new StringBuilder("SpecialEffectsController: For fragment ").append(this.a);
                di.g(this.f);
            }
            this.e = 2;
            this.f = 2;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        sb.append((Object)di.qh(this.e));
        sb.append("} {mLifecycleImpact = ");
        sb.append((Object)di.g(this.f));
        sb.append("} {mFragment = ");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
