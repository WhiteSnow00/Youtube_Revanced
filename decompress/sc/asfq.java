// 
// Decompiled by Procyon v0.6.0
// 

public final class asfq implements asea
{
    private final int a;
    private final Object b;
    
    private asfq(final asfo b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public asfq(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static asfq c(final asfo asfo) {
        return new asfq(asfo, 0);
    }
    
    @Override
    public final Object a() {
        if (this.a != 0) {
            return this.b;
        }
        return asfp.a((asfo)this.b);
    }
    
    @Override
    public final void b(final Object o) {
        if (this.a != 0) {
            return;
        }
        asfp.d((asfo)this.b, o);
    }
}
