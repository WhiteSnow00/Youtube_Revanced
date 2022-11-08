import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agcf extends agzi implements ahax
{
    public static final agcf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agcf.class, a = new agcf());
    }
    
    private agcf() {
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
                if ((b = agcf.b) == null) {
                    synchronized (agcf.class) {
                        if (agcf.b == null) {
                            agcf.b = (ahbe)new agzb((agzi)agcf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agcf.a;
            }
            case 4: {
                return new agza((agzi)agcf.a);
            }
            case 3: {
                return new agcf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agcf.a, "\u0000\u0000", null);
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
