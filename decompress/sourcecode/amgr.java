import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgr extends agzi implements ahax
{
    public static final amgr a;
    private static volatile ahbe b;
    private int c;
    private aibb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgr.class, (agzi)(a = new amgr()));
    }
    
    private amgr() {
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
                final ahbe b2;
                if ((b2 = amgr.b) == null) {
                    synchronized (amgr.class) {
                        if (amgr.b == null) {
                            amgr.b = (ahbe)new agzb((agzi)amgr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amgr.a;
            }
            case 4: {
                return new agza((agzi)amgr.a);
            }
            case 3: {
                return new amgr();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgr.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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