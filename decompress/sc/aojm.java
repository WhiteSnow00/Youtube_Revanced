import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojm extends ahbh implements ahcw
{
    public static final aojm a;
    private static volatile ahdd g;
    public anuv b;
    public anuv c;
    public anuv d;
    public ahbx e;
    public ahab f;
    private int h;
    private aiqj i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aojm.class, (ahbh)(a = new aojm()));
    }
    
    private aojm() {
        this.k = 2;
        this.e = emptyProtobufList();
        this.f = ahab.b;
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
                final ahdd g;
                if ((g = aojm.g) == null) {
                    synchronized (aojm.class) {
                        if (aojm.g == null) {
                            aojm.g = (ahdd)new ahba((ahbh)aojm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aojm.a;
            }
            case 4: {
                return new ahaz((ahbh)aojm.a);
            }
            case 3: {
                return new aojm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojm.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0003", new Object[] { "h", "b", "c", "d", "e", anuv.class, "j", "f", "i" });
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
