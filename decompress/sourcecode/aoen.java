import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoen extends agzi implements ahax
{
    public static final aoen a;
    public static final agzg b;
    private static volatile ahbe d;
    public boolean c;
    private int e;
    
    static {
        final aoen a2 = new aoen();
        agzi.registerDefaultInstance(aoen.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 365619327, ahcm.k, aoen.class);
    }
    
    private aoen() {
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
                if ((d = aoen.d) == null) {
                    synchronized (aoen.class) {
                        if (aoen.d == null) {
                            aoen.d = (ahbe)new agzb((agzi)aoen.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoen.a;
            }
            case 4: {
                return new agza((agzi)aoen.a);
            }
            case 3: {
                return new aoen();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoen.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "e", "c" });
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
