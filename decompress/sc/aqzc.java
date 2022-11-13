import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzc extends ahbh implements ahcw
{
    public static final aqzc a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzc.class, (ahbh)(a = new aqzc()));
    }
    
    private aqzc() {
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
                if ((d = aqzc.d) == null) {
                    synchronized (aqzc.class) {
                        if (aqzc.d == null) {
                            aqzc.d = (ahdd)new ahba((ahbh)aqzc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqzc.a;
            }
            case 4: {
                return new ahaz((ahbh)aqzc.a);
            }
            case 3: {
                return new aqzc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
