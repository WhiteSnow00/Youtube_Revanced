import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxs extends agzi implements ahax
{
    public static final ahxs a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ahxs.class, a = new ahxs());
    }
    
    private ahxs() {
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
                if ((d = ahxs.d) == null) {
                    synchronized (ahxs.class) {
                        if (ahxs.d == null) {
                            ahxs.d = (ahbe)new agzb((agzi)ahxs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahxs.a;
            }
            case 4: {
                return new agza((agzi)ahxs.a);
            }
            case 3: {
                return new ahxs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxs.a, "\u0001\u0001\u0001\u0000\"\"\u0001\u0000\u0000\u0000\"\u103c\u0000", new Object[] { "c", "b", ahxu.class });
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