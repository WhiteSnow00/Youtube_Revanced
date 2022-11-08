import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agor extends agzi implements ahax
{
    public static final agor a;
    private static volatile ahbe d;
    public int b;
    public agoq c;
    
    static {
        agzi.registerDefaultInstance(agor.class, a = new agor());
    }
    
    private agor() {
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
                if ((d = agor.d) == null) {
                    synchronized (agor.class) {
                        if (agor.d == null) {
                            agor.d = (ahbe)new agzb((agzi)agor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agor.a;
            }
            case 4: {
                return new agza((agzi)agor.a);
            }
            case 3: {
                return new agor();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agor.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
