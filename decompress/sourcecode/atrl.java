// 
// Decompiled by Procyon v0.6.0
// 

public final class atrl
{
    public static final atvj a;
    public static final atvj b;
    public static final atvj c;
    public static final atvj d;
    public static final atvj e;
    public static final atqo f;
    
    static {
        a = new atvj("COMPLETING_ALREADY");
        b = new atvj("COMPLETING_WAITING_CHILDREN");
        c = new atvj("COMPLETING_RETRY");
        d = new atvj("TOO_LATE_TO_CANCEL");
        e = new atvj("SEALED");
        f = new atqo(true);
    }
    
    public static final Object a(final Object o) {
        if (o instanceof atqw) {
            return new atqx((atqw)o);
        }
        return o;
    }
    
    public static final Object b(Object a) {
        atqx atqx;
        if (a instanceof atqx) {
            atqx = (atqx)a;
        }
        else {
            atqx = null;
        }
        if (atqx != null) {
            a = atqx.a;
        }
        return a;
    }
}
