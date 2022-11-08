import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlq extends agzi implements ahax
{
    public static final adlq a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(adlq.class, a = new adlq());
    }
    
    private adlq() {
        this.c = "";
        this.d = agyc.b;
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
                if ((e = adlq.e) == null) {
                    synchronized (adlq.class) {
                        if (adlq.e == null) {
                            adlq.e = (ahbe)new agzb((agzi)adlq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return adlq.a;
            }
            case 4: {
                return new agza((agzi)adlq.a);
            }
            case 3: {
                return new adlq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adlq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
