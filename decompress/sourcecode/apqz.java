import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqz extends agzi implements ahax
{
    public static final apqz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apqz.class, (agzi)(a = new apqz()));
    }
    
    private apqz() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apqz.b) == null) {
                    synchronized (apqz.class) {
                        if (apqz.b == null) {
                            apqz.b = (ahbe)new agzb((agzi)apqz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqz.a;
            }
            case 4: {
                return new agza((agzi)apqz.a);
            }
            case 3: {
                return new apqz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqz.a, "\u0001\u0000", (Object[])null);
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
