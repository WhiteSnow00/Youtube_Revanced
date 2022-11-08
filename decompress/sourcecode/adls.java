import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adls extends agzi implements ahax
{
    public static final adls a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public adlr d;
    
    static {
        agzi.registerDefaultInstance(adls.class, a = new adls());
    }
    
    private adls() {
        this.c = "";
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
                if ((e = adls.e) == null) {
                    synchronized (adls.class) {
                        if (adls.e == null) {
                            adls.e = (ahbe)new agzb((agzi)adls.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return adls.a;
            }
            case 4: {
                return new agza((agzi)adls.a);
            }
            case 3: {
                return new adls();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adls.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
