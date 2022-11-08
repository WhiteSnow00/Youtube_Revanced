import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsd extends agzi implements ahax
{
    public static final alsd a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private ajsq e;
    private aioe f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(alsd.class, a = new alsd());
    }
    
    private alsd() {
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
                final ahbe b2;
                if ((b2 = alsd.b) == null) {
                    synchronized (alsd.class) {
                        if (alsd.b == null) {
                            alsd.b = (ahbe)new agzb((agzi)alsd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alsd.a;
            }
            case 4: {
                return new agza((agzi)alsd.a);
            }
            case 3: {
                return new alsd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
