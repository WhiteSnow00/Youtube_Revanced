import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgk extends agzi implements ahax
{
    public static final amgk a;
    private static volatile ahbe f;
    public amgg b;
    public amgh c;
    public amgg d;
    public amgh e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amgk.class, (agzi)(a = new amgk()));
    }
    
    private amgk() {
        this.h = 2;
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
                final ahbe f;
                if ((f = amgk.f) == null) {
                    synchronized (amgk.class) {
                        if (amgk.f == null) {
                            amgk.f = (ahbe)new agzb((agzi)amgk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amgk.a;
            }
            case 4: {
                return new agza((agzi)amgk.a);
            }
            case 3: {
                return new amgk();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgk.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
