import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhn extends ahbh implements ahcw
{
    public static final ajhn a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajhn.class, (ahbh)(a = new ajhn()));
    }
    
    private ajhn() {
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
                if ((d = ajhn.d) == null) {
                    synchronized (ajhn.class) {
                        if (ajhn.d == null) {
                            ajhn.d = (ahdd)new ahba((ahbh)ajhn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajhn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhn.a);
            }
            case 3: {
                return new ajhn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhn.a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000", new Object[] { "c", "b", ajhh.class, ajhk.class, ajhl.class, ajhm.class, ajhi.class });
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
