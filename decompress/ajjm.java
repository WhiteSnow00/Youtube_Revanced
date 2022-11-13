import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjm extends ahbh implements ahcw
{
    public static final ajjm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjm.class, (ahbh)(a = new ajjm()));
    }
    
    private ajjm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajjm.b) == null) {
                    synchronized (ajjm.class) {
                        if (ajjm.b == null) {
                            ajjm.b = (ahdd)new ahba((ahbh)ajjm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajjm.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjm.a);
            }
            case 3: {
                return new ajjm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjm.a, "\u0001\u0000", (Object[])null);
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
