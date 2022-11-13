import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuf extends ahbh implements ahcw
{
    public static final akuf a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public aktk e;
    
    static {
        ahbh.registerDefaultInstance((Class)akuf.class, (ahbh)(a = new akuf()));
    }
    
    private akuf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akuf.f) == null) {
                    synchronized (akuf.class) {
                        if (akuf.f == null) {
                            akuf.f = (ahdd)new ahba((ahbh)akuf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akuf.a;
            }
            case 4: {
                return new ahaz((ahbh)akuf.a);
            }
            case 3: {
                return new akuf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1009\u0002", new Object[] { "b", "c", akjo.r, "d", "e" });
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
