import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmi extends ahbh implements ahcw
{
    private static final aqmi a;
    private static volatile ahdd b;
    private int c;
    private String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmi.class, (ahbh)(a = new aqmi()));
    }
    
    private aqmi() {
        this.d = "";
    }
    
    public static aqmh a() {
        return (aqmh)aqmi.a.createBuilder();
    }
    
    static aqmi b() {
        return aqmi.a;
    }
    
    public static void c(final aqmi aqmi, final String s) {
        aqmi.d(s);
    }
    
    private void d(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqmi.b) == null) {
                    synchronized (aqmi.class) {
                        if (aqmi.b == null) {
                            aqmi.b = (ahdd)new ahba((ahbh)aqmi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqmi.a;
            }
            case 4: {
                return new aqmh();
            }
            case 3: {
                return new aqmi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
