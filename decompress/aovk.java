import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovk extends ahbh implements ahcw
{
    public static final aovk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aovk.class, (ahbh)(a = new aovk()));
    }
    
    private aovk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aovk.b) == null) {
                    synchronized (aovk.class) {
                        if (aovk.b == null) {
                            aovk.b = (ahdd)new ahba((ahbh)aovk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovk.a;
            }
            case 4: {
                return new ahaz((ahbh)aovk.a);
            }
            case 3: {
                return new aovk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovk.a, "\u0001\u0000", (Object[])null);
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
