import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class far extends agzi implements ahax
{
    public static final far a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(far.class, a = new far());
    }
    
    private far() {
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
                if ((d = far.d) == null) {
                    synchronized (far.class) {
                        if (far.d == null) {
                            far.d = (ahbe)new agzb((agzi)far.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return far.a;
            }
            case 4: {
                return new agza((agzi)far.a);
            }
            case 3: {
                return new far();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)far.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ahho.m });
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
