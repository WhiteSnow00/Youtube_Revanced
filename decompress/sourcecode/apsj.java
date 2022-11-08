import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsj extends agzi implements ahax
{
    public static final apsj a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)apsj.class, (agzi)(a = new apsj()));
    }
    
    private apsj() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apsj.d) == null) {
                    synchronized (apsj.class) {
                        if (apsj.d == null) {
                            apsj.d = (ahbe)new agzb((agzi)apsj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsj.a;
            }
            case 4: {
                return new agza((agzi)apsj.a);
            }
            case 3: {
                return new apsj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
