import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfe extends agzi implements ahax
{
    public static final aqfe a;
    private static volatile ahbe d;
    public String b;
    public agyc c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aqfe.class, (agzi)(a = new aqfe()));
    }
    
    private aqfe() {
        this.b = "";
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqfe.d) == null) {
                    synchronized (aqfe.class) {
                        if (aqfe.d == null) {
                            aqfe.d = (ahbe)new agzb((agzi)aqfe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfe.a;
            }
            case 4: {
                return new agza((agzi)aqfe.a);
            }
            case 3: {
                return new aqfe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfe.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "e", "b", "c" });
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
