import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alps extends agzi implements ahax
{
    public static final alps a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private anss f;
    private anss g;
    private anss h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(alps.class, a = new alps());
    }
    
    private alps() {
        this.i = 2;
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
                if ((b2 = alps.b) == null) {
                    synchronized (alps.class) {
                        if (alps.b == null) {
                            alps.b = (ahbe)new agzb((agzi)alps.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alps.a;
            }
            case 4: {
                return new agza((agzi)alps.a);
            }
            case 3: {
                return new alps();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alps.a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0003", new Object[] { "c", "d", "f", "g", "h", "e" });
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
