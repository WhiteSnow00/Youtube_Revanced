import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahie extends agzi implements ahax
{
    public static final ahie a;
    private static volatile ahbe e;
    public ajsq b;
    public ajsq c;
    public ajkm d;
    private int f;
    private ajsq g;
    private anss h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahie.class, a = new ahie());
    }
    
    private ahie() {
        this.i = 2;
        emptyProtobufList();
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
                if ((e = ahie.e) == null) {
                    synchronized (ahie.class) {
                        if (ahie.e == null) {
                            ahie.e = (ahbe)new agzb((agzi)ahie.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahie.a;
            }
            case 4: {
                return new agza((agzi)ahie.a);
            }
            case 3: {
                return new ahie();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahie.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1009\u0004", new Object[] { "f", "g", "b", "c", "h", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
