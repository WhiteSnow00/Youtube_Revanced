import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aica extends agzi implements ahax
{
    public static final aica a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public apij d;
    public String e;
    private ahpx g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aica.class, (agzi)(a = new aica()));
    }
    
    private aica() {
        this.h = 2;
        this.e = "";
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
                final ahbe f;
                if ((f = aica.f) == null) {
                    synchronized (aica.class) {
                        if (aica.f == null) {
                            aica.f = (ahbe)new agzb((agzi)aica.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aica.a;
            }
            case 4: {
                return new agza((agzi)aica.a);
            }
            case 3: {
                return new aica();
            }
            case 2: {
                return newMessageInfo((MessageLite)aica.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0001\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1409\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "g", "e" });
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
