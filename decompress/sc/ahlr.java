import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlr extends ahbh implements ahcw
{
    public static final ahlr a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public int d;
    public ahlp e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlr.class, (ahbh)(a = new ahlr()));
    }
    
    private ahlr() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ahlr.f) == null) {
                    synchronized (ahlr.class) {
                        if (ahlr.f == null) {
                            ahlr.f = (ahdd)new ahba((ahbh)ahlr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahlr.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlr.a);
            }
            case 3: {
                return new ahlr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", ahpc.a(), "e" });
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
