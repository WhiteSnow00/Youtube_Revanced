import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpi extends agzi implements ahax
{
    public static final ajpi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajpi.class, (agzi)(a = new ajpi()));
    }
    
    private ajpi() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajpi.b) == null) {
                    synchronized (ajpi.class) {
                        if (ajpi.b == null) {
                            ajpi.b = (ahbe)new agzb((agzi)ajpi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajpi.a;
            }
            case 4: {
                return new agza((agzi)ajpi.a);
            }
            case 3: {
                return new ajpi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpi.a, "\u0001\u0000", (Object[])null);
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
