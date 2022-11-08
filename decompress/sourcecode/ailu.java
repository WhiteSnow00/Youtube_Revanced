import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailu extends agzi implements ahax
{
    public static final ailu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailu.class, a = new ailu());
    }
    
    private ailu() {
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
                if ((b = ailu.b) == null) {
                    synchronized (ailu.class) {
                        if (ailu.b == null) {
                            ailu.b = (ahbe)new agzb((agzi)ailu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailu.a;
            }
            case 4: {
                return new agza((agzi)ailu.a);
            }
            case 3: {
                return new ailu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailu.a, "\u0001\u0000", null);
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
