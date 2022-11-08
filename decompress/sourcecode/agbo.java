import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbo extends agzi implements ahax
{
    public static final agbo a;
    private static volatile ahbe f;
    public String b;
    public int c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(agbo.class, a = new agbo());
    }
    
    private agbo() {
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
                final ahbe f;
                if ((f = agbo.f) == null) {
                    synchronized (agbo.class) {
                        if (agbo.f == null) {
                            agbo.f = (ahbe)new agzb((agzi)agbo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agbo.a;
            }
            case 4: {
                return new agza((agzi)agbo.a);
            }
            case 3: {
                return new agbo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbo.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", new Object[] { "b", "c", "d", "e" });
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
