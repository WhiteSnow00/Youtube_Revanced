import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiao extends agzi implements ahax
{
    public static final aiao a;
    private static volatile ahbe e;
    public int b;
    public Object c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance((Class)aiao.class, (agzi)(a = new aiao()));
    }
    
    private aiao() {
        this.b = 0;
        this.d = agzi.emptyProtobufList();
        agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aiao.e) == null) {
                    synchronized (aiao.class) {
                        if (aiao.e == null) {
                            aiao.e = (ahbe)new agzb((agzi)aiao.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiao.a;
            }
            case 4: {
                return new agza((agzi)aiao.a);
            }
            case 3: {
                return new aiao();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiao.a, "\u0001\u0004\u0001\u0000\u0001\ufbdb\ud283\u0004\u0000\u0001\u0000\u0001\u001a\uf646\u9cb5\u103c\u0000\ueacc\ubbb8\u103c\u0000\ufbdb\ud283\u103c\u0000", new Object[] { "c", "b", "d", aptq.class, aopt.class, anpe.class });
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
