import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjl extends ahbh implements ahcw
{
    public static final ahjl a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjl.class, (ahbh)(a = new ahjl()));
    }
    
    private ahjl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahjl.e) == null) {
                    synchronized (ahjl.class) {
                        if (ahjl.e == null) {
                            ahjl.e = (ahdd)new ahba((ahbh)ahjl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahjl.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjl.a);
            }
            case 3: {
                return new ahjl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ahga.u, "d", ahga.t });
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
