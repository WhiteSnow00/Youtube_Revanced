import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwn extends agzi implements ahax
{
    public static final atwn a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public long d;
    public atwi e;
    
    static {
        agzi.registerDefaultInstance(atwn.class, a = new atwn());
    }
    
    private atwn() {
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
                if ((f = atwn.f) == null) {
                    synchronized (atwn.class) {
                        if (atwn.f == null) {
                            atwn.f = (ahbe)new agzb((agzi)atwn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atwn.a;
            }
            case 4: {
                return new agza((agzi)atwn.a);
            }
            case 3: {
                return new atwn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
