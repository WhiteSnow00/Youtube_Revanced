import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgo extends agzi implements ahax
{
    public static final amgo a;
    private static volatile ahbe c;
    public aibb b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgo.class, (agzi)(a = new amgo()));
    }
    
    private amgo() {
        this.e = 2;
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
                final ahbe c;
                if ((c = amgo.c) == null) {
                    synchronized (amgo.class) {
                        if (amgo.c == null) {
                            amgo.c = (ahbe)new agzb((agzi)amgo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amgo.a;
            }
            case 4: {
                return new agza((agzi)amgo.a);
            }
            case 3: {
                return new amgo();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgo.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
