import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloz extends agzi implements ahax
{
    public static final aloz a;
    private static volatile ahbe n;
    public int b;
    public aorm c;
    public alpa d;
    public agzy e;
    public agzy f;
    public alow g;
    public alow h;
    public anss i;
    public String j;
    public aioe k;
    public aioe l;
    public anss m;
    private ajsq o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(aloz.class, a = new aloz());
    }
    
    private aloz() {
        this.p = 2;
        emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.j = "";
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
                final ahbe n;
                if ((n = aloz.n) == null) {
                    synchronized (aloz.class) {
                        if (aloz.n == null) {
                            aloz.n = (ahbe)new agzb((agzi)aloz.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return aloz.a;
            }
            case 4: {
                return new agza((agzi)aloz.a);
            }
            case 3: {
                return new aloz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aloz.a, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0002\u000b\u0001\u1409\u0000\u0003\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u041b\n\u1409\u0001\f\u1409\u0007\r\u1008\b\u000e\u1409\t\u000f\u1409\u000b\u0010\u1409\n\u0011\u1409\u0005", new Object[] { "b", "o", "d", "g", "e", aloy.class, "f", alox.class, "c", "i", "j", "k", "m", "l", "h" });
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
