import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwr extends agzi implements ahax
{
    public static final aiwr a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private aioe g;
    private aioe h;
    private aiwq i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aiwr.class, a = new aiwr());
    }
    
    private aiwr() {
        this.k = 2;
        final agyc b = agyc.b;
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
                if ((b2 = aiwr.b) == null) {
                    synchronized (aiwr.class) {
                        if (aiwr.b == null) {
                            aiwr.b = (ahbe)new agzb((agzi)aiwr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwr.a;
            }
            case 4: {
                return new agza((agzi)aiwr.a);
            }
            case 3: {
                return new aiwr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwr.a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001\u1409\u0003\u0005\u1409\t\u0006\u1409\u0004\b\u1409\u0005\t\u1409\u0007\f\u1409\u0001\r\u1409\u0002", new Object[] { "c", "f", "j", "g", "h", "i", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
