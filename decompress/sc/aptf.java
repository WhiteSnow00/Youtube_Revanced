import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptf extends ahbh implements ahcw
{
    public static final aptf a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptf.class, (ahbh)(a = new aptf()));
    }
    
    private aptf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptf.b) == null) {
                    synchronized (aptf.class) {
                        if (aptf.b == null) {
                            aptf.b = (ahdd)new ahba((ahbh)aptf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptf.a;
            }
            case 4: {
                return new ahaz((ahbh)aptf.a);
            }
            case 3: {
                return new aptf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptf.a, "\u0001\u0000", (Object[])null);
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
