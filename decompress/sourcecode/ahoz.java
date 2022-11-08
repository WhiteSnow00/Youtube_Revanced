import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoz extends agzi implements ahax
{
    public static final ahoz a;
    private static volatile ahbe d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahoz.class, a = new ahoz());
    }
    
    private ahoz() {
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
                if ((d = ahoz.d) == null) {
                    synchronized (ahoz.class) {
                        if (ahoz.d == null) {
                            ahoz.d = (ahbe)new agzb((agzi)ahoz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahoz.a;
            }
            case 4: {
                return new agza((agzi)ahoz.a);
            }
            case 3: {
                return new ahoz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
