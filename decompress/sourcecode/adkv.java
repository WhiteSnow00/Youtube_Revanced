import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkv extends agzi implements ahax
{
    public static final adkv a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public String e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(adkv.class, a = new adkv());
    }
    
    private adkv() {
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
                final ahbe g;
                if ((g = adkv.g) == null) {
                    synchronized (adkv.class) {
                        if (adkv.g == null) {
                            adkv.g = (ahbe)new agzb((agzi)adkv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return adkv.a;
            }
            case 4: {
                return new agza((agzi)adkv.a);
            }
            case 3: {
                return new adkv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adkv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u1007\u0003", new Object[] { "b", "c", aotc.n, "d", apfn.i, "e", "f" });
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
