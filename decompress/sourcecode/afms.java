import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afms extends agzi implements ahax
{
    public static final afms a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(afms.class, a = new afms());
    }
    
    private afms() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = afms.c) == null) {
                    synchronized (afms.class) {
                        if (afms.c == null) {
                            afms.c = (ahbe)new agzb((agzi)afms.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afms.a;
            }
            case 4: {
                return new agza((agzi)afms.a);
            }
            case 3: {
                return new afms();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afms.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1008\u0000", new Object[] { "d", "b" });
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
