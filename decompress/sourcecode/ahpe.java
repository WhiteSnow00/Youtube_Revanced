import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpe extends agzi implements ahax
{
    public static final ahpe a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public ajsq d;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahpe.class, a = new ahpe());
    }
    
    private ahpe() {
        this.g = 2;
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
                final ahbe e;
                if ((e = ahpe.e) == null) {
                    synchronized (ahpe.class) {
                        if (ahpe.e == null) {
                            ahpe.e = (ahbe)new agzb((agzi)ahpe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahpe.a;
            }
            case 4: {
                return new agza((agzi)ahpe.a);
            }
            case 3: {
                return new ahpe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpe.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", ahng.f, "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
