import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albo extends agzi implements ahax
{
    public static final albo a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public String d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)albo.class, (agzi)(a = new albo()));
    }
    
    private albo() {
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
                if ((e = albo.e) == null) {
                    synchronized (albo.class) {
                        if (albo.e == null) {
                            albo.e = (ahbe)new agzb((agzi)albo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albo.a;
            }
            case 4: {
                return new agza((agzi)albo.a);
            }
            case 3: {
                return new albo();
            }
            case 2: {
                return newMessageInfo((MessageLite)albo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
