import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbm extends agzi implements ahax
{
    public static final ajbm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajbm.class, a = new ajbm());
    }
    
    private ajbm() {
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
                if ((b = ajbm.b) == null) {
                    synchronized (ajbm.class) {
                        if (ajbm.b == null) {
                            ajbm.b = (ahbe)new agzb((agzi)ajbm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbm.a;
            }
            case 4: {
                return new agza((agzi)ajbm.a);
            }
            case 3: {
                return new ajbm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbm.a, "\u0001\u0000", null);
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
