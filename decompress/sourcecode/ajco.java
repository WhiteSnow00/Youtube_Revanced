import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajco extends agzi implements ahax
{
    public static final ajco a;
    private static volatile ahbe c;
    public int b;
    private Object d;
    
    static {
        agzi.registerDefaultInstance(ajco.class, a = new ajco());
    }
    
    private ajco() {
        this.b = 0;
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
                if ((c = ajco.c) == null) {
                    synchronized (ajco.class) {
                        if (ajco.c == null) {
                            ajco.c = (ahbe)new agzb((agzi)ajco.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajco.a;
            }
            case 4: {
                return new agza((agzi)ajco.a);
            }
            case 3: {
                return new ajco();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajco.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "d", "b", aonx.class });
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
