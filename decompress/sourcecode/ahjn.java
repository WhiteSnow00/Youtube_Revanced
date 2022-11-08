import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjn extends agzi implements ahax
{
    public static final ahjn a;
    private static volatile ahbe i;
    public int b;
    public ahjo c;
    public ahow d;
    public ahos e;
    public ahoz f;
    public ahmz g;
    public ajdb h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ahjn.class, (agzi)(a = new ahjn()));
    }
    
    private ahjn() {
        this.j = 2;
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
                final ahbe i;
                if ((i = ahjn.i) == null) {
                    synchronized (ahjn.class) {
                        if (ahjn.i == null) {
                            ahjn.i = (ahbe)new agzb((agzi)ahjn.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahjn.a;
            }
            case 4: {
                return new agza((agzi)ahjn.a);
            }
            case 3: {
                return new ahjn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjn.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1409\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
