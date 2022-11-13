import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aled extends ahbh implements ahcw
{
    public static final aled a;
    private static volatile ahdd h;
    public int b;
    public alec c;
    public aleb d;
    public aldz e;
    public alea f;
    public aiyo g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aled.class, (ahbh)(a = new aled()));
    }
    
    private aled() {
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
                final ahdd h;
                if ((h = aled.h) == null) {
                    synchronized (aled.class) {
                        if (aled.h == null) {
                            aled.h = (ahdd)new ahba((ahbh)aled.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aled.a;
            }
            case 4: {
                return new ahaz((ahbh)aled.a);
            }
            case 3: {
                return new aled();
            }
            case 2: {
                return newMessageInfo((MessageLite)aled.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
