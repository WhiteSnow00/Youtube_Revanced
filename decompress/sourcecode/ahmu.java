import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmu extends agzi implements ahax
{
    public static final ahmu a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahmu.class, (agzi)(a = new ahmu()));
    }
    
    private ahmu() {
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
                if ((b2 = ahmu.b) == null) {
                    synchronized (ahmu.class) {
                        if (ahmu.b == null) {
                            ahmu.b = (ahbe)new agzb((agzi)ahmu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahmu.a;
            }
            case 4: {
                return new agza((agzi)ahmu.a);
            }
            case 3: {
                return new ahmu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmu.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
