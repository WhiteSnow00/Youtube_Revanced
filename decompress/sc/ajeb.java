import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeb extends ahbh implements ahcw
{
    private static final ajeb a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajeb.class, (ahbh)(a = new ajeb()));
    }
    
    private ajeb() {
    }
    
    public static ajeb a() {
        return ajeb.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajeb.b) == null) {
                    synchronized (ajeb.class) {
                        if (ajeb.b == null) {
                            ajeb.b = (ahdd)new ahba((ahbh)ajeb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajeb.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new ajeb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajeb.a, "\u0001\u0000", (Object[])null);
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
