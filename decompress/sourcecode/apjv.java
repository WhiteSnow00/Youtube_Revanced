import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjv extends agzi implements ahax
{
    public static final apjv a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apjv.class, a = new apjv());
    }
    
    private apjv() {
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
                if ((b = apjv.b) == null) {
                    synchronized (apjv.class) {
                        if (apjv.b == null) {
                            apjv.b = (ahbe)new agzb((agzi)apjv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apjv.a;
            }
            case 4: {
                return new agza((agzi)apjv.a);
            }
            case 3: {
                return new apjv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjv.a, "\u0001\u0000", null);
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
