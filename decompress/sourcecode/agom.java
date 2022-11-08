import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agom extends agzi implements ahax
{
    public static final agom a;
    private static volatile ahbe d;
    public agoj b;
    public agnv c;
    
    static {
        agzi.registerDefaultInstance(agom.class, a = new agom());
    }
    
    private agom() {
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
                if ((d = agom.d) == null) {
                    synchronized (agom.class) {
                        if (agom.d == null) {
                            agom.d = (ahbe)new agzb((agzi)agom.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agom.a;
            }
            case 4: {
                return new agza((agzi)agom.a);
            }
            case 3: {
                return new agom();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agom.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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
