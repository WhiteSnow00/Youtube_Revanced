import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbj extends ahbh implements ahcw
{
    public static final apbj a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private aiqj h;
    private apbi i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apbj.class, (ahbh)(a = new apbj()));
    }
    
    private apbj() {
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
                if ((b = apbj.b) == null) {
                    synchronized (apbj.class) {
                        if (apbj.b == null) {
                            apbj.b = (ahdd)new ahba((ahbh)apbj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbj.a;
            }
            case 4: {
                return new ahaz((ahbh)apbj.a);
            }
            case 3: {
                return new apbj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbj.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\b\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
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
