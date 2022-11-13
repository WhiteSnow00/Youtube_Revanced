import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjd extends ahbh implements ahcw
{
    public static final ahjd a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjd.class, (ahbh)(a = new ahjd()));
    }
    
    private ahjd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahjd.b) == null) {
                    synchronized (ahjd.class) {
                        if (ahjd.b == null) {
                            ahjd.b = (ahdd)new ahba((ahbh)ahjd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahjd.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjd.a);
            }
            case 3: {
                return new ahjd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjd.a, "\u0001\u0000", (Object[])null);
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
