import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqa extends agzi implements ahax
{
    public static final aeqa a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(aeqa.class, a = new aeqa());
    }
    
    private aeqa() {
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
                if ((d = aeqa.d) == null) {
                    synchronized (aeqa.class) {
                        if (aeqa.d == null) {
                            aeqa.d = (ahbe)new agzb((agzi)aeqa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aeqa.a;
            }
            case 4: {
                return new agza((agzi)aeqa.a);
            }
            case 3: {
                return new aeqa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeqa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
