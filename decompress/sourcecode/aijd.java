import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijd extends agzi implements ahax
{
    public static final aijd a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public float e;
    
    static {
        agzi.registerDefaultInstance(aijd.class, a = new aijd());
    }
    
    private aijd() {
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
                if ((f = aijd.f) == null) {
                    synchronized (aijd.class) {
                        if (aijd.f == null) {
                            aijd.f = (ahbe)new agzb((agzi)aijd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aijd.a;
            }
            case 4: {
                return new agza((agzi)aijd.a);
            }
            case 3: {
                return new aijd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1001\u0002", new Object[] { "b", "c", "d", "e" });
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
