import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxm extends agzi implements ahax
{
    public static final apxm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apxm.class, a = new apxm());
    }
    
    private apxm() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apxm.b) == null) {
                    synchronized (apxm.class) {
                        if (apxm.b == null) {
                            apxm.b = (ahbe)new agzb((agzi)apxm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxm.a;
            }
            case 4: {
                return new agza((agzi)apxm.a);
            }
            case 3: {
                return new apxm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxm.a, "\u0001\u0000", null);
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
