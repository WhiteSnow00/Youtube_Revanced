import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anja extends ahbh implements ahcw
{
    public static final anja a;
    private static volatile ahdd h;
    public int b;
    public anjf c;
    public aniy d;
    public anjc e;
    public ajmo f;
    public amhi g;
    private apbt i;
    private apcu j;
    private ahxd k;
    private anie l;
    private anji m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)anja.class, (ahbh)(a = new anja()));
    }
    
    private anja() {
        this.n = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = anja.h) == null) {
                    synchronized (anja.class) {
                        if (anja.h == null) {
                            anja.h = (ahdd)new ahba((ahbh)anja.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anja.a;
            }
            case 4: {
                return new ahaz((ahbh)anja.a);
            }
            case 3: {
                return new anja();
            }
            case 2: {
                return newMessageInfo((MessageLite)anja.a, "\u0001\n\u0000\u0001\uf875\u18b0\uffad\u6730\n\u0000\u0000\n\uf875\u18b0\u1409\u0000\ue592\u1be6\u1409\t\ue0b9\u2e2b\u1409\u0003\ue377\u2e52\u1409\u0001\ue3c8\u2e52\u1409\u0002\ufc49\u3688\u1409\u0004\uecd5\u4279\u1409\u0005\uf492\u4933\u1409\b\ue091\u62a2\u1409\u0006\uffad\u6730\u1409\u0007", new Object[] { "b", "c", "g", "k", "i", "j", "l", "d", "f", "m", "e" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
