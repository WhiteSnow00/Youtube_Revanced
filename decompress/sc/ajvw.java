import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvw extends ahbh implements ahcw
{
    public static final ajvw a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvw.class, (ahbh)(a = new ajvw()));
    }
    
    private ajvw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajvw.c) == null) {
                    synchronized (ajvw.class) {
                        if (ajvw.c == null) {
                            ajvw.c = (ahdd)new ahba((ahbh)ajvw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajvw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvw.a);
            }
            case 3: {
                return new ajvw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvw.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "d", "b" });
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
