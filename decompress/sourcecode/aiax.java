import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiax extends agzi implements ahax
{
    public static final aiax a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aiax.class, (agzi)(a = new aiax()));
    }
    
    private aiax() {
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
                if ((b = aiax.b) == null) {
                    synchronized (aiax.class) {
                        if (aiax.b == null) {
                            aiax.b = (ahbe)new agzb((agzi)aiax.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiax.a;
            }
            case 4: {
                return new agza((agzi)aiax.a);
            }
            case 3: {
                return new aiax();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiax.a, "\u0001\u0000", (Object[])null);
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
