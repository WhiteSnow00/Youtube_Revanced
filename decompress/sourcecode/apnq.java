import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnq extends agzi implements ahax
{
    private static final apnq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apnq.class, (agzi)(a = new apnq()));
    }
    
    private apnq() {
    }
    
    public static /* synthetic */ apnq a() {
        return apnq.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnq.b) == null) {
                    synchronized (apnq.class) {
                        if (apnq.b == null) {
                            apnq.b = (ahbe)new agzb((agzi)apnq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnq.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new apnq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnq.a, "\u0001\u0000", (Object[])null);
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
