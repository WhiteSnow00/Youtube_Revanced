import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhq extends ahbh implements ahcw
{
    public static final ajhq a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajhq.class, (ahbh)(a = new ajhq()));
    }
    
    private ajhq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajhq.e) == null) {
                    synchronized (ajhq.class) {
                        if (ajhq.e == null) {
                            ajhq.e = (ahdd)new ahba((ahbh)ajhq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajhq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhq.a);
            }
            case 3: {
                return new ajhq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ajhp.a(), "d", ajek.n });
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
