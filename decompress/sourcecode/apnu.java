import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnu extends agzi implements ahax
{
    public static final apnu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apnu.class, (agzi)(a = new apnu()));
    }
    
    private apnu() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnu.b) == null) {
                    synchronized (apnu.class) {
                        if (apnu.b == null) {
                            apnu.b = (ahbe)new agzb((agzi)apnu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnu.a;
            }
            case 4: {
                return new agza((agzi)apnu.a);
            }
            case 3: {
                return new apnu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnu.a, "\u0001\u0000", (Object[])null);
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
