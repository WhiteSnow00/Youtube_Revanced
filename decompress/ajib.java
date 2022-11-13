import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajib extends ahbh implements ahcw
{
    public static final ajib a;
    public static final ahbf b;
    private static volatile ahdd p;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public int n;
    public String o;
    private byte q;
    
    static {
        final ajib a2 = new ajib();
        ahbh.registerDefaultInstance((Class)ajib.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 192, ahek.k, (Class)ajib.class);
    }
    
    private ajib() {
        this.d = 0;
        this.q = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = "";
        this.m = "";
        this.o = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = ajib.p) == null) {
                    synchronized (ajib.class) {
                        if (ajib.p == null) {
                            ajib.p = (ahdd)new ahba((ahbh)ajib.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajib.a;
            }
            case 4: {
                return new ahaz((ahbh)ajib.a);
            }
            case 3: {
                return new ajib();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajib.a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0004\u0005\u1008\u0003\u0006\u143c\u0000\u0007\u143c\u0000\b\u1008\b\t\u1004\u0005\u000b\u1008\t\f\u1004\n\r\u1008\u000b", new Object[] { "e", "d", "c", "f", "g", "h", "j", "i", aotp.class, ajia.class, "l", "k", "m", "n", "o" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
