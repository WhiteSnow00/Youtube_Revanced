import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajul extends ahbh implements ahcw
{
    public static final ajul a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajul.class, (ahbh)(a = new ajul()));
    }
    
    private ajul() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajul.e) == null) {
                    synchronized (ajul.class) {
                        if (ajul.e == null) {
                            ajul.e = (ahdd)new ahba((ahbh)ajul.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajul.a;
            }
            case 4: {
                return new ahaz((ahbh)ajul.a);
            }
            case 3: {
                return new ajul();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajul.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u100c\u0003", new Object[] { "f", "b", ajty.g, "c", ajty.h, "d", ajty.e });
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
