import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albl extends agzi implements ahax
{
    public static final albl a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public long d;
    public String e;
    public String f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)albl.class, (agzi)(a = new albl()));
    }
    
    private albl() {
        this.h = 2;
        this.e = "";
        this.f = "";
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
                final ahbe g;
                if ((g = albl.g) == null) {
                    synchronized (albl.class) {
                        if (albl.g == null) {
                            albl.g = (ahbe)new agzb((agzi)albl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return albl.a;
            }
            case 4: {
                return new agza((agzi)albl.a);
            }
            case 3: {
                return new albl();
            }
            case 2: {
                return newMessageInfo((MessageLite)albl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
