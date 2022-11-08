import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albk extends agzi implements ahax
{
    public static final albk a;
    private static volatile ahbe d;
    public int b;
    public amyl c;
    
    static {
        agzi.registerDefaultInstance((Class)albk.class, (agzi)(a = new albk()));
    }
    
    private albk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = albk.d) == null) {
                    synchronized (albk.class) {
                        if (albk.d == null) {
                            albk.d = (ahbe)new agzb((agzi)albk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albk.a;
            }
            case 4: {
                return new agza((agzi)albk.a);
            }
            case 3: {
                return new albk();
            }
            case 2: {
                return newMessageInfo((MessageLite)albk.a, "\u0001\u0001\u0000\u0001\ueb3e\u3e20\ueb3e\u3e20\u0001\u0000\u0000\u0000\ueb3e\u3e20\u1009\u0000", new Object[] { "b", "c" });
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
