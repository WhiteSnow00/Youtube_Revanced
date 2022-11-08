import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnw extends agzi implements ahax
{
    public static final apnw a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apnw.class, (agzi)(a = new apnw()));
    }
    
    private apnw() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnw.b) == null) {
                    synchronized (apnw.class) {
                        if (apnw.b == null) {
                            apnw.b = (ahbe)new agzb((agzi)apnw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnw.a;
            }
            case 4: {
                return new agza((agzi)apnw.a);
            }
            case 3: {
                return new apnw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnw.a, "\u0001\u0000", (Object[])null);
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
