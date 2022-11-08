import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbd extends agzi implements ahax
{
    public static final agbd a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agbd.class, a = new agbd());
    }
    
    private agbd() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = agbd.d) == null) {
                    synchronized (agbd.class) {
                        if (agbd.d == null) {
                            agbd.d = (ahbe)new agzb((agzi)agbd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agbd.a;
            }
            case 4: {
                return new agza((agzi)agbd.a);
            }
            case 3: {
                return new agbd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbd.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[] { "b", "c" });
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
