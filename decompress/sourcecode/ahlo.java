import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlo extends agzi implements ahax
{
    public static final ahlo a;
    private static volatile ahbe e;
    public int b;
    public ahln c;
    public ahjc d;
    
    static {
        agzi.registerDefaultInstance((Class)ahlo.class, (agzi)(a = new ahlo()));
    }
    
    private ahlo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahlo.e) == null) {
                    synchronized (ahlo.class) {
                        if (ahlo.e == null) {
                            ahlo.e = (ahbe)new agzb((agzi)ahlo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlo.a;
            }
            case 4: {
                return new agza((agzi)ahlo.a);
            }
            case 3: {
                return new ahlo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlo.a, "\u0001\u0002\u0000\u0001\uea6f\u32ff\uea7e\u32ff\u0002\u0000\u0000\u0000\uea6f\u32ff\u1009\u0001\uea7e\u32ff\u1009\u0000", new Object[] { "b", "d", "c" });
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
