import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbv extends ahbh implements ahcw
{
    public static final anbv a;
    private static volatile ahdd b;
    private int c;
    private ankk d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aiqj h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anbv.class, (ahbh)(a = new anbv()));
    }
    
    private anbv() {
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
                if ((b = anbv.b) == null) {
                    synchronized (anbv.class) {
                        if (anbv.b == null) {
                            anbv.b = (ahdd)new ahba((ahbh)anbv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anbv.a;
            }
            case 4: {
                return new ahaz((ahbh)anbv.a);
            }
            case 3: {
                return new anbv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbv.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
