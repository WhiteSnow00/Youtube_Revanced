import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfb extends agzi implements ahax
{
    public static final ahfb a;
    private static volatile ahbe b;
    private int c;
    private afpe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahfb.class, a = new ahfb());
    }
    
    private ahfb() {
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
                if ((b2 = ahfb.b) == null) {
                    synchronized (ahfb.class) {
                        if (ahfb.b == null) {
                            ahfb.b = (ahbe)new agzb((agzi)ahfb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahfb.a;
            }
            case 4: {
                return new agza((agzi)ahfb.a);
            }
            case 3: {
                return new ahfb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfb.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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