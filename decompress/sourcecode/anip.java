import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anip extends agzd implements agze
{
    private static volatile ahbe C;
    public static final anip a;
    public anss A;
    public ajco B;
    private ahfw D;
    private aioe E;
    private anss F;
    private byte G;
    public int b;
    public String c;
    public aorm d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public aioe j;
    public ahyq k;
    public ahyq m;
    public ahyq n;
    public aibc o;
    public String p;
    public amer q;
    public anio r;
    public agyc s;
    public aorm t;
    public ajsq u;
    public boolean v;
    public agzy w;
    public apdo x;
    public anin y;
    public agzy z;
    
    static {
        agzi.registerDefaultInstance(anip.class, (agzi)(a = new anip()));
    }
    
    private anip() {
        this.G = 2;
        this.c = "";
        emptyProtobufList();
        emptyProtobufList();
        this.p = "";
        emptyProtobufList();
        this.s = agyc.b;
        this.w = emptyProtobufList();
        this.z = emptyProtobufList();
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
                final ahbe c;
                if ((c = anip.C) == null) {
                    synchronized (anip.class) {
                        if (anip.C == null) {
                            anip.C = (ahbe)new agzb((agzi)anip.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anip.a;
            }
            case 4: {
                return new agzc((agzd)anip.a);
            }
            case 3: {
                return new anip();
            }
            case 2: {
                return newMessageInfo((MessageLite)anip.a, "\u0001\u001c\u0000\u0001\u0001%\u001c\u0000\u0002\u0016\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\n\u1008\r\u000f\u1409\u0012\u0010\u1409\u0014\u0011\u100a\u0015\u0013\u1409\u0011\u0014\u1409\u0016\u0015\u1409\u0017\u0016\u1007\u0019\u0017\u1409\u0018\u0018\u1409\n\u0019\u041b\u001a\u1409\u000b\u001b\u1409\t\u001c\u1409\u001a\u001d\u1009\u001b\u001f\u041b \u1409\f!\u1409\u001d\"\u1009\u001e#\u1409\u001f%\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", "p", "r", "D", "s", "q", "t", "E", "v", "u", "m", "w", aora.class, "n", "k", "x", "y", "z", aniq.class, "o", "A", "B", "F", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.G = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.G;
            }
        }
    }
}
