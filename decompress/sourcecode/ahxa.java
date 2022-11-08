import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxa extends agzi implements ahax
{
    public static final ahxa a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahxa.class, a = new ahxa());
    }
    
    private ahxa() {
        this.j = 2;
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
                if ((b2 = ahxa.b) == null) {
                    synchronized (ahxa.class) {
                        if (ahxa.b == null) {
                            ahxa.b = (ahbe)new agzb((agzi)ahxa.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahxa.a;
            }
            case 4: {
                return new agza((agzi)ahxa.a);
            }
            case 3: {
                return new ahxa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxa.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
