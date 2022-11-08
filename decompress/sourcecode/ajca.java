import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajca extends agzi implements ahax
{
    public static final ajca a;
    private static volatile ahbe g;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(ajca.class, a = new ajca());
    }
    
    private ajca() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ajca.g) == null) {
                    synchronized (ajca.class) {
                        if (ajca.g == null) {
                            ajca.g = (ahbe)new agzb((agzi)ajca.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajca.a;
            }
            case 4: {
                return new agza((agzi)ajca.a);
            }
            case 3: {
                return new ajca();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajca.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
