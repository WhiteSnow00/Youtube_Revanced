import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albz extends ahbh implements ahcw
{
    public static final albz a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)albz.class, (ahbh)(a = new albz()));
    }
    
    private albz() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((d = albz.d) == null) {
                    synchronized (albz.class) {
                        if (albz.d == null) {
                            albz.d = (ahdd)new ahba((ahbh)albz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albz.a;
            }
            case 4: {
                return new ahaz((ahbh)albz.a);
            }
            case 3: {
                return new albz();
            }
            case 2: {
                return newMessageInfo((MessageLite)albz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
