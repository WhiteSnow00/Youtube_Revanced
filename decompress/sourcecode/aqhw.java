import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhw extends agzi implements ahax
{
    public static final aqhw a;
    private static volatile ahbe b;
    private int c;
    private aqfo d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqhw.class, (agzi)(a = new aqhw()));
    }
    
    private aqhw() {
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
                if ((b2 = aqhw.b) == null) {
                    synchronized (aqhw.class) {
                        if (aqhw.b == null) {
                            aqhw.b = (ahbe)new agzb((agzi)aqhw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhw.a;
            }
            case 4: {
                return new agza((agzi)aqhw.a);
            }
            case 3: {
                return new aqhw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
