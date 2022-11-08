import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzy extends agzi implements ahax
{
    public static final afzy a;
    private static volatile ahbe e;
    public int b;
    public agaa c;
    public agbb d;
    
    static {
        agzi.registerDefaultInstance(afzy.class, a = new afzy());
    }
    
    private afzy() {
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
                if ((e = afzy.e) == null) {
                    synchronized (afzy.class) {
                        if (afzy.e == null) {
                            afzy.e = (ahbe)new agzb((agzi)afzy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afzy.a;
            }
            case 4: {
                return new agza((agzi)afzy.a);
            }
            case 3: {
                return new afzy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afzy.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[] { "b", "c", "d" });
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
