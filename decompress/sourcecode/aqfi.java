import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfi extends agzi implements ahax
{
    public static final aqfi a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqfi.class, (agzi)(a = new aqfi()));
    }
    
    private aqfi() {
        this.e = 2;
        final agyc b = agyc.b;
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
                if ((b2 = aqfi.b) == null) {
                    synchronized (aqfi.class) {
                        if (aqfi.b == null) {
                            aqfi.b = (ahbe)new agzb((agzi)aqfi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfi.a;
            }
            case 4: {
                return new agza((agzi)aqfi.a);
            }
            case 3: {
                return new aqfi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfi.a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006\u1409\u0005", new Object[] { "c", "d" });
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
