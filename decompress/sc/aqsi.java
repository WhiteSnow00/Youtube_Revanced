import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsi extends ahbh implements ahcw
{
    public static final aqsi a;
    private static volatile ahdd e;
    public int b;
    public aqsb c;
    public ahan d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsi.class, (ahbh)(a = new aqsi()));
    }
    
    private aqsi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqsi.e) == null) {
                    synchronized (aqsi.class) {
                        if (aqsi.e == null) {
                            aqsi.e = (ahdd)new ahba((ahbh)aqsi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsi.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsi.a);
            }
            case 3: {
                return new aqsi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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