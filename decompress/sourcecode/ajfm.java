import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfm extends agzi implements ahax
{
    public static final ajfm a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ajfm.class, a = new ajfm());
    }
    
    private ajfm() {
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
                if ((e = ajfm.e) == null) {
                    synchronized (ajfm.class) {
                        if (ajfm.e == null) {
                            ajfm.e = (ahbe)new agzb((agzi)ajfm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajfm.a;
            }
            case 4: {
                return new agza((agzi)ajfm.a);
            }
            case 3: {
                return new ajfm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ajfl.a(), "d", ajcg.n });
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
