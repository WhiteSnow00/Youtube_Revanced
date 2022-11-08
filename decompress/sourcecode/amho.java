import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amho extends agzi implements ahax
{
    public static final amho a;
    private static volatile ahbe k;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public int f;
    public aorm g;
    public agzy h;
    public agzy i;
    public ajsq j;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)amho.class, (agzi)(a = new amho()));
    }
    
    private amho() {
        this.l = 2;
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
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
                final ahbe k;
                if ((k = amho.k) == null) {
                    synchronized (amho.class) {
                        if (amho.k == null) {
                            amho.k = (ahbe)new agzb((agzi)amho.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amho.a;
            }
            case 4: {
                return new agza((agzi)amho.a);
            }
            case 3: {
                return new amho();
            }
            case 2: {
                return newMessageInfo((MessageLite)amho.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u041b\u0006\u041b\u0007\u100c\u0003\b\u1409\u0005", new Object[] { "b", "c", "d", "e", "g", "h", aibc.class, "i", aojn.class, "f", angs.l, "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
