import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agub extends agzi implements ahax
{
    public static final agub a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(agub.class, a = new agub());
    }
    
    private agub() {
        this.b = 0;
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
                if ((d = agub.d) == null) {
                    synchronized (agub.class) {
                        if (agub.d == null) {
                            agub.d = (ahbe)new agzb((agzi)agub.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agub.a;
            }
            case 4: {
                return new agza((agzi)agub.a);
            }
            case 3: {
                return new agub();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agub.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103f\u0000", new Object[] { "c", "b", agte.l });
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
