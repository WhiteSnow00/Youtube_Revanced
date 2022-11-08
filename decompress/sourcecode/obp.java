import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obp extends agzi implements ahax
{
    public static final obp a;
    private static volatile ahbe d;
    public obo b;
    public obn c;
    
    static {
        agzi.registerDefaultInstance((Class)obp.class, (agzi)(a = new obp()));
    }
    
    private obp() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = obp.d) == null) {
                    synchronized (obp.class) {
                        if (obp.d == null) {
                            obp.d = (ahbe)new agzb((agzi)obp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return obp.a;
            }
            case 4: {
                return new agza((agzi)obp.a);
            }
            case 3: {
                return new obp();
            }
            case 2: {
                return newMessageInfo((MessageLite)obp.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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
