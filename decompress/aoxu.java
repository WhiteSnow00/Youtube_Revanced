import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxu extends ahbh implements ahcw
{
    public static final aoxu a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private anuv e;
    private anuv f;
    private aiqj g;
    private aiqj h;
    private ajut i;
    private ahmo j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxu.class, (ahbh)(a = new aoxu()));
    }
    
    private aoxu() {
        this.k = 2;
        final ahab b = ahab.b;
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
                final ahdd b;
                if ((b = aoxu.b) == null) {
                    synchronized (aoxu.class) {
                        if (aoxu.b == null) {
                            aoxu.b = (ahdd)new ahba((ahbh)aoxu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxu.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxu.a);
            }
            case 3: {
                return new aoxu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxu.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\b\u1409\b\n\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
