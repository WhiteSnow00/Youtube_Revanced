import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqa extends ahbh implements ahcw
{
    public static final alqa a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)alqa.class, (ahbh)(a = new alqa()));
    }
    
    private alqa() {
        this.b = 0;
        this.e = 2;
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
                if ((d = alqa.d) == null) {
                    synchronized (alqa.class) {
                        if (alqa.d == null) {
                            alqa.d = (ahdd)new ahba((ahbh)alqa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqa.a;
            }
            case 4: {
                return new ahaz((ahbh)alqa.a);
            }
            case 3: {
                return new alqa();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqa.a, "\u0001\u0002\u0001\u0000\u0001\u0005\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u0005\u143c\u0000", new Object[] { "c", "b", ajut.class, anuv.class });
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
