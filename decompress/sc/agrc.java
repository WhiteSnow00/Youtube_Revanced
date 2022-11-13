import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrc extends ahbh implements ahcw
{
    public static final agrc a;
    private static volatile ahdd j;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    private int k;
    
    static {
        ahbh.registerDefaultInstance((Class)agrc.class, (ahbh)(a = new agrc()));
    }
    
    private agrc() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = agrc.j) == null) {
                    synchronized (agrc.class) {
                        if (agrc.j == null) {
                            agrc.j = (ahdd)new ahba((ahbh)agrc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agrc.a;
            }
            case 4: {
                return new ahaz((ahbh)agrc.a);
            }
            case 3: {
                return new agrc();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrc.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1004\u0007", new Object[] { "k", "b", "c", "d", "e", "f", "g", "h", "i" });
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
