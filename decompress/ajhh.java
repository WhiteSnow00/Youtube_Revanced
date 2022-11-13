import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhh extends ahbh implements ahcw
{
    public static final ajhh a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajhh.class, (ahbh)(a = new ajhh()));
    }
    
    private ajhh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajhh.b) == null) {
                    synchronized (ajhh.class) {
                        if (ajhh.b == null) {
                            ajhh.b = (ahdd)new ahba((ahbh)ajhh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajhh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhh.a);
            }
            case 3: {
                return new ajhh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhh.a, "\u0001\u0000", (Object[])null);
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
