import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agud extends agzi implements ahax
{
    public static final agud a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agud.class, a = new agud());
    }
    
    private agud() {
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
                if ((b = agud.b) == null) {
                    synchronized (agud.class) {
                        if (agud.b == null) {
                            agud.b = (ahbe)new agzb((agzi)agud.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agud.a;
            }
            case 4: {
                return new agza((agzi)agud.a);
            }
            case 3: {
                return new agud();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agud.a, "\u0001\u0000", null);
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
