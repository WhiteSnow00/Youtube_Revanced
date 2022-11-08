import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjv extends agzi implements ahax
{
    public static final ahjv a;
    private static volatile ahbe d;
    public ahjw b;
    public int c;
    private int e;
    private ahlm f;
    private ahfw g;
    private ahkt h;
    private anss i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ahjv.class, (agzi)(a = new ahjv()));
    }
    
    private ahjv() {
        this.j = 2;
        final agyc b = agyc.b;
    }
    
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
                if ((d = ahjv.d) == null) {
                    synchronized (ahjv.class) {
                        if (ahjv.d == null) {
                            ahjv.d = (ahbe)new agzb((agzi)ahjv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjv.a;
            }
            case 4: {
                return new agza((agzi)ahjv.a);
            }
            case 3: {
                return new ahjv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjv.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005\b\u1409\b", new Object[] { "e", "b", "c", "f", "g", "h", "i" });
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
