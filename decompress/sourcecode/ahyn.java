import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyn extends agzi implements ahax
{
    public static final ahyn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahyn.class, a = new ahyn());
    }
    
    private ahyn() {
        this.f = 2;
        final agyc b = agyc.b;
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
                if ((b2 = ahyn.b) == null) {
                    synchronized (ahyn.class) {
                        if (ahyn.b == null) {
                            ahyn.b = (ahbe)new agzb((agzi)ahyn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahyn.a;
            }
            case 4: {
                return new agza((agzi)ahyn.a);
            }
            case 3: {
                return new ahyn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyn.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
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
