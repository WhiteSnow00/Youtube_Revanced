import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfj implements bfg
{
    public final bnr a;
    public final Object b;
    public final List c;
    public int d;
    public boolean e;
    
    public bfj(final bnx bnx, final boolean b) {
        this.a = new bnr(bnx, b);
        this.c = new ArrayList();
        this.b = new Object();
    }
    
    @Override
    public final azl a() {
        return (azl)this.a.b;
    }
    
    @Override
    public final Object b() {
        return this.b;
    }
    
    public final void c(final int d) {
        this.d = d;
        this.e = false;
        this.c.clear();
    }
}
