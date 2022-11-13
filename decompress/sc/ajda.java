import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajda extends ahbh implements ahcw
{
    public static final ajda a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajda.class, (ahbh)(a = new ajda()));
    }
    
    private ajda() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajda.d) == null) {
                    synchronized (ajda.class) {
                        if (ajda.d == null) {
                            ajda.d = (ahdd)new ahba((ahbh)ajda.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajda.a;
            }
            case 4: {
                return new ahaz((ahbh)ajda.a);
            }
            case 3: {
                return new ajda();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajda.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", aibe.class });
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
