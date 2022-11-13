import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfb extends ahbh implements ahcw
{
    public static final alfb a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alfb.class, (ahbh)(a = new alfb()));
    }
    
    private alfb() {
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alfb.b) == null) {
                    synchronized (alfb.class) {
                        if (alfb.b == null) {
                            alfb.b = (ahdd)new ahba((ahbh)alfb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alfb.a;
            }
            case 4: {
                return new ahaz((ahbh)alfb.a);
            }
            case 3: {
                return new alfb();
            }
            case 2: {
                return newMessageInfo((MessageLite)alfb.a, "\u0001\u0000", (Object[])null);
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
