import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloq extends ahbh implements ahcw
{
    public static final aloq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aloq.class, (ahbh)(a = new aloq()));
    }
    
    private aloq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aloq.b) == null) {
                    synchronized (aloq.class) {
                        if (aloq.b == null) {
                            aloq.b = (ahdd)new ahba((ahbh)aloq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aloq.a;
            }
            case 4: {
                return new ahaz((ahbh)aloq.a);
            }
            case 3: {
                return new aloq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aloq.a, "\u0001\u0000", (Object[])null);
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
