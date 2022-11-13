import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angz extends ahbh implements ahcw
{
    public static final angz a;
    private static volatile ahdd c;
    public float b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)angz.class, (ahbh)(a = new angz()));
    }
    
    private angz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = angz.c) == null) {
                    synchronized (angz.class) {
                        if (angz.c == null) {
                            angz.c = (ahdd)new ahba((ahbh)angz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return angz.a;
            }
            case 4: {
                return new ahaz((ahbh)angz.a);
            }
            case 3: {
                return new angz();
            }
            case 2: {
                return newMessageInfo((MessageLite)angz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "d", "b" });
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
