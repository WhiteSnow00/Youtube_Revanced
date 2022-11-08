import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbi extends agzi implements ahax
{
    public static final ajbi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajbi.class, a = new ajbi());
    }
    
    private ajbi() {
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
                if ((b = ajbi.b) == null) {
                    synchronized (ajbi.class) {
                        if (ajbi.b == null) {
                            ajbi.b = (ahbe)new agzb((agzi)ajbi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbi.a;
            }
            case 4: {
                return new agza((agzi)ajbi.a);
            }
            case 3: {
                return new ajbi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbi.a, "\u0001\u0000", null);
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
