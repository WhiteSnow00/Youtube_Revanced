import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprb extends agzi implements ahax
{
    public static final aprb a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)aprb.class, (agzi)(a = new aprb()));
    }
    
    private aprb() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aprb.d) == null) {
                    synchronized (aprb.class) {
                        if (aprb.d == null) {
                            aprb.d = (ahbe)new agzb((agzi)aprb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprb.a;
            }
            case 4: {
                return new agza((agzi)aprb.a);
            }
            case 3: {
                return new aprb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprb.a, "\u0001\u0006\u0001\u0000\u0001\u0010\u0006\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\t\u103c\u0000\f\u103c\u0000\r\u103c\u0000\u0010\u103c\u0000", new Object[] { "c", "b", aprl.class, aprm.class, aprg.class, aprd.class, aprc.class, apre.class });
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
