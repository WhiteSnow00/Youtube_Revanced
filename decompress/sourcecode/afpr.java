import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpr extends agzi implements ahax
{
    public static final afpr a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public afpm d;
    
    static {
        agzi.registerDefaultInstance(afpr.class, a = new afpr());
    }
    
    private afpr() {
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
                if ((e = afpr.e) == null) {
                    synchronized (afpr.class) {
                        if (afpr.e == null) {
                            afpr.e = (ahbe)new agzb((agzi)afpr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afpr.a;
            }
            case 4: {
                return new agza((agzi)afpr.a);
            }
            case 3: {
                return new afpr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", aeih.o, "d" });
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
