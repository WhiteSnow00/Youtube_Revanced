import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajns extends agzi implements ahax
{
    public static final ajns a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)ajns.class, (agzi)(a = new ajns()));
    }
    
    private ajns() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajns.d) == null) {
                    synchronized (ajns.class) {
                        if (ajns.d == null) {
                            ajns.d = (ahbe)new agzb((agzi)ajns.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajns.a;
            }
            case 4: {
                return new agza((agzi)ajns.a);
            }
            case 3: {
                return new ajns();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajns.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anqs.q });
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
