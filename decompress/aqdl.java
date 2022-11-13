import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdl extends ahbh implements ahcw
{
    public static final aqdl a;
    private static volatile ahdd g;
    public int b;
    public ahdy c;
    public String d;
    public String e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdl.class, (ahbh)(a = new aqdl()));
    }
    
    private aqdl() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqdl.g) == null) {
                    synchronized (aqdl.class) {
                        if (aqdl.g == null) {
                            aqdl.g = (ahdd)new ahba((ahbh)aqdl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqdl.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdl.a);
            }
            case 3: {
                return new aqdl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdl.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0001\u0002\u1008\u0002\u0004\u1009\u0000\u0005\u100c\u0004", new Object[] { "b", "d", "e", "c", "f", anxd.q });
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
