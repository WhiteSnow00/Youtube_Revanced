import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoy extends agzi implements ahax
{
    public static final akoy a;
    private static volatile ahbe l;
    public int b;
    public akjf c;
    public aoci d;
    public aioe e;
    public agzy f;
    public ajsj g;
    public ajsj h;
    public String i;
    public long j;
    public aoch k;
    private ahfw m;
    private anss n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(akoy.class, a = new akoy());
    }
    
    private akoy() {
        this.o = 2;
        final agyc b = agyc.b;
        this.f = agzi.emptyProtobufList();
        emptyProtobufList();
        this.i = "";
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
                final ahbe l;
                if ((l = akoy.l) == null) {
                    synchronized (akoy.class) {
                        if (akoy.l == null) {
                            akoy.l = (ahbe)new agzb((agzi)akoy.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return akoy.a;
            }
            case 4: {
                return new agza((agzi)akoy.a);
            }
            case 3: {
                return new akoy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoy.a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u041b\t\u1409\u0006\n\u1409\u0007\u000b\u1008\b\r\u1002\n\u000e\u1009\u000b", new Object[] { "b", "c", "d", "m", "n", "e", "f", aocg.class, "g", "h", "i", "j", "k" });
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
