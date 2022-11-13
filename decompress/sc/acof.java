import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acof
{
    public static final acof a;
    public final atiw b;
    private final Supplier c;
    
    static {
        a = new acof(acoe.a);
    }
    
    public acof(final Supplier c) {
        this.b = ((atiw)ativ.aF((Object)0)).aL();
        this.c = c;
        this.b();
    }
    
    public final int a() {
        return this.c.get();
    }
    
    public final void b() {
        this.b.tu((Object)this.c.get());
    }
}
