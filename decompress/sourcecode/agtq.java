import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtq extends agzi implements ahax
{
    public static final agtq a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public String e;
    public agtp f;
    
    static {
        agzi.registerDefaultInstance(agtq.class, a = new agtq());
    }
    
    private agtq() {
        this.c = 0;
        this.e = "";
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
                if ((g = agtq.g) == null) {
                    synchronized (agtq.class) {
                        if (agtq.g == null) {
                            agtq.g = (ahbe)new agzb((agzi)agtq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agtq.a;
            }
            case 4: {
                return new agza((agzi)agtq.a);
            }
            case 3: {
                return new agtq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtq.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1037\u0000\u0003\u1009\u0003\u0004\u103b\u0000", new Object[] { "d", "c", "b", "e", "f" });
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
