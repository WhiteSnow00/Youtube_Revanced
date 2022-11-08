import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqq extends agzi implements ahax
{
    public static final apqq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apqq.class, (agzi)(a = new apqq()));
    }
    
    private apqq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apqq.b) == null) {
                    synchronized (apqq.class) {
                        if (apqq.b == null) {
                            apqq.b = (ahbe)new agzb((agzi)apqq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqq.a;
            }
            case 4: {
                return new agza((agzi)apqq.a);
            }
            case 3: {
                return new apqq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqq.a, "\u0001\u0000", (Object[])null);
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
