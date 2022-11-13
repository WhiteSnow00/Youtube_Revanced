import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomx extends ahbh implements ahcw
{
    public static final aomx a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public int d;
    public aomy e;
    public anuv f;
    private ajut h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aomx.class, (ahbh)(a = new aomx()));
    }
    
    private aomx() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aomx.g) == null) {
                    synchronized (aomx.class) {
                        if (aomx.g == null) {
                            aomx.g = (ahdd)new ahba((ahbh)aomx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aomx.a;
            }
            case 4: {
                return new ahaz((ahbh)aomx.a);
            }
            case 3: {
                return new aomx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomx.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
