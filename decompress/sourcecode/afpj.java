import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpj extends agzi implements ahax
{
    public static final afpj a;
    private static volatile ahbe f;
    public int b;
    public afph c;
    public int d;
    public agzq e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(afpj.class, a = new afpj());
    }
    
    private afpj() {
        this.g = 2;
        this.e = agzi.emptyIntList();
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
                if ((f = afpj.f) == null) {
                    synchronized (afpj.class) {
                        if (afpj.f == null) {
                            afpj.f = (ahbe)new agzb((agzi)afpj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afpj.a;
            }
            case 4: {
                return new agza((agzi)afpj.a);
            }
            case 3: {
                return new afpj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003'", new Object[] { "b", "c", "d", "e" });
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
