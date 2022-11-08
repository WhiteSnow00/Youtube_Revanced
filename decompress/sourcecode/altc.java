import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class altc extends agzi implements ahax
{
    public static final altc a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public anss d;
    public anss e;
    public anss f;
    public agzy g;
    public ajsq h;
    public anss i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(altc.class, a = new altc());
    }
    
    private altc() {
        this.k = 2;
        this.g = agzi.emptyProtobufList();
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
                final ahbe j;
                if ((j = altc.j) == null) {
                    synchronized (altc.class) {
                        if (altc.j == null) {
                            altc.j = (ahbe)new agzb((agzi)altc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return altc.a;
            }
            case 4: {
                return new agza((agzi)altc.a);
            }
            case 3: {
                return new altc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)altc.a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0007\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", anss.class, "h", "i" });
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
