import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomi extends ahbh implements ahcw
{
    public static final aomi a;
    private static volatile ahdd e;
    public int b;
    public ajfd c;
    public aomh d;
    private amyi f;
    private apxa g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aomi.class, (ahbh)(a = new aomi()));
    }
    
    private aomi() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aomi.e) == null) {
                    synchronized (aomi.class) {
                        if (aomi.e == null) {
                            aomi.e = (ahdd)new ahba((ahbh)aomi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aomi.a;
            }
            case 4: {
                return new ahaz((ahbh)aomi.a);
            }
            case 3: {
                return new aomi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomi.a, "\u0001\u0004\u0000\u0001\ufc43\u196f\uf39a\u1f17\u0004\u0000\u0000\u0004\ufc43\u196f\u1409\u0002\ue5d9\u1a6d\u1409\u0000\uf875\u1be7\u1409\u0001\uf39a\u1f17\u1409\u0003", new Object[] { "b", "c", "f", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
