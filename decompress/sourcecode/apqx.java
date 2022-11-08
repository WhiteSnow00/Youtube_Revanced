import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqx extends agzi implements ahax
{
    public static final apqx a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public aprk d;
    
    static {
        agzi.registerDefaultInstance((Class)apqx.class, (agzi)(a = new apqx()));
    }
    
    private apqx() {
        this.c = 1.0f;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apqx.e) == null) {
                    synchronized (apqx.class) {
                        if (apqx.e == null) {
                            apqx.e = (ahbe)new agzb((agzi)apqx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apqx.a;
            }
            case 4: {
                return new agza((agzi)apqx.a);
            }
            case 3: {
                return new apqx();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqx.a, "\u0001\u0002\u0000\u0001\u0003\b\u0002\u0000\u0000\u0000\u0003\u1001\u0001\b\u1009\u0002", new Object[] { "b", "c", "d" });
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
