import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class low extends agzi implements ahax
{
    public static final low a;
    private static volatile ahbe f;
    public agyc b;
    public agyc c;
    public agyc d;
    public int e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(low.class, a = new low());
    }
    
    private low() {
        this.b = agyc.b;
        final agyc b = agyc.b;
        this.c = b;
        this.d = b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = low.f) == null) {
                    synchronized (low.class) {
                        if (low.f == null) {
                            low.f = (ahbe)new agzb((agzi)low.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return low.a;
            }
            case 4: {
                return new agza((agzi)low.a);
            }
            case 3: {
                return new low();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)low.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u100a\u0002\u0004\u100c\u0003", new Object[] { "g", "b", "c", "d", "e", aipt.i });
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
