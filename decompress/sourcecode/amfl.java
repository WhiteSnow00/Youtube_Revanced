import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfl extends agzi implements ahax
{
    public static final amfl a;
    private static volatile ahbe i;
    public int b;
    public akbf c;
    public int d;
    public String e;
    public agyc f;
    public ahgm g;
    public aioe h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)amfl.class, (agzi)(a = new amfl()));
    }
    
    private amfl() {
        this.k = 2;
        this.e = "";
        this.f = agyc.b;
        emptyIntList();
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
                final ahbe i;
                if ((i = amfl.i) == null) {
                    synchronized (amfl.class) {
                        if (amfl.i == null) {
                            amfl.i = (ahbe)new agzb((agzi)amfl.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amfl.a;
            }
            case 4: {
                return new agza((agzi)amfl.a);
            }
            case 3: {
                return new amfl();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfl.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u100c\u0002\u0003\u1008\u0003\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1009\u0007\n\u1409\t", new Object[] { "b", "c", "d", amcq.n, "e", "j", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
