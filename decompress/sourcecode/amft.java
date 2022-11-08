import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amft extends agzi implements ahax
{
    public static final amft a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public boolean d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amft.class, (agzi)(a = new amft()));
    }
    
    private amft() {
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
                final ahbe e;
                if ((e = amft.e) == null) {
                    synchronized (amft.class) {
                        if (amft.e == null) {
                            amft.e = (ahbe)new agzb((agzi)amft.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amft.a;
            }
            case 4: {
                return new agza((agzi)amft.a);
            }
            case 3: {
                return new amft();
            }
            case 2: {
                return newMessageInfo((MessageLite)amft.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
