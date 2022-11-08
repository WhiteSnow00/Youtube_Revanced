import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaa extends agzi implements ahax
{
    public static final alaa a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public String d;
    public int e;
    public String f;
    public String g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)alaa.class, (agzi)(a = new alaa()));
    }
    
    private alaa() {
        this.i = 2;
        this.d = "";
        this.f = "";
        this.g = "";
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
                final ahbe h;
                if ((h = alaa.h) == null) {
                    synchronized (alaa.class) {
                        if (alaa.h == null) {
                            alaa.h = (ahbe)new agzb((agzi)alaa.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alaa.a;
            }
            case 4: {
                return new agza((agzi)alaa.a);
            }
            case 3: {
                return new alaa();
            }
            case 2: {
                return newMessageInfo((MessageLite)alaa.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", apsc.l, "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
