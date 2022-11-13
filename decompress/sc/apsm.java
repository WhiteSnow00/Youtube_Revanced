import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsm extends ahbh implements ahcw
{
    public static final apsm a;
    private static volatile ahdd d;
    public int b;
    public ahab c;
    
    static {
        ahbh.registerDefaultInstance((Class)apsm.class, (ahbh)(a = new apsm()));
    }
    
    private apsm() {
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
                if ((d = apsm.d) == null) {
                    synchronized (apsm.class) {
                        if (apsm.d == null) {
                            apsm.d = (ahdd)new ahba((ahbh)apsm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsm.a;
            }
            case 4: {
                return new ahaz((ahbh)apsm.a);
            }
            case 3: {
                return new apsm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
