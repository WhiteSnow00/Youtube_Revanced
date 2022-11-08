// 
// Decompiled by Procyon v0.6.0
// 

public final class arjj implements atjj
{
    private static final Object a;
    private volatile atjj b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private arjj(final atjj b) {
        this.c = arjj.a;
        this.b = b;
    }
    
    public static atjj b(final atjj atjj) {
        if (!(atjj instanceof arjj) && !(atjj instanceof arjc)) {
            atjj.getClass();
            return (atjj)new arjj(atjj);
        }
        return atjj;
    }
    
    public final Object a() {
        Object c;
        if ((c = this.c) == arjj.a) {
            final atjj b = this.b;
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
