import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcn extends ahbh implements ahcw
{
    public static final aqcn a;
    private static volatile ahdd d;
    public aqcm b;
    public ahab c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcn.class, (ahbh)(a = new aqcn()));
    }
    
    private aqcn() {
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
                if ((d = aqcn.d) == null) {
                    synchronized (aqcn.class) {
                        if (aqcn.d == null) {
                            aqcn.d = (ahdd)new ahba((ahbh)aqcn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcn.a);
            }
            case 3: {
                return new aqcn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001", new Object[] { "e", "b", "c" });
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
