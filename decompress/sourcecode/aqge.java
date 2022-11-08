import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqge extends agzi implements ahax
{
    public static final aqge a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqge.class, (agzi)(a = new aqge()));
    }
    
    private aqge() {
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
                if ((b2 = aqge.b) == null) {
                    synchronized (aqge.class) {
                        if (aqge.b == null) {
                            aqge.b = (ahbe)new agzb((agzi)aqge.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqge.a;
            }
            case 4: {
                return new agza((agzi)aqge.a);
            }
            case 3: {
                return new aqge();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqge.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
