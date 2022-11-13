import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeya extends ahbh implements ahcw
{
    public static final aeya a;
    private static volatile ahdd g;
    public int b;
    public ahab c;
    public ahab d;
    public aexz e;
    public aexv f;
    
    static {
        ahbh.registerDefaultInstance((Class)aeya.class, (ahbh)(a = new aeya()));
    }
    
    private aeya() {
        this.c = ahab.b;
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aeya.g) == null) {
                    synchronized (aeya.class) {
                        if (aeya.g == null) {
                            aeya.g = (ahdd)new ahba((ahbh)aeya.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aeya.a;
            }
            case 4: {
                return new ahaz((ahbh)aeya.a);
            }
            case 3: {
                return new aeya();
            }
            case 2: {
                return newMessageInfo((MessageLite)aeya.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
