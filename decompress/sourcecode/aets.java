import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aets extends agzi implements ahax
{
    public static final aets a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(aets.class, a = new aets());
    }
    
    private aets() {
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
                if ((d = aets.d) == null) {
                    synchronized (aets.class) {
                        if (aets.d == null) {
                            aets.d = (ahbe)new agzb((agzi)aets.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aets.a;
            }
            case 4: {
                return new agza((agzi)aets.a);
            }
            case 3: {
                return new aets();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aets.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[] { "b", "c" });
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
