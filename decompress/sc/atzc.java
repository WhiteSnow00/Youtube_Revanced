import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzc extends ahbh implements ahcw
{
    public static final atzc a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)atzc.class, (ahbh)(a = new atzc()));
    }
    
    private atzc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atzc.e) == null) {
                    synchronized (atzc.class) {
                        if (atzc.e == null) {
                            atzc.e = (ahdd)new ahba((ahbh)atzc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atzc.a;
            }
            case 4: {
                return new ahaz((ahbh)atzc.a);
            }
            case 3: {
                return new atzc();
            }
            case 2: {
                return newMessageInfo((MessageLite)atzc.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1002\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", areg.t });
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
