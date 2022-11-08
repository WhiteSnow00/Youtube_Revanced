import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albd extends agzi implements ahax
{
    public static final albd a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public String d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)albd.class, (agzi)(a = new albd()));
    }
    
    private albd() {
        this.f = 2;
        this.d = "";
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
                if ((e = albd.e) == null) {
                    synchronized (albd.class) {
                        if (albd.e == null) {
                            albd.e = (ahbe)new agzb((agzi)albd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albd.a;
            }
            case 4: {
                return new agza((agzi)albd.a);
            }
            case 3: {
                return new albd();
            }
            case 2: {
                return newMessageInfo((MessageLite)albd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
