import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhq extends agzi implements ahax
{
    public static final amhq a;
    private static volatile ahbe m;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public akbf f;
    public boolean g;
    public aioe h;
    public aioe i;
    public agzy j;
    public long k;
    public long l;
    private amhr n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)amhq.class, (agzi)(a = new amhq()));
    }
    
    private amhq() {
        this.o = 2;
        this.j = emptyProtobufList();
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
                final ahbe m;
                if ((m = amhq.m) == null) {
                    synchronized (amhq.class) {
                        if (amhq.m == null) {
                            amhq.m = (ahbe)new agzb((agzi)amhq.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amhq.a;
            }
            case 4: {
                return new agza((agzi)amhq.a);
            }
            case 3: {
                return new amhq();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhq.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1007\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\t\u001b\u000b\u1003\n\f\u1003\u000b\r\u1409\u0002", new Object[] { "b", "c", "d", "f", "g", "h", "i", "n", "j", amie.class, "k", "l", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
