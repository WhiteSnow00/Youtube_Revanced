import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyt extends agzi implements ahax
{
    public static final ahyt a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahyt.class, a = new ahyt());
    }
    
    private ahyt() {
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
                if ((c = ahyt.c) == null) {
                    synchronized (ahyt.class) {
                        if (ahyt.c == null) {
                            ahyt.c = (ahbe)new agzb((agzi)ahyt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahyt.a;
            }
            case 4: {
                return new agza((agzi)ahyt.a);
            }
            case 3: {
                return new ahyt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahse.u });
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
