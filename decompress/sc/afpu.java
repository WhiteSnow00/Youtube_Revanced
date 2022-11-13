import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpu extends ahbh implements ahcw
{
    public static final afpu a;
    private static volatile ahdd i;
    public int b;
    public afre c;
    public ahbx d;
    public afre e;
    public afqh f;
    public afqc g;
    public afpv h;
    private afre j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)afpu.class, (ahbh)(a = new afpu()));
    }
    
    private afpu() {
        this.k = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = afpu.i) == null) {
                    synchronized (afpu.class) {
                        if (afpu.i == null) {
                            afpu.i = (ahdd)new ahba((ahbh)afpu.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return afpu.a;
            }
            case 4: {
                return new ahaz((ahbh)afpu.a);
            }
            case 3: {
                return new afpu();
            }
            case 2: {
                return newMessageInfo((MessageLite)afpu.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0004\u0007\u1409\u0006\b\u1409\u0003\t\u1409\u0007", new Object[] { "b", "c", "d", afqi.class, "e", "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
