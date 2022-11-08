import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetu extends agzi implements ahax
{
    public static final aetu a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aetu.class, a = new aetu());
    }
    
    private aetu() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aetu.e) == null) {
                    synchronized (aetu.class) {
                        if (aetu.e == null) {
                            aetu.e = (ahbe)new agzb((agzi)aetu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aetu.a;
            }
            case 4: {
                return new agza((agzi)aetu.a);
            }
            case 3: {
                return new aetu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetu.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[] { "b", "c", "d" });
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
