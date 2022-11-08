import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhc extends agzi implements ahax
{
    public static final aqhc a;
    private static volatile ahbe b;
    private int c;
    private aqfl d;
    private aioe e;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqhc.class, (agzi)(a = new aqhc()));
    }
    
    private aqhc() {
        this.g = 2;
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
                if ((b2 = aqhc.b) == null) {
                    synchronized (aqhc.class) {
                        if (aqhc.b == null) {
                            aqhc.b = (ahbe)new agzb((agzi)aqhc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhc.a;
            }
            case 4: {
                return new agza((agzi)aqhc.a);
            }
            case 3: {
                return new aqhc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhc.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
