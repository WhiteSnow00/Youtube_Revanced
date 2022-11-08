import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbf extends agzi implements ahax
{
    public static final agbf a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agbf.class, a = new agbf());
    }
    
    private agbf() {
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
                if ((e = agbf.e) == null) {
                    synchronized (agbf.class) {
                        if (agbf.e == null) {
                            agbf.e = (ahbe)new agzb((agzi)agbf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agbf.a;
            }
            case 4: {
                return new agza((agzi)agbf.a);
            }
            case 3: {
                return new agbf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbf.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[] { "b", "c", "d" });
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
