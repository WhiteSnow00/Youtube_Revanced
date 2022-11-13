import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcy extends ahbh implements ahcw
{
    public static final ajcy a;
    private static volatile ahdd d;
    public int b;
    public aotp c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcy.class, (ahbh)(a = new ajcy()));
    }
    
    private ajcy() {
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
                if ((d = ajcy.d) == null) {
                    synchronized (ajcy.class) {
                        if (ajcy.d == null) {
                            ajcy.d = (ahdd)new ahba((ahbh)ajcy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajcy.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcy.a);
            }
            case 3: {
                return new ajcy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
