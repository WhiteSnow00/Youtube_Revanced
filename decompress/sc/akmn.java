import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmn extends ahbh implements ahcw
{
    public static final akmn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akmn.class, (ahbh)(a = new akmn()));
    }
    
    private akmn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akmn.b) == null) {
                    synchronized (akmn.class) {
                        if (akmn.b == null) {
                            akmn.b = (ahdd)new ahba((ahbh)akmn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akmn.a;
            }
            case 4: {
                return new ahaz((ahbh)akmn.a);
            }
            case 3: {
                return new akmn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmn.a, "\u0001\u0000", (Object[])null);
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
