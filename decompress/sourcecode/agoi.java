import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoi extends agzi implements ahax
{
    public static final agoi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agoi.class, a = new agoi());
    }
    
    private agoi() {
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
                if ((b = agoi.b) == null) {
                    synchronized (agoi.class) {
                        if (agoi.b == null) {
                            agoi.b = (ahbe)new agzb((agzi)agoi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agoi.a;
            }
            case 4: {
                return new agza((agzi)agoi.a);
            }
            case 3: {
                return new agoi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoi.a, "\u0000\u0000", null);
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
