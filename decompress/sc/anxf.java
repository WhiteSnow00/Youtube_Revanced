import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxf extends ahbc implements ahbd
{
    public static final anxf a;
    private static volatile ahdd m;
    public int b;
    public String c;
    public String d;
    public anxi e;
    public String f;
    public anxg g;
    public boolean h;
    public String i;
    public anxl j;
    public String k;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)anxf.class, (ahbh)(a = new anxf()));
    }
    
    private anxf() {
        this.n = 2;
        this.c = "";
        this.d = "";
        this.f = "";
        final ahab b = ahab.b;
        this.i = "";
        this.k = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = anxf.m) == null) {
                    synchronized (anxf.class) {
                        if (anxf.m == null) {
                            anxf.m = (ahdd)new ahba((ahbh)anxf.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return anxf.a;
            }
            case 4: {
                return new ahbb((ahbc)anxf.a);
            }
            case 3: {
                return new anxf();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxf.a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1008\u0003\u0005\u1009\u0004\u000b\u1007\n\u000e\u1008\r\u000f\u1009\u000e\u0010\u1008\u000f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
