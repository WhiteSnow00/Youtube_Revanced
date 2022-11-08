import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aike extends agzi implements ahax
{
    public static final aike a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aike.class, a = new aike());
    }
    
    private aike() {
        this.c = "";
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
                if ((d = aike.d) == null) {
                    synchronized (aike.class) {
                        if (aike.d == null) {
                            aike.d = (ahbe)new agzb((agzi)aike.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aike.a;
            }
            case 4: {
                return new agza((agzi)aike.a);
            }
            case 3: {
                return new aike();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aike.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
