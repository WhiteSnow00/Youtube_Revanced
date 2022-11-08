import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageu extends agzi implements ahax
{
    public static final ageu a;
    private static volatile ahbe c;
    public agzq b;
    
    static {
        agzi.registerDefaultInstance(ageu.class, a = new ageu());
    }
    
    private ageu() {
        emptyIntList();
        emptyIntList();
        this.b = agzi.emptyIntList();
        emptyIntList();
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
                if ((c = ageu.c) == null) {
                    synchronized (ageu.class) {
                        if (ageu.c == null) {
                            ageu.c = (ahbe)new agzb((agzi)ageu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ageu.a;
            }
            case 4: {
                return new agza((agzi)ageu.a);
            }
            case 3: {
                return new ageu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ageu.a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[] { "b" });
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
