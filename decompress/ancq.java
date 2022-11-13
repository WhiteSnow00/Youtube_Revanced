import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancq extends ahbh implements ahcw
{
    public static final ancq a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ancq.class, (ahbh)(a = new ancq()));
    }
    
    private ancq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ancq.e) == null) {
                    synchronized (ancq.class) {
                        if (ancq.e == null) {
                            ancq.e = (ahdd)new ahba((ahbh)ancq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ancq.a;
            }
            case 4: {
                return new ahaz((ahbh)ancq.a);
            }
            case 3: {
                return new ancq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancq.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u100c\u0002", new Object[] { "b", "c", amud.c, "d", amud.d });
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
