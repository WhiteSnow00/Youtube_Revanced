import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahra extends agzi implements ahax
{
    public static final ahra a;
    private static volatile ahbe f;
    public String b;
    public agzy c;
    public boolean d;
    public boolean e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(ahra.class, a = new ahra());
    }
    
    private ahra() {
        this.b = "";
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahra.f) == null) {
                    synchronized (ahra.class) {
                        if (ahra.f == null) {
                            ahra.f = (ahbe)new agzb((agzi)ahra.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahra.a;
            }
            case 4: {
                return new agza((agzi)ahra.a);
            }
            case 3: {
                return new ahra();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahra.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a\u0004\u1007\u0002\u0005\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
