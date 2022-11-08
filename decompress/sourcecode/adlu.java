import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlu extends agzi implements ahax
{
    public static final adlu a;
    private static volatile ahbe g;
    public int b;
    public ahas c;
    public String d;
    public agyc e;
    public agyc f;
    
    static {
        agzi.registerDefaultInstance(adlu.class, a = new adlu());
    }
    
    private adlu() {
        this.c = ahas.a;
        this.d = "";
        this.e = agyc.b;
        this.f = agyc.b;
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
                if ((g = adlu.g) == null) {
                    synchronized (adlu.class) {
                        if (adlu.g == null) {
                            adlu.g = (ahbe)new agzb((agzi)adlu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return adlu.a;
            }
            case 4: {
                return new agza((agzi)adlu.a);
            }
            case 3: {
                return new adlu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adlu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002\u1008\u0000\u0003\u100a\u0001\u0004\u100a\u0002", new Object[] { "b", "c", adlt.a, "d", "e", "f" });
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
