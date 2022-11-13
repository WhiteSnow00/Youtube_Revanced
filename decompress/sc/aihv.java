import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihv extends ahbh implements ahcw
{
    public static final aihv a;
    private static volatile ahdd d;
    public int b;
    public aiht c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aihv.class, (ahbh)(a = new aihv()));
    }
    
    private aihv() {
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
                if ((d = aihv.d) == null) {
                    synchronized (aihv.class) {
                        if (aihv.d == null) {
                            aihv.d = (ahdd)new ahba((ahbh)aihv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aihv.a;
            }
            case 4: {
                return new ahaz((ahbh)aihv.a);
            }
            case 3: {
                return new aihv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihv.a, "\u0001\u0001\u0000\u0001\ue46d\u1738\ue46d\u1738\u0001\u0000\u0000\u0001\ue46d\u1738\u1409\u0000", new Object[] { "b", "c" });
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
