import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izf extends agzi implements ahax
{
    public static final izf a;
    private static volatile ahbe g;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    
    static {
        agzi.registerDefaultInstance(izf.class, a = new izf());
    }
    
    private izf() {
        this.d = -1L;
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
                if ((g = izf.g) == null) {
                    synchronized (izf.class) {
                        if (izf.g == null) {
                            izf.g = (ahbe)new agzb((agzi)izf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return izf.a;
            }
            case 4: {
                return new agza((agzi)izf.a);
            }
            case 3: {
                return new izf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)izf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
