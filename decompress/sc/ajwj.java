import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwj extends ahbh implements ahcw
{
    public static final ajwj a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwj.class, (ahbh)(a = new ajwj()));
    }
    
    private ajwj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajwj.b) == null) {
                    synchronized (ajwj.class) {
                        if (ajwj.b == null) {
                            ajwj.b = (ahdd)new ahba((ahbh)ajwj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwj.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwj.a);
            }
            case 3: {
                return new ajwj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwj.a, "\u0001\u0000", (Object[])null);
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
