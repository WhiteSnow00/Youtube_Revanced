import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzz extends agzi implements ahax
{
    public static final afzz a;
    private static volatile ahbe d;
    public agab b;
    public agbc c;
    
    static {
        agzi.registerDefaultInstance(afzz.class, a = new afzz());
    }
    
    private afzz() {
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
                if ((d = afzz.d) == null) {
                    synchronized (afzz.class) {
                        if (afzz.d == null) {
                            afzz.d = (ahbe)new agzb((agzi)afzz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afzz.a;
            }
            case 4: {
                return new agza((agzi)afzz.a);
            }
            case 3: {
                return new afzz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afzz.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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