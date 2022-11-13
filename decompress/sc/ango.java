import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ango extends ahbh implements ahcw
{
    public static final ango a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private ajut h;
    private ajut i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ango.class, (ahbh)(a = new ango()));
    }
    
    private ango() {
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
                if ((b = ango.b) == null) {
                    synchronized (ango.class) {
                        if (ango.b == null) {
                            ango.b = (ahdd)new ahba((ahbh)ango.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ango.a;
            }
            case 4: {
                return new ahaz((ahbh)ango.a);
            }
            case 3: {
                return new ango();
            }
            case 2: {
                return newMessageInfo((MessageLite)ango.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
