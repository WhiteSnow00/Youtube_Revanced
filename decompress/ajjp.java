import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjp extends ahbh implements ahcw
{
    public static final ajjp a;
    private static volatile ahdd e;
    public int b;
    public appm c;
    public appm d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjp.class, (ahbh)(a = new ajjp()));
    }
    
    private ajjp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajjp.e) == null) {
                    synchronized (ajjp.class) {
                        if (ajjp.e == null) {
                            ajjp.e = (ahdd)new ahba((ahbh)ajjp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajjp.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjp.a);
            }
            case 3: {
                return new ajjp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
