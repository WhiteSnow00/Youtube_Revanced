import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlq extends ahbh implements ahcw
{
    public static final ahlq a;
    private static volatile ahdd c;
    public ahlp b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlq.class, (ahbh)(a = new ahlq()));
    }
    
    private ahlq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahlq.c) == null) {
                    synchronized (ahlq.class) {
                        if (ahlq.c == null) {
                            ahlq.c = (ahdd)new ahba((ahbh)ahlq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahlq.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlq.a);
            }
            case 3: {
                return new ahlq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
