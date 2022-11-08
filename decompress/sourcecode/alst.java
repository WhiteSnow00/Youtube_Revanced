import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alst extends agzi implements ahax
{
    public static final alst a;
    private static volatile ahbe b;
    private int c;
    private anig d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aioe h;
    private aioe i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(alst.class, a = new alst());
    }
    
    private alst() {
        this.k = 2;
        emptyProtobufList();
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
                if ((b2 = alst.b) == null) {
                    synchronized (alst.class) {
                        if (alst.b == null) {
                            alst.b = (ahbe)new agzb((agzi)alst.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alst.a;
            }
            case 4: {
                return new agza((agzi)alst.a);
            }
            case 3: {
                return new alst();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alst.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\t\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
