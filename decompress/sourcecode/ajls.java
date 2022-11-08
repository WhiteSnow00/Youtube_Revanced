import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajls extends agzi implements ahax
{
    public static final ajls a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajls.class, (agzi)(a = new ajls()));
    }
    
    private ajls() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajls.b) == null) {
                    synchronized (ajls.class) {
                        if (ajls.b == null) {
                            ajls.b = (ahbe)new agzb((agzi)ajls.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajls.a;
            }
            case 4: {
                return new agza((agzi)ajls.a);
            }
            case 3: {
                return new ajls();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajls.a, "\u0001\u0000", (Object[])null);
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
