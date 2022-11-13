import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfk extends ahbh implements ahcw
{
    public static final anfk a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)anfk.class, (ahbh)(a = new anfk()));
    }
    
    private anfk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anfk.d) == null) {
                    synchronized (anfk.class) {
                        if (anfk.d == null) {
                            anfk.d = (ahdd)new ahba((ahbh)anfk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anfk.a;
            }
            case 4: {
                return new ahaz((ahbh)anfk.a);
            }
            case 3: {
                return new anfk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anfi.a() });
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
