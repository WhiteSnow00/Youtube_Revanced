import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alec extends ahbh implements ahcw
{
    public static final alec a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alec.class, (ahbh)(a = new alec()));
    }
    
    private alec() {
        this.b = 0;
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
                if ((d = alec.d) == null) {
                    synchronized (alec.class) {
                        if (alec.d == null) {
                            alec.d = (ahdd)new ahba((ahbh)alec.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alec.a;
            }
            case 4: {
                return new ahaz((ahbh)alec.a);
            }
            case 3: {
                return new alec();
            }
            case 2: {
                return newMessageInfo((MessageLite)alec.a, "\u0001\u0003\u0001\u0000\ue7f5\u178e\ufd78\u2bb9\u0003\u0000\u0000\u0003\ue7f5\u178e\u143c\u0000\ufa99\u215a\u143c\u0000\ufd78\u2bb9\u143c\u0000", new Object[] { "c", "b", anyv.class, amig.class, aleq.class });
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
