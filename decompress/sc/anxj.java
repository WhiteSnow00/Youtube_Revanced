import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxj extends ahbh implements ahcw
{
    public static final anxj a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public ahab d;
    
    static {
        ahbh.registerDefaultInstance((Class)anxj.class, (ahbh)(a = new anxj()));
    }
    
    private anxj() {
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anxj.e) == null) {
                    synchronized (anxj.class) {
                        if (anxj.e == null) {
                            anxj.e = (ahdd)new ahba((ahbh)anxj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anxj.a;
            }
            case 4: {
                return new ahaz((ahbh)anxj.a);
            }
            case 3: {
                return new anxj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100a\u0001", new Object[] { "b", "c", anxd.a, "d" });
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
