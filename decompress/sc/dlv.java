// 
// Decompiled by Procyon v0.6.0
// 

public final class dlv implements dlu
{
    public static final dlv a;
    private final int b;
    
    static {
        a = new dlv(0);
    }
    
    public dlv(final int b) {
        this.b = b;
    }
    
    public final dfy a(final dfy dfy, final ddp ddp) {
        if (this.b != 0) {
            return new dla(dou.f(((dlj)dfy.c()).b()), 0);
        }
        return dfy;
    }
}
