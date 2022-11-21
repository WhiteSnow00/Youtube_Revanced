import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airh extends ahcz implements aheo
{
    public static final airh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(airh.class, a = new airh());
    }
    
    private airh() {
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = airh.b) == null) {
                    synchronized (airh.class) {
                        if (airh.b == null) {
                            airh.b = (ahev)new ahcs((ahcz)airh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return airh.a;
            }
            case 4: {
                return new ahcr((ahcz)airh.a);
            }
            case 3: {
                return new airh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airh.a, "\u0001\u0000", null);
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
