import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxu extends ahbh implements ahcw
{
    public static final anxu a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anxu.class, (ahbh)(a = new anxu()));
    }
    
    private anxu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anxu.c) == null) {
                    synchronized (anxu.class) {
                        if (anxu.c == null) {
                            anxu.c = (ahdd)new ahba((ahbh)anxu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anxu.a;
            }
            case 4: {
                return new ahaz((ahbh)anxu.a);
            }
            case 3: {
                return new anxu();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", anxd.c });
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
