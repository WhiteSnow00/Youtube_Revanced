import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitb extends agzi implements ahax
{
    public static final aitb a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(aitb.class, a = new aitb());
    }
    
    private aitb() {
        this.c = 2;
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
                if ((b = aitb.b) == null) {
                    synchronized (aitb.class) {
                        if (aitb.b == null) {
                            aitb.b = (ahbe)new agzb((agzi)aitb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aitb.a;
            }
            case 4: {
                return new agza((agzi)aitb.a);
            }
            case 3: {
                return new aitb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitb.a, "\u0001\u0000", null);
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
