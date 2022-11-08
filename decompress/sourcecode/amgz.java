import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgz extends agzi implements ahax
{
    public static final amgz a;
    private static volatile ahbe d;
    public int b;
    public aibb c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgz.class, (agzi)(a = new amgz()));
    }
    
    private amgz() {
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
                final ahbe d;
                if ((d = amgz.d) == null) {
                    synchronized (amgz.class) {
                        if (amgz.d == null) {
                            amgz.d = (ahbe)new agzb((agzi)amgz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amgz.a;
            }
            case 4: {
                return new agza((agzi)amgz.a);
            }
            case 3: {
                return new amgz();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgz.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
