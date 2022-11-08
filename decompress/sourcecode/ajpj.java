import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpj extends agzi implements ahax
{
    public static final ajpj a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public agzy d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ajpj.class, (agzi)(a = new ajpj()));
    }
    
    private ajpj() {
        this.g = 2;
        this.d = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe e;
                if ((e = ajpj.e) == null) {
                    synchronized (ajpj.class) {
                        if (ajpj.e == null) {
                            ajpj.e = (ahbe)new agzb((agzi)ajpj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajpj.a;
            }
            case 4: {
                return new agza((agzi)ajpj.a);
            }
            case 3: {
                return new ajpj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", "d", ajpk.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
