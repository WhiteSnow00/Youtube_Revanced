import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwj extends agzi implements ahax
{
    public static final amwj a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public String f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amwj.class, a = new amwj());
    }
    
    private amwj() {
        this.h = 2;
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = amwj.g) == null) {
                    synchronized (amwj.class) {
                        if (amwj.g == null) {
                            amwj.g = (ahbe)new agzb((agzi)amwj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amwj.a;
            }
            case 4: {
                return new agza((agzi)amwj.a);
            }
            case 3: {
                return new amwj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
