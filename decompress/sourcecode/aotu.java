import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotu extends agzi implements ahax
{
    public static final aotu a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(aotu.class, a = new aotu());
    }
    
    private aotu() {
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
                if ((d = aotu.d) == null) {
                    synchronized (aotu.class) {
                        if (aotu.d == null) {
                            aotu.d = (ahbe)new agzb((agzi)aotu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aotu.a;
            }
            case 4: {
                return new agza((agzi)aotu.a);
            }
            case 3: {
                return new aotu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotu.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "b", "c" });
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
