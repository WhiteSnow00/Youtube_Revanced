import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agay extends agzi implements ahax
{
    public static final agay a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agay.class, a = new agay());
    }
    
    private agay() {
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
                if ((b = agay.b) == null) {
                    synchronized (agay.class) {
                        if (agay.b == null) {
                            agay.b = (ahbe)new agzb((agzi)agay.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agay.a;
            }
            case 4: {
                return new agza((agzi)agay.a);
            }
            case 3: {
                return new agay();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agay.a, "\u0000\u0000", null);
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