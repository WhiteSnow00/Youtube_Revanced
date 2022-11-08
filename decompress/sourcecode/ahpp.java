import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpp extends agzi implements ahax
{
    public static final ahpp a;
    private static volatile ahbe b;
    private int c;
    private ahpn d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahpp.class, a = new ahpp());
    }
    
    private ahpp() {
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
                if ((b2 = ahpp.b) == null) {
                    synchronized (ahpp.class) {
                        if (ahpp.b == null) {
                            ahpp.b = (ahbe)new agzb((agzi)ahpp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpp.a;
            }
            case 4: {
                return new agza((agzi)ahpp.a);
            }
            case 3: {
                return new ahpp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpp.a, "\u0001\u0001\u0000\u0001\ufd45\u2688\ufd45\u2688\u0001\u0000\u0000\u0001\ufd45\u2688\u1409\u0000", new Object[] { "c", "d" });
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
