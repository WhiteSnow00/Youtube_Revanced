import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agny extends agzi implements ahax
{
    public static final agny a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(agny.class, a = new agny());
    }
    
    private agny() {
        this.c = "";
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
                if ((d = agny.d) == null) {
                    synchronized (agny.class) {
                        if (agny.d == null) {
                            agny.d = (ahbe)new agzb((agzi)agny.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agny.a;
            }
            case 4: {
                return new agza((agzi)agny.a);
            }
            case 3: {
                return new agny();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agny.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "b", "c" });
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
