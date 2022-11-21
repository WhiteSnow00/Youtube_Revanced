import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpr
{
    public static final acpr a;
    public final atlt b;
    private final Supplier c;
    
    static {
        a = new acpr(achh.c);
    }
    
    public acpr(final Supplier c) {
        this.b = ((atlt)atls.aF((Object)0)).aL();
        this.c = c;
        this.b();
    }
    
    public final int a() {
        return this.c.get();
    }
    
    public final void b() {
        this.b.tt((Object)this.c.get());
    }
}
