import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyg extends ahbh implements ahcw
{
    public static final aoyg a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private anuv g;
    private anuv h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyg.class, (ahbh)(a = new aoyg()));
    }
    
    private aoyg() {
        this.j = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyg.b) == null) {
                    synchronized (aoyg.class) {
                        if (aoyg.b == null) {
                            aoyg.b = (ahdd)new ahba((ahbh)aoyg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyg.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyg.a);
            }
            case 3: {
                return new aoyg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyg.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
