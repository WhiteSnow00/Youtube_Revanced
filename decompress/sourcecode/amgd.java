import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgd extends agzi implements ahax
{
    public static final amgd a;
    private static volatile ahbe d;
    public int b;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amgd.class, (agzi)(a = new amgd()));
    }
    
    private amgd() {
        this.f = 2;
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
                if ((d = amgd.d) == null) {
                    synchronized (amgd.class) {
                        if (amgd.d == null) {
                            amgd.d = (ahbe)new agzb((agzi)amgd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amgd.a;
            }
            case 4: {
                return new agza((agzi)amgd.a);
            }
            case 3: {
                return new amgd();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "e", "b", anaf.g, "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
