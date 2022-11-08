import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apre extends agzi implements ahax
{
    public static final apre a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apre.class, (agzi)(a = new apre()));
    }
    
    private apre() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apre.b) == null) {
                    synchronized (apre.class) {
                        if (apre.b == null) {
                            apre.b = (ahbe)new agzb((agzi)apre.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apre.a;
            }
            case 4: {
                return new agza((agzi)apre.a);
            }
            case 3: {
                return new apre();
            }
            case 2: {
                return newMessageInfo((MessageLite)apre.a, "\u0001\u0000", (Object[])null);
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
