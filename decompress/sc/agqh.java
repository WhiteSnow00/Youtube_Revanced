import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqh extends ahbh implements ahcw
{
    public static final agqh a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agqh.class, (ahbh)(a = new agqh()));
    }
    
    private agqh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agqh.b) == null) {
                    synchronized (agqh.class) {
                        if (agqh.b == null) {
                            agqh.b = (ahdd)new ahba((ahbh)agqh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqh.a;
            }
            case 4: {
                return new ahaz((ahbh)agqh.a);
            }
            case 3: {
                return new agqh();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqh.a, "\u0000\u0000", (Object[])null);
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
