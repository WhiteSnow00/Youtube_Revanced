import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appo extends agzi implements ahax
{
    public static final appo a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public int d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)appo.class, (agzi)(a = new appo()));
    }
    
    private appo() {
        this.g = 2;
        this.c = emptyProtobufList();
        emptyProtobufList();
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
                if ((e = appo.e) == null) {
                    synchronized (appo.class) {
                        if (appo.e == null) {
                            appo.e = (ahbe)new agzb((agzi)appo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return appo.a;
            }
            case 4: {
                return new agza((agzi)appo.a);
            }
            case 3: {
                return new appo();
            }
            case 2: {
                return newMessageInfo((MessageLite)appo.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0001\u0005\u1004\u0000", new Object[] { "b", "c", appg.class, "f", "d" });
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
