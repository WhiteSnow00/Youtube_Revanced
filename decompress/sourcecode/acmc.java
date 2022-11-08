import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmc
{
    public static final acmc a;
    public final atie b;
    private final Supplier c;
    
    static {
        a = new acmc(acmb.a);
    }
    
    public acmc(final Supplier c) {
        this.b = ((atie)atid.aE((Object)0)).aK();
        this.c = c;
        this.b();
    }
    
    public final int a() {
        return this.c.get();
    }
    
    public final void b() {
        this.b.tr((Object)this.c.get());
    }
}
