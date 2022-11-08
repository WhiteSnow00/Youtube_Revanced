import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpy extends agzi implements ahax
{
    public static final afpy a;
    private static volatile ahbe k;
    public int b;
    public agzy c;
    public agzt d;
    public agzt e;
    public agzt f;
    public agzt g;
    public long h;
    public long i;
    public int j;
    
    static {
        agzi.registerDefaultInstance(afpy.class, a = new afpy());
    }
    
    private afpy() {
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyLongList();
        this.e = agzi.emptyLongList();
        this.f = agzi.emptyLongList();
        this.g = agzi.emptyLongList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = afpy.k) == null) {
                    synchronized (afpy.class) {
                        if (afpy.k == null) {
                            afpy.k = (ahbe)new agzb((agzi)afpy.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return afpy.a;
            }
            case 4: {
                return new agza((agzi)afpy.a);
            }
            case 3: {
                return new afpy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpy.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004\u1003\u0000\u0005\u1003\u0001\u0006\u1004\u0002\u0007&\b&", new Object[] { "b", "c", afpm.class, "d", "f", "h", "i", "j", "e", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
