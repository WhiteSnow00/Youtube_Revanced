import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuc extends agzi implements ahax
{
    public static final ahuc a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ahuc.class, a = new ahuc());
    }
    
    private ahuc() {
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
                if ((d = ahuc.d) == null) {
                    synchronized (ahuc.class) {
                        if (ahuc.d == null) {
                            ahuc.d = (ahbe)new agzb((agzi)ahuc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahuc.a;
            }
            case 4: {
                return new agza((agzi)ahuc.a);
            }
            case 3: {
                return new ahuc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuc.a, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103b\u0000\u0003\u103b\u0000\u0004\u103b\u0000\u0005\u103b\u0000\u0006\u103b\u0000\u0007\u103b\u0000\b\u103b\u0000", new Object[] { "c", "b", ahub.class });
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
