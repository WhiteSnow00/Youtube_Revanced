import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqu extends agzi implements ahax
{
    public static final alqu a;
    private static volatile ahbe g;
    public int b;
    public alqy c;
    public int d;
    public int e;
    public agzy f;
    
    static {
        agzi.registerDefaultInstance(alqu.class, a = new alqu());
    }
    
    private alqu() {
        this.f = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = alqu.g) == null) {
                    synchronized (alqu.class) {
                        if (alqu.g == null) {
                            alqu.g = (ahbe)new agzb((agzi)alqu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alqu.a;
            }
            case 4: {
                return new alqs();
            }
            case 3: {
                return new alqu();
            }
            case 2: {
                final agzo r = alll.r;
                return agzi.newMessageInfo((MessageLite)alqu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u001b", new Object[] { "b", "c", "d", r, "e", r, "f", alqt.class });
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
