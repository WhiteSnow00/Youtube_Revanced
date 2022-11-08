import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhm extends agzi implements ahax
{
    public static final aqhm a;
    private static volatile ahbe b;
    private int c;
    private aqhl d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqhm.class, (agzi)(a = new aqhm()));
    }
    
    private aqhm() {
        this.e = 2;
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
                if ((b2 = aqhm.b) == null) {
                    synchronized (aqhm.class) {
                        if (aqhm.b == null) {
                            aqhm.b = (ahbe)new agzb((agzi)aqhm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhm.a;
            }
            case 4: {
                return new agza((agzi)aqhm.a);
            }
            case 3: {
                return new aqhm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
