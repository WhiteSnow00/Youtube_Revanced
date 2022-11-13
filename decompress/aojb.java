import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojb extends ahbh implements ahcw
{
    public static final aojb a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aojb.class, (ahbh)(a = new aojb()));
    }
    
    private aojb() {
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
                if ((b = aojb.b) == null) {
                    synchronized (aojb.class) {
                        if (aojb.b == null) {
                            aojb.b = (ahdd)new ahba((ahbh)aojb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojb.a;
            }
            case 4: {
                return new ahaz((ahbh)aojb.a);
            }
            case 3: {
                return new aojb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojb.a, "\u0001\u0000", (Object[])null);
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
