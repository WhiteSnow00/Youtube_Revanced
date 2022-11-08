import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiby extends agzi implements ahax
{
    public static final aiby a;
    private static volatile ahbe b;
    private int c;
    private aiil d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aiby.class, (agzi)(a = new aiby()));
    }
    
    private aiby() {
        this.e = 2;
    }
    
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
                if ((b2 = aiby.b) == null) {
                    synchronized (aiby.class) {
                        if (aiby.b == null) {
                            aiby.b = (ahbe)new agzb((agzi)aiby.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiby.a;
            }
            case 4: {
                return new agza((agzi)aiby.a);
            }
            case 3: {
                return new aiby();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiby.a, "\u0001\u0001\u0000\u0001\ue964\u2872\ue964\u2872\u0001\u0000\u0000\u0001\ue964\u2872\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
