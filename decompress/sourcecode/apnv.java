import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnv extends agzi implements ahax
{
    public static final apnv a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apnv.class, (agzi)(a = new apnv()));
    }
    
    private apnv() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnv.b) == null) {
                    synchronized (apnv.class) {
                        if (apnv.b == null) {
                            apnv.b = (ahbe)new agzb((agzi)apnv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnv.a;
            }
            case 4: {
                return new agza((agzi)apnv.a);
            }
            case 3: {
                return new apnv();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnv.a, "\u0001\u0000", (Object[])null);
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
