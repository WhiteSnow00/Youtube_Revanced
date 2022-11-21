// 
// Decompiled by Procyon v0.6.0
// 

public final class aros implements atnb
{
    private static final Object a;
    private volatile atnb b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private aros(final atnb b) {
        this.c = aros.a;
        this.b = b;
    }
    
    public static atnb b(final atnb atnb) {
        if (!(atnb instanceof aros) && !(atnb instanceof arol)) {
            atnb.getClass();
            return new aros(atnb);
        }
        return atnb;
    }
    
    @Override
    public final Object a() {
        Object c;
        if ((c = this.c) == aros.a) {
            final atnb b = this.b;
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
