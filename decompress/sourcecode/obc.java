import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obc extends agzi implements ahax
{
    public static final obc a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)obc.class, (agzi)(a = new obc()));
    }
    
    private obc() {
        emptyIntList();
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = obc.d) == null) {
                    synchronized (obc.class) {
                        if (obc.d == null) {
                            obc.d = (ahbe)new agzb((agzi)obc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return obc.a;
            }
            case 4: {
                return new agza((agzi)obc.a);
            }
            case 3: {
                return new obc();
            }
            case 2: {
                return newMessageInfo((MessageLite)obc.a, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\f\u0004\u0208", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
