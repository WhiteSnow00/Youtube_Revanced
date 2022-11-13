import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmz extends ahbh implements ahcw
{
    public static final akmz a;
    private static volatile ahdd c;
    public long b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akmz.class, (ahbh)(a = new akmz()));
    }
    
    private akmz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akmz.c) == null) {
                    synchronized (akmz.class) {
                        if (akmz.c == null) {
                            akmz.c = (ahdd)new ahba((ahbh)akmz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akmz.a;
            }
            case 4: {
                return new ahaz((ahbh)akmz.a);
            }
            case 3: {
                return new akmz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "d", "b" });
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
