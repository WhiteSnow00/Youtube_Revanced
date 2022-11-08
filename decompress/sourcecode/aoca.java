import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoca extends agzi implements ahax
{
    public static final aoca a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(aoca.class, a = new aoca());
    }
    
    private aoca() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aoca.d) == null) {
                    synchronized (aoca.class) {
                        if (aoca.d == null) {
                            aoca.d = (ahbe)new agzb((agzi)aoca.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoca.a;
            }
            case 4: {
                return new agza((agzi)aoca.a);
            }
            case 3: {
                return new aoca();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoca.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
