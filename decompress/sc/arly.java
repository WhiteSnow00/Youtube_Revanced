// 
// Decompiled by Procyon v0.6.0
// 

public final class arly implements atke
{
    private static final Object a;
    private volatile atke b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private arly(final atke b) {
        this.c = arly.a;
        this.b = b;
    }
    
    public static atke b(final atke atke) {
        if (!(atke instanceof arly) && !(atke instanceof arlr)) {
            atke.getClass();
            return (atke)new arly(atke);
        }
        return atke;
    }
    
    public final Object a() {
        Object c;
        if ((c = this.c) == arly.a) {
            final atke b = this.b;
            if (b == null) {
                c = this.c;
            }
            else {
                c = b.a();
                this.c = c;
                this.b = null;
            }
        }
        return c;
    }
}
