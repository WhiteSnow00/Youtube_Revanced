import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicv extends agzi implements ahax
{
    public static final aicv a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aicv.class, (agzi)(a = new aicv()));
    }
    
    private aicv() {
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
                if ((b = aicv.b) == null) {
                    synchronized (aicv.class) {
                        if (aicv.b == null) {
                            aicv.b = (ahbe)new agzb((agzi)aicv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicv.a;
            }
            case 4: {
                return new agza((agzi)aicv.a);
            }
            case 3: {
                return new aicv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicv.a, "\u0001\u0000", (Object[])null);
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
