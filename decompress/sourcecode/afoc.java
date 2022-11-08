import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afoc extends agzi implements ahax
{
    public static final afoc a;
    private static volatile ahbe f;
    public int b;
    public Object c;
    public int d;
    public Object e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(afoc.class, a = new afoc());
    }
    
    private afoc() {
        this.b = 0;
        this.d = 0;
        this.g = 2;
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
                final ahbe f;
                if ((f = afoc.f) == null) {
                    synchronized (afoc.class) {
                        if (afoc.f == null) {
                            afoc.f = (ahbe)new agzb((agzi)afoc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afoc.a;
            }
            case 4: {
                return new agza((agzi)afoc.a);
            }
            case 3: {
                return new afoc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afoc.a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u143c\u0001\u0003\u143c\u0000\u0004\u103b\u0000\u0005\u103b\u0001", new Object[] { "c", "b", "e", "d", afpe.class, afpc.class, afpd.class });
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
