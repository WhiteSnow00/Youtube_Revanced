// 
// Decompiled by Procyon v0.6.0
// 

public final class agjh implements aglh
{
    public final Object a;
    private final int b;
    
    public agjh(final agje a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public agjh(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        if (this.b != 0) {
            return aevy.m((String)this.a);
        }
        return this.a;
    }
}
