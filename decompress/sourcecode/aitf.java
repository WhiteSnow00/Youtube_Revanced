import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitf extends agzi implements ahax
{
    public static final aitf a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(aitf.class, a = new aitf());
    }
    
    private aitf() {
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
                if ((d = aitf.d) == null) {
                    synchronized (aitf.class) {
                        if (aitf.d == null) {
                            aitf.d = (ahbe)new agzb((agzi)aitf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aitf.a;
            }
            case 4: {
                return new agza((agzi)aitf.a);
            }
            case 3: {
                return new aitf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "b", "c" });
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
