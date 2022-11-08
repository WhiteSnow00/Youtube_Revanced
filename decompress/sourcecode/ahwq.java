import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwq extends agzi implements ahax
{
    public static final ahwq a;
    private static volatile ahbe c;
    public ahas b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(ahwq.class, a = new ahwq());
    }
    
    private ahwq() {
        this.b = ahas.a;
        this.d = 2;
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
                final ahbe c;
                if ((c = ahwq.c) == null) {
                    synchronized (ahwq.class) {
                        if (ahwq.c == null) {
                            ahwq.c = (ahbe)new agzb((agzi)ahwq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahwq.a;
            }
            case 4: {
                return new agza((agzi)ahwq.a);
            }
            case 3: {
                return new ahwq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0432", new Object[] { "b", ahwp.a });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
