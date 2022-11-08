import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obe extends agzi implements ahax
{
    public static final obe a;
    private static volatile ahbe f;
    public oba b;
    public obi c;
    public int d;
    public oax e;
    
    static {
        agzi.registerDefaultInstance((Class)obe.class, (agzi)(a = new obe()));
    }
    
    private obe() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = obe.f) == null) {
                    synchronized (obe.class) {
                        if (obe.f == null) {
                            obe.f = (ahbe)new agzb((agzi)obe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return obe.a;
            }
            case 4: {
                return new agza((agzi)obe.a);
            }
            case 3: {
                return new obe();
            }
            case 2: {
                return newMessageInfo((MessageLite)obe.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f\u0004\t", new Object[] { "b", "c", "d", "e" });
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
