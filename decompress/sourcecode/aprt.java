import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprt extends agzi implements ahax
{
    public static final aprt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprt.class, (agzi)(a = new aprt()));
    }
    
    private aprt() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprt.b) == null) {
                    synchronized (aprt.class) {
                        if (aprt.b == null) {
                            aprt.b = (ahbe)new agzb((agzi)aprt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprt.a;
            }
            case 4: {
                return new agza((agzi)aprt.a);
            }
            case 3: {
                return new aprt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprt.a, "\u0001\u0000", (Object[])null);
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
