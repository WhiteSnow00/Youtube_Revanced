import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amth extends agzi implements ahax
{
    public static final amth a;
    private static volatile ahbe m;
    public int b;
    public int c;
    public Object d;
    public String e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public agyc k;
    public amry l;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(amth.class, a = new amth());
    }
    
    private amth() {
        this.c = 0;
        this.n = 2;
        this.e = "";
        this.i = "";
        final agyc b = agyc.b;
        this.k = agyc.b;
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
                final ahbe m;
                if ((m = amth.m) == null) {
                    synchronized (amth.class) {
                        if (amth.m == null) {
                            amth.m = (ahbe)new agzb((agzi)amth.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amth.a;
            }
            case 4: {
                return new agza((agzi)amth.a);
            }
            case 3: {
                return new amth();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amth.a, "\u0001\n\u0001\u0001\u0001\u000f\n\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0005\u100c\u0003\u0006\u1008\u0004\u0007\u143c\u0000\u000b\u100c\t\f\u100a\n\r\u1009\u000b\u000f\u103c\u0000", new Object[] { "d", "c", "b", "e", "f", "g", "h", amsc.q, "i", amtg.class, "j", amso.a(), "k", "l", amrx.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
