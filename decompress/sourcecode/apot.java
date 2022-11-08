import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apot extends agzd implements agze
{
    public static final apot a;
    private static volatile ahbe i;
    public int b;
    public appc c;
    public apoz d;
    public agzy e;
    public int f;
    public ajsq g;
    public ajkm h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)apot.class, (agzi)(a = new apot()));
    }
    
    private apot() {
        this.k = 2;
        this.e = emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((i = apot.i) == null) {
                    synchronized (apot.class) {
                        if (apot.i == null) {
                            apot.i = (ahbe)new agzb((agzi)apot.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apot.a;
            }
            case 4: {
                return new agzc(apot.a);
            }
            case 3: {
                return new apot();
            }
            case 2: {
                return newMessageInfo((MessageLite)apot.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1004\u0002\u0005\u1409\u0003\b\u1409\u0005\u000b\u1009\u0004", new Object[] { "b", "c", "d", "e", appq.class, "f", "g", "j", "h" });
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
