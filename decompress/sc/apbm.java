import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbm extends ahbh implements ahcw
{
    public static final apbm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apbm.class, (ahbh)(a = new apbm()));
    }
    
    private apbm() {
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
                if ((b = apbm.b) == null) {
                    synchronized (apbm.class) {
                        if (apbm.b == null) {
                            apbm.b = (ahdd)new ahba((ahbh)apbm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbm.a;
            }
            case 4: {
                return new ahaz((ahbh)apbm.a);
            }
            case 3: {
                return new apbm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbm.a, "\u0001\u0000", (Object[])null);
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