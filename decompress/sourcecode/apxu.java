import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxu extends agzd implements agze
{
    public static final apxu a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(apxu.class, (agzi)(a = new apxu()));
    }
    
    private apxu() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apxu.b) == null) {
                    synchronized (apxu.class) {
                        if (apxu.b == null) {
                            apxu.b = (ahbe)new agzb((agzi)apxu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxu.a;
            }
            case 4: {
                return new agzc((agzd)apxu.a);
            }
            case 3: {
                return new apxu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apxu.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
