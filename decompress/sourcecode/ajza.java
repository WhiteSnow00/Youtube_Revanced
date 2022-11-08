import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajza extends agzi implements ahax
{
    public static final ajza a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajza a2 = new ajza();
        agzi.registerDefaultInstance(ajza.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 448363122, ahcm.k, ajza.class);
    }
    
    private ajza() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajza.c) == null) {
                    synchronized (ajza.class) {
                        if (ajza.c == null) {
                            ajza.c = (ahbe)new agzb((agzi)ajza.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajza.a;
            }
            case 4: {
                return new agza((agzi)ajza.a);
            }
            case 3: {
                return new ajza();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajza.a, "\u0001\u0000", null);
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
