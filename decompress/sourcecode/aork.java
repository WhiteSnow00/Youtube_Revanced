import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aork extends agzi implements ahax
{
    public static final aork a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aork.class, a = new aork());
    }
    
    private aork() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aork.e) == null) {
                    synchronized (aork.class) {
                        if (aork.e == null) {
                            aork.e = (ahbe)new agzb((agzi)aork.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aork.a;
            }
            case 4: {
                return new agza((agzi)aork.a);
            }
            case 3: {
                return new aork();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aork.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
