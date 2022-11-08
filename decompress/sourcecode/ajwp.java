import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwp extends agzi implements ahax
{
    public static final ajwp a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ajwp.class, a = new ajwp());
    }
    
    private ajwp() {
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
                if ((c = ajwp.c) == null) {
                    synchronized (ajwp.class) {
                        if (ajwp.c == null) {
                            ajwp.c = (ahbe)new agzb((agzi)ajwp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajwp.a;
            }
            case 4: {
                return new agza((agzi)ajwp.a);
            }
            case 3: {
                return new ajwp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
