import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aold extends ahbh implements ahcw
{
    public static final aold a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aold.class, (ahbh)(a = new aold()));
    }
    
    private aold() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aold.e) == null) {
                    synchronized (aold.class) {
                        if (aold.e == null) {
                            aold.e = (ahdd)new ahba((ahbh)aold.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aold.a;
            }
            case 4: {
                return new ahaz((ahbh)aold.a);
            }
            case 3: {
                return new aold();
            }
            case 2: {
                return newMessageInfo((MessageLite)aold.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aola.c });
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
