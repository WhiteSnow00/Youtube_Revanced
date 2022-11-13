import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcf extends ahbh implements ahcw
{
    public static final aqcf a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcf.class, (ahbh)(a = new aqcf()));
    }
    
    private aqcf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqcf.b) == null) {
                    synchronized (aqcf.class) {
                        if (aqcf.b == null) {
                            aqcf.b = (ahdd)new ahba((ahbh)aqcf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqcf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcf.a);
            }
            case 3: {
                return new aqcf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcf.a, "\u0001\u0000", (Object[])null);
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
