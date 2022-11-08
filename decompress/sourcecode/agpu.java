import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpu extends agzi implements ahax
{
    public static final agpu a;
    private static volatile ahbe b;
    private int c;
    private String d;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(agpu.class, a = new agpu());
    }
    
    private agpu() {
        this.f = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = agpu.b) == null) {
                    synchronized (agpu.class) {
                        if (agpu.b == null) {
                            agpu.b = (ahbe)new agzb((agzi)agpu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return agpu.a;
            }
            case 4: {
                return new agza((agzi)agpu.a);
            }
            case 3: {
                return new agpu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1504\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
