import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlr extends agzi implements ahax
{
    public static final adlr a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(adlr.class, a = new adlr());
    }
    
    private adlr() {
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
                final ahbe d;
                if ((d = adlr.d) == null) {
                    synchronized (adlr.class) {
                        if (adlr.d == null) {
                            adlr.d = (ahbe)new agzb((agzi)adlr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return adlr.a;
            }
            case 4: {
                return new agza((agzi)adlr.a);
            }
            case 3: {
                return new adlr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adlr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "b", "c" });
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
