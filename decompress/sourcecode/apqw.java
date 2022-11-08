import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqw extends agzi implements ahax
{
    public static final apqw a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apqw.class, (agzi)(a = new apqw()));
    }
    
    private apqw() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apqw.b) == null) {
                    synchronized (apqw.class) {
                        if (apqw.b == null) {
                            apqw.b = (ahbe)new agzb((agzi)apqw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqw.a;
            }
            case 4: {
                return new agza((agzi)apqw.a);
            }
            case 3: {
                return new apqw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqw.a, "\u0001\u0000", (Object[])null);
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
