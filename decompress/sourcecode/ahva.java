import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahva extends agzi implements ahax
{
    public static final ahva a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public anss d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahva.class, a = new ahva());
    }
    
    private ahva() {
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
                final ahbe f;
                if ((f = ahva.f) == null) {
                    synchronized (ahva.class) {
                        if (ahva.f == null) {
                            ahva.f = (ahbe)new agzb((agzi)ahva.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahva.a;
            }
            case 4: {
                return new agza((agzi)ahva.a);
            }
            case 3: {
                return new ahva();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahva.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u100c\u0003", new Object[] { "b", "c", "d", "e", ahse.k });
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
