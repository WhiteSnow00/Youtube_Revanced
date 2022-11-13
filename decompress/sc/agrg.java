import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrg extends ahbh implements ahcw
{
    public static final agrg a;
    private static volatile ahdd d;
    public int b;
    public ahab c;
    
    static {
        ahbh.registerDefaultInstance((Class)agrg.class, (ahbh)(a = new agrg()));
    }
    
    private agrg() {
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
                if ((d = agrg.d) == null) {
                    synchronized (agrg.class) {
                        if (agrg.d == null) {
                            agrg.d = (ahdd)new ahba((ahbh)agrg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrg.a;
            }
            case 4: {
                return new ahaz((ahbh)agrg.a);
            }
            case 3: {
                return new agrg();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
