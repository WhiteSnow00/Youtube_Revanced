import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhd extends agzi implements ahax
{
    public static final ahhd a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ahhd.class, a = new ahhd());
    }
    
    private ahhd() {
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
                if ((d = ahhd.d) == null) {
                    synchronized (ahhd.class) {
                        if (ahhd.d == null) {
                            ahhd.d = (ahbe)new agzb((agzi)ahhd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhd.a;
            }
            case 4: {
                return new agza((agzi)ahhd.a);
            }
            case 3: {
                return new ahhd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
