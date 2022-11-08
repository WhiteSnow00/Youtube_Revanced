import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeii extends agzi implements ahax
{
    public static final aeii a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(aeii.class, a = new aeii());
    }
    
    private aeii() {
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
                if ((e = aeii.e) == null) {
                    synchronized (aeii.class) {
                        if (aeii.e == null) {
                            aeii.e = (ahbe)new agzb((agzi)aeii.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aeii.a;
            }
            case 4: {
                return new agza((agzi)aeii.a);
            }
            case 3: {
                return new aeii();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeii.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
