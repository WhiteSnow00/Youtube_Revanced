import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxg extends agzi implements ahax
{
    public static final apxg a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apxg.class, a = new apxg());
    }
    
    private apxg() {
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
                if ((b = apxg.b) == null) {
                    synchronized (apxg.class) {
                        if (apxg.b == null) {
                            apxg.b = (ahbe)new agzb((agzi)apxg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxg.a;
            }
            case 4: {
                return new agza((agzi)apxg.a);
            }
            case 3: {
                return new apxg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxg.a, "\u0001\u0000", null);
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