import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohx extends ahbh implements ahcw
{
    public static final aohx a;
    public static final ahbf b;
    public static final ahbf c;
    private static volatile ahdd d;
    
    static {
        ahbh.registerDefaultInstance((Class)aohx.class, (ahbh)(a = new aohx()));
        final aoif a2 = aoif.a;
        final Boolean value = false;
        b = ahbh.newSingularGeneratedExtension((MessageLite)a2, (Object)value, (MessageLite)null, (ahbm)null, 128093714, ahek.h, (Class)Boolean.class);
        c = ahbh.newSingularGeneratedExtension((MessageLite)aoif.a, (Object)value, (MessageLite)null, (ahbm)null, 127992852, ahek.h, (Class)Boolean.class);
    }
    
    private aohx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aohx.d) == null) {
                    synchronized (aohx.class) {
                        if (aohx.d == null) {
                            aohx.d = (ahdd)new ahba((ahbh)aohx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aohx.a;
            }
            case 4: {
                return new ahaz((ahbh)aohx.a);
            }
            case 3: {
                return new aohx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohx.a, "\u0001\u0000", (Object[])null);
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
