import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgp extends agzi implements ahax
{
    public static final aqgp a;
    private static volatile ahbe d;
    public String b;
    public String c;
    private int e;
    private aqfl f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqgp.class, (agzi)(a = new aqgp()));
    }
    
    private aqgp() {
        this.g = 2;
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqgp.d) == null) {
                    synchronized (aqgp.class) {
                        if (aqgp.d == null) {
                            aqgp.d = (ahbe)new agzb((agzi)aqgp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqgp.a;
            }
            case 4: {
                return new agza((agzi)aqgp.a);
            }
            case 3: {
                return new aqgp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002", new Object[] { "e", "b", "f", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
