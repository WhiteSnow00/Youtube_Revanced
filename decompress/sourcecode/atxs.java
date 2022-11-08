import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxs extends agzi implements ahax
{
    public static final atxs a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public agzq e;
    public agzq f;
    
    static {
        agzi.registerDefaultInstance(atxs.class, a = new atxs());
    }
    
    private atxs() {
        this.e = agzi.emptyIntList();
        this.f = agzi.emptyIntList();
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
                if ((g = atxs.g) == null) {
                    synchronized (atxs.class) {
                        if (atxs.g == null) {
                            atxs.g = (ahbe)new agzb((agzi)atxs.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return atxs.a;
            }
            case 4: {
                return new agza((byte[])null, (float[])null);
            }
            case 3: {
                return new atxs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxs.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003'\u0004'", new Object[] { "b", "c", "d", "e", "f" });
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
