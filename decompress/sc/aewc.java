import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewc extends ahbh implements ahcw
{
    public static final aewc a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aewc.class, (ahbh)(a = new aewc()));
    }
    
    private aewc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aewc.b) == null) {
                    synchronized (aewc.class) {
                        if (aewc.b == null) {
                            aewc.b = (ahdd)new ahba((ahbh)aewc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aewc.a;
            }
            case 4: {
                return new ahaz((ahbh)aewc.a);
            }
            case 3: {
                return new aewc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aewc.a, "\u0000\u0000", (Object[])null);
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
