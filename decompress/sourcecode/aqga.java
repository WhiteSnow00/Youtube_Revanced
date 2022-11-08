import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqga extends agzi implements ahax
{
    public static final aqga a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aqga.class, (agzi)(a = new aqga()));
    }
    
    private aqga() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqga.c) == null) {
                    synchronized (aqga.class) {
                        if (aqga.c == null) {
                            aqga.c = (ahbe)new agzb((agzi)aqga.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqga.a;
            }
            case 4: {
                return new agza((agzi)aqga.a);
            }
            case 3: {
                return new aqga();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqga.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
