import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcx extends ahbh implements ahcw
{
    public static final akcx a;
    private static volatile ahdd n;
    public int b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;
    public int j;
    public int k;
    public String l;
    public String m;
    
    static {
        ahbh.registerDefaultInstance((Class)akcx.class, (ahbh)(a = new akcx()));
    }
    
    private akcx() {
        this.c = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.l = "";
        this.m = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = akcx.n) == null) {
                    synchronized (akcx.class) {
                        if (akcx.n == null) {
                            akcx.n = (ahdd)new ahba((ahbh)akcx.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return akcx.a;
            }
            case 4: {
                return new ahaz((ahbh)akcx.a);
            }
            case 3: {
                return new akcx();
            }
            case 2: {
                return newMessageInfo((MessageLite)akcx.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1002\u0006\b\u100c\u0007\t\u1008\t\n\u1008\n\u000b\u100c\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", aovv.a(), "l", "m", "k", ancc.a() });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
