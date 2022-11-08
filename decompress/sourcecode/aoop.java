import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoop extends agzi implements ahax
{
    public static final aoop a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        agzi.registerDefaultInstance((Class)aoop.class, (agzi)(a = new aoop()));
    }
    
    private aoop() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aoop.g) == null) {
                    synchronized (aoop.class) {
                        if (aoop.g == null) {
                            aoop.g = (ahbe)new agzb((agzi)aoop.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoop.a;
            }
            case 4: {
                return new agza((agzi)aoop.a);
            }
            case 3: {
                return new aoop();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoop.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004", new Object[] { "h", "b", "c", "d", "e", "f" });
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
