import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprl extends agzi implements ahax
{
    public static final aprl a;
    private static volatile ahbe d;
    public int b;
    public apqx c;
    
    static {
        agzi.registerDefaultInstance((Class)aprl.class, (agzi)(a = new aprl()));
    }
    
    private aprl() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aprl.d) == null) {
                    synchronized (aprl.class) {
                        if (aprl.d == null) {
                            aprl.d = (ahbe)new agzb((agzi)aprl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprl.a;
            }
            case 4: {
                return new agza((agzi)aprl.a);
            }
            case 3: {
                return new aprl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprl.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[] { "b", "c" });
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
