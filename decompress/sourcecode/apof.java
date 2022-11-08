import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apof extends agzi implements ahax
{
    public static final apof a;
    private static volatile ahbe f;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)apof.class, (agzi)(a = new apof()));
    }
    
    private apof() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apof.f) == null) {
                    synchronized (apof.class) {
                        if (apof.f == null) {
                            apof.f = (ahbe)new agzb((agzi)apof.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apof.a;
            }
            case 4: {
                return new agza((agzi)apof.a);
            }
            case 3: {
                return new apof();
            }
            case 2: {
                return newMessageInfo((MessageLite)apof.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0005\u1007\u0002\u0007\u1004\u0004", new Object[] { "g", "b", "c", "d", "e" });
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
