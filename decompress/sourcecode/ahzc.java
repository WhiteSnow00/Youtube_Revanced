import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzc extends agzi implements ahax
{
    public static final ahzc a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahzc.class, a = new ahzc());
    }
    
    private ahzc() {
        this.e = 2;
    }
    
    @Override
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
                if ((b2 = ahzc.b) == null) {
                    synchronized (ahzc.class) {
                        if (ahzc.b == null) {
                            ahzc.b = (ahbe)new agzb((agzi)ahzc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahzc.a;
            }
            case 4: {
                return new agza((agzi)ahzc.a);
            }
            case 3: {
                return new ahzc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
