import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyk extends agzi implements ahax
{
    public static final akyk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyk.class, (agzi)(a = new akyk()));
    }
    
    private akyk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyk.b) == null) {
                    synchronized (akyk.class) {
                        if (akyk.b == null) {
                            akyk.b = (ahbe)new agzb((agzi)akyk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyk.a;
            }
            case 4: {
                return new agza((agzi)akyk.a);
            }
            case 3: {
                return new akyk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyk.a, "\u0001\u0000", (Object[])null);
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
