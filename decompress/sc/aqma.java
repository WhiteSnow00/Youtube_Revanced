import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqma extends ahbh implements ahcw
{
    private static final aqma a;
    private static volatile ahdd b;
    private int c;
    private aqmf d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqma.class, (ahbh)(a = new aqma()));
    }
    
    private aqma() {
    }
    
    public static aqlz a() {
        return (aqlz)aqma.a.createBuilder();
    }
    
    static aqma b() {
        return aqma.a;
    }
    
    public static void c(final aqma aqma, final aqmf aqmf) {
        aqma.d(aqmf);
    }
    
    private void d(final aqmf d) {
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
                if ((b = aqma.b) == null) {
                    synchronized (aqma.class) {
                        if (aqma.b == null) {
                            aqma.b = (ahdd)new ahba((ahbh)aqma.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqma.a;
            }
            case 4: {
                return new aqlz();
            }
            case 3: {
                return new aqma();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqma.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
