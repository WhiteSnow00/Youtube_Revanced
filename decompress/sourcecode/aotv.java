import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotv extends agzi implements ahax
{
    public static final aotv a;
    private static volatile ahbe f;
    public int b;
    public aott c;
    public aotu d;
    public amwg e;
    
    static {
        agzi.registerDefaultInstance(aotv.class, a = new aotv());
    }
    
    private aotv() {
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
                if ((f = aotv.f) == null) {
                    synchronized (aotv.class) {
                        if (aotv.f == null) {
                            aotv.f = (ahbe)new agzb((agzi)aotv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aotv.a;
            }
            case 4: {
                return new agza((agzi)aotv.a);
            }
            case 3: {
                return new aotv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
