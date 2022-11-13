import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidx extends ahbh implements ahcw
{
    public static final aidx a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aidx.class, (ahbh)(a = new aidx()));
    }
    
    private aidx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aidx.d) == null) {
                    synchronized (aidx.class) {
                        if (aidx.d == null) {
                            aidx.d = (ahdd)new ahba((ahbh)aidx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidx.a;
            }
            case 4: {
                return new ahaz((ahbh)aidx.a);
            }
            case 3: {
                return new aidx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
