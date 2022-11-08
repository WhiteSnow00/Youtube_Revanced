import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgh extends agzi implements ahax
{
    public static final ahgh a;
    private static volatile ahbe d;
    public afms b;
    public agyc c;
    private int e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahgh.class, a = new ahgh());
    }
    
    private ahgh() {
        this.g = 2;
        this.c = agyc.b;
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
                final ahbe d;
                if ((d = ahgh.d) == null) {
                    synchronized (ahgh.class) {
                        if (ahgh.d == null) {
                            ahgh.d = (ahbe)new agzb((agzi)ahgh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahgh.a;
            }
            case 4: {
                return new agza((agzi)ahgh.a);
            }
            case 3: {
                return new ahgh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgh.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "e", "b", "f", "c" });
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
