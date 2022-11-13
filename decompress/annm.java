import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annm extends ahbh implements ahcw
{
    public static final annm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)annm.class, (ahbh)(a = new annm()));
    }
    
    private annm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annm.b) == null) {
                    synchronized (annm.class) {
                        if (annm.b == null) {
                            annm.b = (ahdd)new ahba((ahbh)annm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annm.a;
            }
            case 4: {
                return new ahaz((ahbh)annm.a);
            }
            case 3: {
                return new annm();
            }
            case 2: {
                return newMessageInfo((MessageLite)annm.a, "\u0000\u0000", (Object[])null);
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
