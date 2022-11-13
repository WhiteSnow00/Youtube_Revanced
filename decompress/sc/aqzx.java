import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzx extends ahbh implements ahcw
{
    private static final aqzx a;
    private static volatile ahdd b;
    private int c;
    private aqxr d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzx.class, (ahbh)(a = new aqzx()));
    }
    
    private aqzx() {
    }
    
    public static aqzw a() {
        return (aqzw)aqzx.a.createBuilder();
    }
    
    static aqzx b() {
        return aqzx.a;
    }
    
    public static void c(final aqzx aqzx, final aqxr aqxr) {
        aqzx.d(aqxr);
    }
    
    private void d(final aqxr d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzx.b) == null) {
                    synchronized (aqzx.class) {
                        if (aqzx.b == null) {
                            aqzx.b = (ahdd)new ahba((ahbh)aqzx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzx.a;
            }
            case 4: {
                return new aqzw();
            }
            case 3: {
                return new aqzx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
