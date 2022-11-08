import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnr extends agzi implements ahax
{
    private static final apnr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apnr.class, (agzi)(a = new apnr()));
    }
    
    private apnr() {
    }
    
    public static /* synthetic */ apnr a() {
        return apnr.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnr.b) == null) {
                    synchronized (apnr.class) {
                        if (apnr.b == null) {
                            apnr.b = (ahbe)new agzb((agzi)apnr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnr.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new apnr();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnr.a, "\u0001\u0000", (Object[])null);
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
