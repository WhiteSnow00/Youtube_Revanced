import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnx extends agzi implements ahax
{
    public static final ahnx a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahnx.class, a = new ahnx());
    }
    
    private ahnx() {
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
                if ((b = ahnx.b) == null) {
                    synchronized (ahnx.class) {
                        if (ahnx.b == null) {
                            ahnx.b = (ahbe)new agzb((agzi)ahnx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnx.a;
            }
            case 4: {
                return new agza((agzi)ahnx.a);
            }
            case 3: {
                return new ahnx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnx.a, "\u0001\u0000", null);
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
