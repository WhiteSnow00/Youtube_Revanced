import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oba extends agzi implements ahax
{
    public static final oba a;
    private static volatile ahbe e;
    public String b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)oba.class, (agzi)(a = new oba()));
    }
    
    private oba() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = oba.e) == null) {
                    synchronized (oba.class) {
                        if (oba.e == null) {
                            oba.e = (ahbe)new agzb((agzi)oba.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oba.a;
            }
            case 4: {
                return new agza((agzi)oba.a);
            }
            case 3: {
                return new oba();
            }
            case 2: {
                return newMessageInfo((MessageLite)oba.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\f", new Object[] { "b", "c", "d" });
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
