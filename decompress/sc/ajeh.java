import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeh extends ahbh implements ahcw
{
    public static final ajeh a;
    private static volatile ahdd d;
    public int b;
    public ahab c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajeh.class, (ahbh)(a = new ajeh()));
    }
    
    private ajeh() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajeh.d) == null) {
                    synchronized (ajeh.class) {
                        if (ajeh.d == null) {
                            ajeh.d = (ahdd)new ahba((ahbh)ajeh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajeh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajeh.a);
            }
            case 3: {
                return new ajeh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajeh.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100a\u0000", new Object[] { "b", "c" });
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
