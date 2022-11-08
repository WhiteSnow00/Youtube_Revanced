import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afow extends agzi implements ahax
{
    public static final afow a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(afow.class, a = new afow());
    }
    
    private afow() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = afow.e) == null) {
                    synchronized (afow.class) {
                        if (afow.e == null) {
                            afow.e = (ahbe)new agzb((agzi)afow.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afow.a;
            }
            case 4: {
                return new agza((agzi)afow.a);
            }
            case 3: {
                return new afow();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afow.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
