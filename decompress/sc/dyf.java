import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyf extends dyh
{
    private final dyd a;
    private final dzg b;
    
    public dyf(final dyd a, final dzg b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final ArrayList list) {
        list.add(this.a);
    }
    
    protected final void k(final pvh pvh) {
        final dzb dzb = new dzb(this.b);
        final dyv dyv = new dyv(pvh.R(this.a.a));
        final dyv dyv2 = new dyv(this.a.b);
        this.m((dzd)dyv, (dzd)dzb, "initial");
        this.m((dzd)dyv2, (dzd)dzb, "end");
        this.l((dzd)dzb, (dzd)pvh.S(this.a.a));
    }
}
