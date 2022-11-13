import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqke extends ahbh implements ahcw
{
    public static final aqke a;
    private static volatile ahdd b;
    private int c;
    private aqkf d;
    private aqki e;
    private aqki f;
    private aqki g;
    private aqki h;
    private aqki i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aqke.class, (ahbh)(a = new aqke()));
    }
    
    private aqke() {
        this.j = 2;
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
                if ((b = aqke.b) == null) {
                    synchronized (aqke.class) {
                        if (aqke.b == null) {
                            aqke.b = (ahdd)new ahba((ahbh)aqke.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqke.a;
            }
            case 4: {
                return new ahaz((ahbh)aqke.a);
            }
            case 3: {
                return new aqke();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqke.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0000", new Object[] { "c", "e", "f", "g", "h", "i", "d" });
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
