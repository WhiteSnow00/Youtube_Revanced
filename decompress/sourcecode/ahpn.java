import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpn extends agzi implements ahax
{
    public static final ahpn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahpn.class, a = new ahpn());
    }
    
    private ahpn() {
        this.f = 2;
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
                if ((b2 = ahpn.b) == null) {
                    synchronized (ahpn.class) {
                        if (ahpn.b == null) {
                            ahpn.b = (ahbe)new agzb((agzi)ahpn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpn.a;
            }
            case 4: {
                return new agza((agzi)ahpn.a);
            }
            case 3: {
                return new ahpn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}