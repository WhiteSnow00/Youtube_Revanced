import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajat extends ahbh implements ahcw
{
    public static final ajat a;
    private static volatile ahdd d;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajat.class, (ahbh)(a = new ajat()));
    }
    
    private ajat() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajat.d) == null) {
                    synchronized (ajat.class) {
                        if (ajat.d == null) {
                            ajat.d = (ahdd)new ahba((ahbh)ajat.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajat.a;
            }
            case 4: {
                return new ahaz((ahbh)ajat.a);
            }
            case 3: {
                return new ajat();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajat.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
