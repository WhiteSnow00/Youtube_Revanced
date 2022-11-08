import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlv extends agzi implements ahax
{
    public static final jlv a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public ahca d;
    
    static {
        agzi.registerDefaultInstance((Class)jlv.class, (agzi)(a = new jlv()));
    }
    
    private jlv() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = jlv.e) == null) {
                    synchronized (jlv.class) {
                        if (jlv.e == null) {
                            jlv.e = (ahbe)new agzb((agzi)jlv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return jlv.a;
            }
            case 4: {
                return new agza((agzi)jlv.a);
            }
            case 3: {
                return new jlv();
            }
            case 2: {
                return newMessageInfo((MessageLite)jlv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
