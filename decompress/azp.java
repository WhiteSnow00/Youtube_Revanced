import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class azp
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public afgh h;
    public afgh i;
    public int j;
    public int k;
    public afgh l;
    public afgh m;
    public int n;
    public boolean o;
    public HashMap p;
    public HashSet q;
    
    @Deprecated
    public azp() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.h = afgh.q();
        this.i = afgh.q();
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = afgh.q();
        this.m = afgh.q();
        this.n = 0;
        this.o = false;
        this.p = new HashMap();
        this.q = new HashSet();
    }
    
    protected azp(final azq azq) {
        this.b(azq);
    }
    
    public azq a() {
        return new azq(this);
    }
    
    public final void b(final azq azq) {
        this.a = azq.b;
        this.b = azq.c;
        this.c = azq.d;
        this.d = azq.e;
        final int f = azq.f;
        final int g = azq.g;
        final int h = azq.h;
        final int i = azq.i;
        this.e = azq.j;
        this.f = azq.k;
        this.g = azq.l;
        this.h = azq.m;
        final int n = azq.n;
        this.i = azq.o;
        final int p = azq.p;
        this.j = azq.q;
        this.k = azq.r;
        this.l = azq.s;
        this.m = azq.t;
        this.n = azq.u;
        final int v = azq.v;
        final boolean w = azq.w;
        final boolean x = azq.x;
        this.o = azq.y;
        this.q = new HashSet(azq.A);
        this.p = new HashMap(azq.z);
    }
    
    @Deprecated
    public final void c(final Set set) {
        this.q.clear();
        this.q.addAll(set);
    }
    
    public final void d() {
        this.o = true;
    }
    
    public final void e(final int e, final int f) {
        this.e = e;
        this.f = f;
        this.g = true;
    }
}
