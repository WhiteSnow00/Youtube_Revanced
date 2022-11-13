import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aofs extends ahbh implements ahcw
{
    public static final aofs a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aofs.class, (ahbh)(a = new aofs()));
    }
    
    private aofs() {
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
                if ((d = aofs.d) == null) {
                    synchronized (aofs.class) {
                        if (aofs.d == null) {
                            aofs.d = (ahdd)new ahba((ahbh)aofs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aofs.a;
            }
            case 4: {
                return new ahaz((ahbh)aofs.a);
            }
            case 3: {
                return new aofs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aofs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
