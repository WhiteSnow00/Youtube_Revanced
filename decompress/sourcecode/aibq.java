import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibq extends agzi implements ahax
{
    public static final aibq a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)aibq.class, (agzi)(a = new aibq()));
    }
    
    private aibq() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aibq.d) == null) {
                    synchronized (aibq.class) {
                        if (aibq.d == null) {
                            aibq.d = (ahbe)new agzb((agzi)aibq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibq.a;
            }
            case 4: {
                return new agza((agzi)aibq.a);
            }
            case 3: {
                return new aibq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibq.a, "\u0001\u0002\u0001\u0000\uec16\u387f\uf20f\u3e81\u0002\u0000\u0000\u0000\uec16\u387f\u103c\u0000\uf20f\u3e81\u103c\u0000", new Object[] { "c", "b", ahzg.class, allu.class });
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
