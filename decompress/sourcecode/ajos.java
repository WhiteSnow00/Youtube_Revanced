import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajos extends agzi implements ahax
{
    public static final ajos a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ajos.class, (agzi)(a = new ajos()));
    }
    
    private ajos() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajos.d) == null) {
                    synchronized (ajos.class) {
                        if (ajos.d == null) {
                            ajos.d = (ahbe)new agzb((agzi)ajos.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajos.a;
            }
            case 4: {
                return new agza((agzi)ajos.a);
            }
            case 3: {
                return new ajos();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajos.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
