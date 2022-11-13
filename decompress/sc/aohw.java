import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohw extends ahbh implements ahcw
{
    public static final aohw a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aohw.class, (ahbh)(a = new aohw()));
    }
    
    private aohw() {
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aohw.b) == null) {
                    synchronized (aohw.class) {
                        if (aohw.b == null) {
                            aohw.b = (ahdd)new ahba((ahbh)aohw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohw.a;
            }
            case 4: {
                return new ahaz((ahbh)aohw.a);
            }
            case 3: {
                return new aohw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohw.a, "\u0001\u0000", (Object[])null);
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
