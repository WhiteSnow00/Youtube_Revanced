import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbj extends ahbh implements ahcw
{
    public static final anbj a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anbj.class, (ahbh)(a = new anbj()));
    }
    
    private anbj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anbj.c) == null) {
                    synchronized (anbj.class) {
                        if (anbj.c == null) {
                            anbj.c = (ahdd)new ahba((ahbh)anbj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anbj.a;
            }
            case 4: {
                return new ahaz((ahbh)anbj.a);
            }
            case 3: {
                return new anbj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbj.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "d", "b" });
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
