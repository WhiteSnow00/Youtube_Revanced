import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovd extends agzi implements ahax
{
    public static final aovd a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    private int j;
    
    static {
        agzi.registerDefaultInstance(aovd.class, a = new aovd());
    }
    
    private aovd() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = aovd.i) == null) {
                    synchronized (aovd.class) {
                        if (aovd.i == null) {
                            aovd.i = (ahbe)new agzb((agzi)aovd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aovd.a;
            }
            case 4: {
                return new agza((agzi)aovd.a);
            }
            case 3: {
                return new aovd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovd.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1007\u0006", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
