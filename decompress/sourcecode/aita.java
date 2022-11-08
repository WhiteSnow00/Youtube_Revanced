import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aita extends agzi implements ahax
{
    public static final aita a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aita.class, a = new aita());
    }
    
    private aita() {
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
                if ((d = aita.d) == null) {
                    synchronized (aita.class) {
                        if (aita.d == null) {
                            aita.d = (ahbe)new agzb((agzi)aita.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aita.a;
            }
            case 4: {
                return new agza((agzi)aita.a);
            }
            case 3: {
                return new aita();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aita.a, "\u0001\u0001\u0001\u0000\uec6a\u40ba\uec6a\u40ba\u0001\u0000\u0000\u0000\uec6a\u40ba\u103c\u0000", new Object[] { "c", "b", aitf.class });
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
