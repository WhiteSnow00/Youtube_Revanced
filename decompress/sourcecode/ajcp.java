import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcp extends agzi implements ahax
{
    public static final ajcp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajcp.class, a = new ajcp());
    }
    
    private ajcp() {
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
                if ((b = ajcp.b) == null) {
                    synchronized (ajcp.class) {
                        if (ajcp.b == null) {
                            ajcp.b = (ahbe)new agzb((agzi)ajcp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajcp.a;
            }
            case 4: {
                return new agza((agzi)ajcp.a);
            }
            case 3: {
                return new ajcp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcp.a, "\u0001\u0000", null);
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
