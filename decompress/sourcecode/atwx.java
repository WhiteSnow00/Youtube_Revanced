import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwx extends agzi implements ahax
{
    public static final atwx a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(atwx.class, a = new atwx());
    }
    
    private atwx() {
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
                if ((e = atwx.e) == null) {
                    synchronized (atwx.class) {
                        if (atwx.e == null) {
                            atwx.e = (ahbe)new agzb((agzi)atwx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atwx.a;
            }
            case 4: {
                return new agza((agzi)atwx.a);
            }
            case 3: {
                return new atwx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
