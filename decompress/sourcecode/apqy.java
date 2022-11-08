import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqy extends agzi implements ahax
{
    public static final apqy a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apqy.class, (agzi)(a = new apqy()));
    }
    
    private apqy() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apqy.b) == null) {
                    synchronized (apqy.class) {
                        if (apqy.b == null) {
                            apqy.b = (ahbe)new agzb((agzi)apqy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqy.a;
            }
            case 4: {
                return new agza((agzi)apqy.a);
            }
            case 3: {
                return new apqy();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqy.a, "\u0001\u0000", (Object[])null);
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
