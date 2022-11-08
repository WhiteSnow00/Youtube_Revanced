import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albe extends agzi implements ahax
{
    public static final albe a;
    private static volatile ahbe f;
    public akjf b;
    public agzy c;
    public String d;
    public agyc e;
    private int g;
    private anss h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)albe.class, (agzi)(a = new albe()));
    }
    
    private albe() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = "";
        this.e = agyc.b;
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
                if ((f = albe.f) == null) {
                    synchronized (albe.class) {
                        if (albe.f == null) {
                            albe.f = (ahbe)new agzb((agzi)albe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return albe.a;
            }
            case 4: {
                return new agza((agzi)albe.a);
            }
            case 3: {
                return new albe();
            }
            case 2: {
                return newMessageInfo((MessageLite)albe.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0004\u0004\u100a\u0005\u0005\u1008\u0001\u0006\u1409\u0002", new Object[] { "g", "b", "c", anss.class, "i", "e", "d", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
