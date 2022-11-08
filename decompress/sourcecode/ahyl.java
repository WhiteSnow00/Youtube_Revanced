import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyl extends agzi implements ahax
{
    public static final ahyl a;
    private static volatile ahbe b;
    private int c;
    private apgl d;
    private ajcz e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahyl.class, a = new ahyl());
    }
    
    private ahyl() {
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
                if ((b2 = ahyl.b) == null) {
                    synchronized (ahyl.class) {
                        if (ahyl.b == null) {
                            ahyl.b = (ahbe)new agzb((agzi)ahyl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahyl.a;
            }
            case 4: {
                return new agza((agzi)ahyl.a);
            }
            case 3: {
                return new ahyl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyl.a, "\u0001\u0002\u0000\u0001\ufc43\u196f\ue607\u2a05\u0002\u0000\u0000\u0002\ufc43\u196f\u1409\u0001\ue607\u2a05\u1409\u0000", new Object[] { "c", "e", "d" });
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
