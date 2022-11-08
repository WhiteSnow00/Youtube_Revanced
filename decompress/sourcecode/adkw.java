import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkw extends agzi implements ahax
{
    public static final adkw a;
    private static volatile ahbe f;
    public double b;
    public double c;
    public String d;
    public String e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(adkw.class, a = new adkw());
    }
    
    private adkw() {
        this.d = "";
        this.e = "";
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
                if ((f = adkw.f) == null) {
                    synchronized (adkw.class) {
                        if (adkw.f == null) {
                            adkw.f = (ahbe)new agzb((agzi)adkw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return adkw.a;
            }
            case 4: {
                return new agza((agzi)adkw.a);
            }
            case 3: {
                return new adkw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adkw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
