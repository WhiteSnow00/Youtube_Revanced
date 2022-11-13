import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqk extends ahbh implements ahcw
{
    public static final anqk a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anqk.class, (ahbh)(a = new anqk()));
    }
    
    private anqk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anqk.c) == null) {
                    synchronized (anqk.class) {
                        if (anqk.c == null) {
                            anqk.c = (ahdd)new ahba((ahbh)anqk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anqk.a;
            }
            case 4: {
                return new ahaz((ahbh)anqk.a);
            }
            case 3: {
                return new anqk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", anqj.a });
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
