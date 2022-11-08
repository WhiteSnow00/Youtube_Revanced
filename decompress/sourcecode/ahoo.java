import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoo extends agzi implements ahax
{
    public static final ahoo a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ahoo.class, a = new ahoo());
    }
    
    private ahoo() {
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
                if ((d = ahoo.d) == null) {
                    synchronized (ahoo.class) {
                        if (ahoo.d == null) {
                            ahoo.d = (ahbe)new agzb((agzi)ahoo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahoo.a;
            }
            case 4: {
                return new agza((agzi)ahoo.a);
            }
            case 3: {
                return new ahoo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoo.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103b\u0000", new Object[] { "c", "b" });
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
