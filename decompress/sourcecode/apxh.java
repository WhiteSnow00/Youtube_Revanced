import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxh extends agzi implements ahax
{
    public static final apxh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apxh.class, a = new apxh());
    }
    
    private apxh() {
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
                if ((b = apxh.b) == null) {
                    synchronized (apxh.class) {
                        if (apxh.b == null) {
                            apxh.b = (ahbe)new agzb((agzi)apxh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxh.a;
            }
            case 4: {
                return new agza((agzi)apxh.a);
            }
            case 3: {
                return new apxh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxh.a, "\u0001\u0000", null);
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
