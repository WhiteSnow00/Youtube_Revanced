import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsy extends agzi implements ahax
{
    public static final agsy a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public agsx e;
    
    static {
        agzi.registerDefaultInstance(agsy.class, a = new agsy());
    }
    
    private agsy() {
        this.c = 0;
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
                if ((f = agsy.f) == null) {
                    synchronized (agsy.class) {
                        if (agsy.f == null) {
                            agsy.f = (ahbe)new agzb((agzi)agsy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agsy.a;
            }
            case 4: {
                return new agza((agzi)agsy.a);
            }
            case 3: {
                return new agsy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsy.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000", new Object[] { "d", "c", "b", "e", aguc.class, agtm.class, agtw.class });
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
