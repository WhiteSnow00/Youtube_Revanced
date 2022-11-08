import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovr extends agzi implements ahax
{
    public static final aovr a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private anss e;
    private anss f;
    private aioe g;
    private aioe h;
    private ajsq i;
    private ahkq j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aovr.class, a = new aovr());
    }
    
    private aovr() {
        this.k = 2;
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
                if ((b2 = aovr.b) == null) {
                    synchronized (aovr.class) {
                        if (aovr.b == null) {
                            aovr.b = (ahbe)new agzb((agzi)aovr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovr.a;
            }
            case 4: {
                return new agza((agzi)aovr.a);
            }
            case 3: {
                return new aovr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovr.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\b\u1409\b\n\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
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
