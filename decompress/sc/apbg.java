import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbg extends ahbh implements ahcw
{
    public static final apbg a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private anuv f;
    private anuv g;
    private anuv h;
    private anuv i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apbg.class, (ahbh)(a = new apbg()));
    }
    
    private apbg() {
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
                if ((b = apbg.b) == null) {
                    synchronized (apbg.class) {
                        if (apbg.b == null) {
                            apbg.b = (ahdd)new ahba((ahbh)apbg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbg.a;
            }
            case 4: {
                return new ahaz((ahbh)apbg.a);
            }
            case 3: {
                return new apbg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbg.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0005\u0006\u1409\n\u0007\u1409\u0004\b\u1409\u0003\t\u1409\u0001", new Object[] { "c", "d", "f", "i", "j", "h", "g", "e" });
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
