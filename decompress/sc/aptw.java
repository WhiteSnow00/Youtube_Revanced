import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptw extends ahbh implements ahcw
{
    public static final aptw a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptw.class, (ahbh)(a = new aptw()));
    }
    
    private aptw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptw.b) == null) {
                    synchronized (aptw.class) {
                        if (aptw.b == null) {
                            aptw.b = (ahdd)new ahba((ahbh)aptw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptw.a;
            }
            case 4: {
                return new ahaz((ahbh)aptw.a);
            }
            case 3: {
                return new aptw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptw.a, "\u0001\u0000", (Object[])null);
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
