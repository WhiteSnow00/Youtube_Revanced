import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailt extends agzi implements ahax
{
    public static final ailt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailt.class, a = new ailt());
    }
    
    private ailt() {
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
                if ((b = ailt.b) == null) {
                    synchronized (ailt.class) {
                        if (ailt.b == null) {
                            ailt.b = (ahbe)new agzb((agzi)ailt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailt.a;
            }
            case 4: {
                return new agza((agzi)ailt.a);
            }
            case 3: {
                return new ailt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailt.a, "\u0001\u0000", null);
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
