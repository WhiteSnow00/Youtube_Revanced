// 
// Decompiled by Procyon v0.6.0
// 

public final class asim implements asgw
{
    private final int a;
    private final Object b;
    
    private asim(final asik b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public asim(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static asim c(final asik asik) {
        return new asim(asik, 0);
    }
    
    public final Object a() {
        if (this.a != 0) {
            return this.b;
        }
        return asil.a((asik)this.b);
    }
    
    public final void b(final Object o) {
        if (this.a != 0) {
            return;
        }
        asil.d((asik)this.b, o);
    }
}
