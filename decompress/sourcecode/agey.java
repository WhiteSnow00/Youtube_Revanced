import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agey extends agzi implements ahax
{
    public static final agey a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agey.class, a = new agey());
    }
    
    private agey() {
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
                if ((b = agey.b) == null) {
                    synchronized (agey.class) {
                        if (agey.b == null) {
                            agey.b = (ahbe)new agzb((agzi)agey.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agey.a;
            }
            case 4: {
                return new agza((agzi)agey.a);
            }
            case 3: {
                return new agey();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agey.a, "\u0001\u0000", null);
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
