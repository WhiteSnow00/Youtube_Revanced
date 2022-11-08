import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtv extends agzi implements ahax
{
    public static final ahtv a;
    private static volatile ahbe d;
    public String b;
    public ahty c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahtv.class, a = new ahtv());
    }
    
    private ahtv() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahtv.d) == null) {
                    synchronized (ahtv.class) {
                        if (ahtv.d == null) {
                            ahtv.d = (ahbe)new agzb((agzi)ahtv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahtv.a;
            }
            case 4: {
                return new agza((agzi)ahtv.a);
            }
            case 3: {
                return new ahtv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
