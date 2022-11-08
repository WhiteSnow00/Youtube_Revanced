import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class also extends agzi implements ahax
{
    public static final also a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public alsp e;
    
    static {
        agzi.registerDefaultInstance(also.class, a = new also());
    }
    
    private also() {
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
                final ahbe f;
                if ((f = also.f) == null) {
                    synchronized (also.class) {
                        if (also.f == null) {
                            also.f = (ahbe)new agzb((agzi)also.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return also.a;
            }
            case 4: {
                return new agza((agzi)also.a);
            }
            case 3: {
                return new also();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)also.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", ahzk.g, "e" });
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
