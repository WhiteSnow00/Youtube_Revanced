import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtx extends agzi implements ahax
{
    public static final agtx a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public agtb d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(agtx.class, a = new agtx());
    }
    
    private agtx() {
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
                final ahbe f;
                if ((f = agtx.f) == null) {
                    synchronized (agtx.class) {
                        if (agtx.f == null) {
                            agtx.f = (ahbe)new agzb((agzi)agtx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agtx.a;
            }
            case 4: {
                return new agza((agzi)agtx.a);
            }
            case 3: {
                return new agtx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtx.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0005\u1008\u0003", new Object[] { "b", "c", afon.n, "d", "e" });
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
