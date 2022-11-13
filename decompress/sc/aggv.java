import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggv extends ahbh implements ahcw
{
    public static final aggv a;
    private static volatile ahdd c;
    public ahbp b;
    
    static {
        ahbh.registerDefaultInstance((Class)aggv.class, (ahbh)(a = new aggv()));
    }
    
    private aggv() {
        emptyIntList();
        emptyIntList();
        this.b = emptyIntList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aggv.c) == null) {
                    synchronized (aggv.class) {
                        if (aggv.c == null) {
                            aggv.c = (ahdd)new ahba((ahbh)aggv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aggv.a;
            }
            case 4: {
                return new ahaz((ahbh)aggv.a);
            }
            case 3: {
                return new aggv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aggv.a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[] { "b" });
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
