import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajtl extends agzd implements agze
{
    public static final ajtl a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)ajtl.class, (agzi)(a = new ajtl()));
    }
    
    private ajtl() {
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
                if ((b = ajtl.b) == null) {
                    synchronized (ajtl.class) {
                        if (ajtl.b == null) {
                            ajtl.b = (ahbe)new agzb((agzi)ajtl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajtl.a;
            }
            case 4: {
                return new agzc(ajtl.a);
            }
            case 3: {
                return new ajtl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajtl.a, "\u0001\u0000", (Object[])null);
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
