import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apri extends agzi implements ahax
{
    public static final apri a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apri.class, (agzi)(a = new apri()));
    }
    
    private apri() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apri.b) == null) {
                    synchronized (apri.class) {
                        if (apri.b == null) {
                            apri.b = (ahbe)new agzb((agzi)apri.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apri.a;
            }
            case 4: {
                return new agza((agzi)apri.a);
            }
            case 3: {
                return new apri();
            }
            case 2: {
                return newMessageInfo((MessageLite)apri.a, "\u0001\u0000", (Object[])null);
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
