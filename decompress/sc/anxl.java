import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxl extends ahbh implements ahcw
{
    public static final anxl a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)anxl.class, (ahbh)(a = new anxl()));
    }
    
    private anxl() {
        this.d = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anxl.e) == null) {
                    synchronized (anxl.class) {
                        if (anxl.e == null) {
                            anxl.e = (ahdd)new ahba((ahbh)anxl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anxl.a;
            }
            case 4: {
                return new ahaz((ahbh)anxl.a);
            }
            case 3: {
                return new anxl();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxl.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0004\u1007\u0003", new Object[] { "b", "c", "d" });
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
