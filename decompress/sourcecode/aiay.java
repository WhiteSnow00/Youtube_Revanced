import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiay extends agzi implements ahax
{
    public static final aiay a;
    private static volatile ahbe m;
    public int b;
    public ajsq c;
    public ajsq d;
    public agzy e;
    public agzy f;
    public aioe g;
    public anss h;
    public String i;
    public int j;
    public aorm k;
    public agyc l;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)aiay.class, (agzi)(a = new aiay()));
    }
    
    private aiay() {
        this.o = 2;
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.i = "";
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
                if ((m = aiay.m) == null) {
                    synchronized (aiay.class) {
                        if (aiay.m == null) {
                            aiay.m = (ahbe)new agzb((agzi)aiay.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aiay.a;
            }
            case 4: {
                return new agza((agzi)aiay.a);
            }
            case 3: {
                return new aiay();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiay.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u041b\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1008\u0004\b\u1409\b\t\u100a\u0007\n\u100c\u0005\u000b\u1409\u0006", new Object[] { "b", "c", "d", "e", ajsq.class, "f", aorm.class, "g", "h", "i", "n", "l", "j", ahzk.p, "k" });
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
