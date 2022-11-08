import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlu extends agzi implements ahax
{
    public static final ajlu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajlu.class, (agzi)(a = new ajlu()));
    }
    
    private ajlu() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajlu.b) == null) {
                    synchronized (ajlu.class) {
                        if (ajlu.b == null) {
                            ajlu.b = (ahbe)new agzb((agzi)ajlu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajlu.a;
            }
            case 4: {
                return new agza((agzi)ajlu.a);
            }
            case 3: {
                return new ajlu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlu.a, "\u0001\u0000", (Object[])null);
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
