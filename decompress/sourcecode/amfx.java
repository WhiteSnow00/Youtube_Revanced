import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfx extends agzi implements ahax
{
    public static final amfx a;
    private static volatile ahbe m;
    public int b;
    public int c;
    public aorm d;
    public agzy e;
    public agzy f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public akbf j;
    public aioe k;
    public agyc l;
    private anss n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)amfx.class, (agzi)(a = new amfx()));
    }
    
    private amfx() {
        this.p = 2;
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.l = agyc.b;
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
                if ((m = amfx.m) == null) {
                    synchronized (amfx.class) {
                        if (amfx.m == null) {
                            amfx.m = (ahbe)new agzb((agzi)amfx.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amfx.a;
            }
            case 4: {
                return new agza((agzi)amfx.a);
            }
            case 3: {
                return new amfx();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfx.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\n\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\b\t\u100a\t\n\u041b\u000b\u041b\f\u1409\u0006", new Object[] { "b", "c", amcq.o, "d", "g", "h", "i", "j", "k", "o", "l", "e", aora.class, "f", ahyg.class, "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
