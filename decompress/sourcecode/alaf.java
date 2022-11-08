import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaf extends agzi implements ahax
{
    public static final alaf a;
    private static volatile ahbe k;
    public int b;
    public akjd c;
    public apgc d;
    public String e;
    public int f;
    public aila g;
    public alaj h;
    public apmo i;
    public String j;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)alaf.class, (agzi)(a = new alaf()));
    }
    
    private alaf() {
        this.l = 2;
        this.e = "";
        this.f = 1;
        this.j = "";
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
                if ((k = alaf.k) == null) {
                    synchronized (alaf.class) {
                        if (alaf.k == null) {
                            alaf.k = (ahbe)new agzb((agzi)alaf.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return alaf.a;
            }
            case 4: {
                return new agza((agzi)alaf.a);
            }
            case 3: {
                return new alaf();
            }
            case 2: {
                return newMessageInfo((MessageLite)alaf.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1009\u0004\b\u1009\u0007\u000b\u1009\t\r\u1008\f", new Object[] { "b", "c", "d", "e", "f", akwf.n, "g", "h", "i", "j" });
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
