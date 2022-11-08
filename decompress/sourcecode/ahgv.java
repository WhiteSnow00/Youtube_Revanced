import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgv extends agzi implements ahax
{
    public static final ahgv a;
    private static volatile ahbe g;
    public int b;
    public boolean c;
    public aibc d;
    public aibc e;
    public String f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahgv.class, a = new ahgv());
    }
    
    private ahgv() {
        this.h = 2;
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
                if ((g = ahgv.g) == null) {
                    synchronized (ahgv.class) {
                        if (ahgv.g == null) {
                            ahgv.g = (ahbe)new agzb((agzi)ahgv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahgv.a;
            }
            case 4: {
                return new agza((agzi)ahgv.a);
            }
            case 3: {
                return new ahgv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgv.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\u1007\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1008\u0005", new Object[] { "b", "c", "d", "e", "f" });
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
