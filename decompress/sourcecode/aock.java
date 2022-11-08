import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aock extends agzi implements ahax
{
    public static final aock a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public aoch e;
    public aocj f;
    
    static {
        agzi.registerDefaultInstance(aock.class, a = new aock());
    }
    
    private aock() {
        this.c = "";
        this.d = "";
        emptyProtobufList();
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
                if ((g = aock.g) == null) {
                    synchronized (aock.class) {
                        if (aock.g == null) {
                            aock.g = (ahbe)new agzb((agzi)aock.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aock.a;
            }
            case 4: {
                return new agza((agzi)aock.a);
            }
            case 3: {
                return new aock();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aock.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
