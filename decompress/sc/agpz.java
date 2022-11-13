import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpz extends ahbh implements ahcw
{
    public static final agpz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agpz.class, (ahbh)(a = new agpz()));
    }
    
    private agpz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agpz.b) == null) {
                    synchronized (agpz.class) {
                        if (agpz.b == null) {
                            agpz.b = (ahdd)new ahba((ahbh)agpz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agpz.a;
            }
            case 4: {
                return new ahaz((ahbh)agpz.a);
            }
            case 3: {
                return new agpz();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpz.a, "\u0000\u0000", (Object[])null);
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
