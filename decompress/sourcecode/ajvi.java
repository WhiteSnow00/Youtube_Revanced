import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvi extends agzi implements ahax
{
    private static final ajvi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajvi.class, a = new ajvi());
    }
    
    private ajvi() {
    }
    
    public static /* synthetic */ ajvi a() {
        return ajvi.a;
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
                if ((b = ajvi.b) == null) {
                    synchronized (ajvi.class) {
                        if (ajvi.b == null) {
                            ajvi.b = (ahbe)new agzb((agzi)ajvi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajvi.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ajvi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvi.a, "\u0001\u0000", null);
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
