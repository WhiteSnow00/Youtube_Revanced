import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqe extends agzi implements ahax
{
    public static final apqe a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)apqe.class, (agzi)(a = new apqe()));
    }
    
    private apqe() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apqe.e) == null) {
                    synchronized (apqe.class) {
                        if (apqe.e == null) {
                            apqe.e = (ahbe)new agzb((agzi)apqe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apqe.a;
            }
            case 4: {
                return new agza((agzi)apqe.a);
            }
            case 3: {
                return new apqe();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqe.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aply.a() });
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
