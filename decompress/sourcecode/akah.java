import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akah extends agzd implements agze
{
    public static final akah a;
    private static volatile ahbe h;
    public int b;
    public agzy c;
    public int d;
    public int e;
    public ajsq f;
    public agyc g;
    private aioe i;
    private ahiq j;
    private anss k;
    private anss m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)akah.class, (agzi)(a = new akah()));
    }
    
    private akah() {
        this.o = 2;
        this.c = emptyProtobufList();
        emptyProtobufList();
        this.g = agyc.b;
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
                final ahbe h;
                if ((h = akah.h) == null) {
                    synchronized (akah.class) {
                        if (akah.h == null) {
                            akah.h = (ahbe)new agzb((agzi)akah.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akah.a;
            }
            case 4: {
                return new agzc(akah.a);
            }
            case 3: {
                return new akah();
            }
            case 2: {
                return newMessageInfo((MessageLite)akah.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0007\u0001\u041b\u0002\u1409\t\u0003\u1409\u0002\u0004\u100a\n\u0006\u1004\u0000\u0007\u1004\u0001\b\u1409\u0003\u000b\u1409\u0006\f\u1409\u0007\r\u1409\u0005", new Object[] { "b", "c", akai.class, "n", "f", "g", "d", "e", "i", "k", "m", "j" });
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
