import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwv extends agzi implements ahax
{
    public static final atwv a;
    private static volatile ahbe d;
    public int b;
    public atwt c;
    
    static {
        agzi.registerDefaultInstance(atwv.class, a = new atwv());
    }
    
    private atwv() {
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
                if ((d = atwv.d) == null) {
                    synchronized (atwv.class) {
                        if (atwv.d == null) {
                            atwv.d = (ahbe)new agzb((agzi)atwv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atwv.a;
            }
            case 4: {
                return new agza((agzi)atwv.a);
            }
            case 3: {
                return new atwv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
