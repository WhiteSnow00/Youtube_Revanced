import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albm extends agzi implements ahax
{
    public static final albm a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public aioe d;
    public agzy e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)albm.class, (agzi)(a = new albm()));
    }
    
    private albm() {
        this.g = 2;
        this.e = emptyProtobufList();
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
                if ((f = albm.f) == null) {
                    synchronized (albm.class) {
                        if (albm.f == null) {
                            albm.f = (ahbe)new agzb((agzi)albm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return albm.a;
            }
            case 4: {
                return new agza((agzi)albm.a);
            }
            case 3: {
                return new albm();
            }
            case 2: {
                return newMessageInfo((MessageLite)albm.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u001b", new Object[] { "b", "c", "d", "e", albk.class });
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
