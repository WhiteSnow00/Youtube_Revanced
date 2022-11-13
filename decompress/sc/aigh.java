import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigh extends ahbh implements ahcw
{
    public static final aigh a;
    public static final ahbf b;
    private static volatile ahdd v;
    public int c;
    public String d;
    public boolean e;
    public String f;
    public int g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public ajut p;
    public boolean q;
    public String r;
    public boolean s;
    public boolean t;
    public String u;
    private byte w;
    
    static {
        final aigh a2 = new aigh();
        ahbh.registerDefaultInstance((Class)aigh.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 218, ahek.k, (Class)aigh.class);
    }
    
    private aigh() {
        this.w = 2;
        this.d = "";
        this.f = "";
        this.h = "";
        this.i = "";
        this.r = "";
        this.u = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd v;
                if ((v = aigh.v) == null) {
                    synchronized (aigh.class) {
                        if (aigh.v == null) {
                            aigh.v = (ahdd)new ahba((ahbh)aigh.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return aigh.a;
            }
            case 4: {
                return new ahaz((ahbh)aigh.a);
            }
            case 3: {
                return new aigh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigh.a, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1007\n\f\u1007\u000b\r\u1409\f\u000e\u1007\r\u000f\u1008\u000e\u0010\u1007\u000f\u0011\u1007\u0010\u0012\u1008\u0011", new Object[] { "c", "d", "e", "f", "g", anbf.a(), "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
