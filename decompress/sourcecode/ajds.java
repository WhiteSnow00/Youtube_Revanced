import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajds extends agzi implements ahax
{
    public static final ajds a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ajds.class, a = new ajds());
    }
    
    private ajds() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajds.e) == null) {
                    synchronized (ajds.class) {
                        if (ajds.e == null) {
                            ajds.e = (ahbe)new agzb((agzi)ajds.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajds.a;
            }
            case 4: {
                return new agza((agzi)ajds.a);
            }
            case 3: {
                return new ajds();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajds.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", ajcg.f, "d" });
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
