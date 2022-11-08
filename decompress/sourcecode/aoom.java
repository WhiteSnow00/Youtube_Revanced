import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoom extends agzi implements ahax
{
    public static final aoom a;
    private static volatile ahbe e;
    public boolean b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)aoom.class, (agzi)(a = new aoom()));
    }
    
    private aoom() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aoom.e) == null) {
                    synchronized (aoom.class) {
                        if (aoom.e == null) {
                            aoom.e = (ahbe)new agzb((agzi)aoom.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoom.a;
            }
            case 4: {
                return new agza((agzi)aoom.a);
            }
            case 3: {
                return new aoom();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoom.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
