import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowi extends agzi implements ahax
{
    public static final aowi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowi.class, a = new aowi());
    }
    
    private aowi() {
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
                if ((b = aowi.b) == null) {
                    synchronized (aowi.class) {
                        if (aowi.b == null) {
                            aowi.b = (ahbe)new agzb((agzi)aowi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowi.a;
            }
            case 4: {
                return new agza((agzi)aowi.a);
            }
            case 3: {
                return new aowi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowi.a, "\u0001\u0000", null);
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
