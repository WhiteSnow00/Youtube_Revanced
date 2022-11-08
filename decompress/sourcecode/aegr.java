import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegr extends agzi implements ahax
{
    public static final aegr a;
    private static volatile ahbe k;
    public int b;
    public int c;
    public int d;
    public int e;
    public agzy f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    
    static {
        agzi.registerDefaultInstance(aegr.class, a = new aegr());
    }
    
    private aegr() {
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
                final ahbe k;
                if ((k = aegr.k) == null) {
                    synchronized (aegr.class) {
                        if (aegr.k == null) {
                            aegr.k = (ahbe)new agzb((agzi)aegr.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aegr.a;
            }
            case 4: {
                return new agza((agzi)aegr.a);
            }
            case 3: {
                return new aegr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aegr.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u001a\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1007\u0005\b\u1004\u0006", new Object[] { "b", "c", "d", "e", aeih.b, "f", "g", "h", "i", "j" });
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
