import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhs extends agzi implements ahax
{
    public static final aqhs a;
    private static volatile ahbe b;
    private int c;
    private aqht d;
    private aqhw e;
    private aqhw f;
    private aqhw g;
    private aqhw h;
    private aqhw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aqhs.class, (agzi)(a = new aqhs()));
    }
    
    private aqhs() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aqhs.b) == null) {
                    synchronized (aqhs.class) {
                        if (aqhs.b == null) {
                            aqhs.b = (ahbe)new agzb((agzi)aqhs.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhs.a;
            }
            case 4: {
                return new agza((agzi)aqhs.a);
            }
            case 3: {
                return new aqhs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhs.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0000", new Object[] { "c", "e", "f", "g", "h", "i", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
