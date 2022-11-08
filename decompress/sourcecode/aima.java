import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aima extends agzi implements ahax
{
    public static final aima a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aima.class, a = new aima());
    }
    
    private aima() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aima.b) == null) {
                    synchronized (aima.class) {
                        if (aima.b == null) {
                            aima.b = (ahbe)new agzb((agzi)aima.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aima.a;
            }
            case 4: {
                return new agza((agzi)aima.a);
            }
            case 3: {
                return new aima();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aima.a, "\u0001\u0000", null);
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
