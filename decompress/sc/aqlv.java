import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlv extends ahbh implements ahcw
{
    public static final aqlv a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlv.class, (ahbh)(a = new aqlv()));
    }
    
    private aqlv() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqlv.c) == null) {
                    synchronized (aqlv.class) {
                        if (aqlv.c == null) {
                            aqlv.c = (ahdd)new ahba((ahbh)aqlv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqlv.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlv.a);
            }
            case 3: {
                return new aqlv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
