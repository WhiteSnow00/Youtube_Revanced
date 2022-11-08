import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahos extends agzi implements ahax
{
    public static final ahos a;
    private static volatile ahbe d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahos.class, a = new ahos());
    }
    
    private ahos() {
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
                if ((d = ahos.d) == null) {
                    synchronized (ahos.class) {
                        if (ahos.d == null) {
                            ahos.d = (ahbe)new agzb((agzi)ahos.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahos.a;
            }
            case 4: {
                return new agza((agzi)ahos.a);
            }
            case 3: {
                return new ahos();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahos.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
