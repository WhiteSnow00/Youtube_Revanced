import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apba extends ahbh implements ahcw
{
    public static final apba a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aodo h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)apba.class, (ahbh)(a = new apba()));
    }
    
    private apba() {
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
                if ((b = apba.b) == null) {
                    synchronized (apba.class) {
                        if (apba.b == null) {
                            apba.b = (ahdd)new ahba((ahbh)apba.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apba.a;
            }
            case 4: {
                return new ahaz((ahbh)apba.a);
            }
            case 3: {
                return new apba();
            }
            case 2: {
                return newMessageInfo((MessageLite)apba.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0005\u0007\u1409\u0007\b\u1409\u0002", new Object[] { "c", "d", "e", "g", "h", "i", "f" });
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
