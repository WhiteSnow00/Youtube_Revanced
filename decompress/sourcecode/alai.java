import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alai extends agzi implements ahax
{
    public static final alai a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance((Class)alai.class, (agzi)(a = new alai()));
    }
    
    private alai() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = alai.d) == null) {
                    synchronized (alai.class) {
                        if (alai.d == null) {
                            alai.d = (ahbe)new agzb((agzi)alai.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alai.a;
            }
            case 4: {
                return new agza((agzi)alai.a);
            }
            case 3: {
                return new alai();
            }
            case 2: {
                return newMessageInfo((MessageLite)alai.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
