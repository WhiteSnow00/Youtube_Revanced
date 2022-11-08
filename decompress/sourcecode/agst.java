import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agst extends agzi implements ahax
{
    public static final agst a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agst.class, a = new agst());
    }
    
    private agst() {
        final agyc b = agyc.b;
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
                if ((b = agst.b) == null) {
                    synchronized (agst.class) {
                        if (agst.b == null) {
                            agst.b = (ahbe)new agzb((agzi)agst.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agst.a;
            }
            case 4: {
                return new agza((agzi)agst.a);
            }
            case 3: {
                return new agst();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agst.a, "\u0001\u0000", null);
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
