import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqci extends ahbh implements ahcw
{
    public static final aqci a;
    private static volatile ahdd f;
    public int b;
    public boolean c;
    public ahdy d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqci.class, (ahbh)(a = new aqci()));
    }
    
    private aqci() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqci.f) == null) {
                    synchronized (aqci.class) {
                        if (aqci.f == null) {
                            aqci.f = (ahdd)new ahba((ahbh)aqci.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqci.a;
            }
            case 4: {
                return new ahaz((ahbh)aqci.a);
            }
            case 3: {
                return new aqci();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqci.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aotz.a() });
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
