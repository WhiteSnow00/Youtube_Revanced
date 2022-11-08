import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfc extends agzi implements ahax
{
    public static final aqfc a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aqfc.class, (agzi)(a = new aqfc()));
    }
    
    private aqfc() {
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
                if ((c = aqfc.c) == null) {
                    synchronized (aqfc.class) {
                        if (aqfc.c == null) {
                            aqfc.c = (ahbe)new agzb((agzi)aqfc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqfc.a;
            }
            case 4: {
                return new agza((agzi)aqfc.a);
            }
            case 3: {
                return new aqfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
