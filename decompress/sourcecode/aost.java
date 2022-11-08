import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aost extends agzi implements ahax
{
    public static final aost a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aost.class, a = new aost());
    }
    
    private aost() {
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
                if ((e = aost.e) == null) {
                    synchronized (aost.class) {
                        if (aost.e == null) {
                            aost.e = (ahbe)new agzb((agzi)aost.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aost.a;
            }
            case 4: {
                return new agza((agzi)aost.a);
            }
            case 3: {
                return new aost();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aost.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
