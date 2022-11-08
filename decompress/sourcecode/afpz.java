import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpz extends agzi implements ahax
{
    public static final afpz a;
    private static volatile ahbe g;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(afpz.class, a = new afpz());
    }
    
    private afpz() {
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
                if ((g = afpz.g) == null) {
                    synchronized (afpz.class) {
                        if (afpz.g == null) {
                            afpz.g = (ahbe)new agzb((agzi)afpz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return afpz.a;
            }
            case 4: {
                return new agza((agzi)afpz.a);
            }
            case 3: {
                return new afpz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
