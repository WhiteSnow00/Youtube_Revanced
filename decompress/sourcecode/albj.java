import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albj extends agzi implements ahax
{
    public static final albj a;
    private static volatile ahbe d;
    public akjf b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)albj.class, (agzi)(a = new albj()));
    }
    
    private albj() {
        this.f = 2;
        this.c = emptyProtobufList();
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
                final ahbe d;
                if ((d = albj.d) == null) {
                    synchronized (albj.class) {
                        if (albj.d == null) {
                            albj.d = (ahbe)new agzb((agzi)albj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albj.a;
            }
            case 4: {
                return new agza((agzi)albj.a);
            }
            case 3: {
                return new albj();
            }
            case 2: {
                return newMessageInfo((MessageLite)albj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", albh.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
