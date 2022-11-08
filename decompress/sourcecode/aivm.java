import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivm extends agzi implements ahax
{
    public static final aivm a;
    private static volatile ahbe b;
    private int c;
    private aivo d;
    private aivo e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aivm.class, a = new aivm());
    }
    
    private aivm() {
        this.i = 2;
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
                if ((b2 = aivm.b) == null) {
                    synchronized (aivm.class) {
                        if (aivm.b == null) {
                            aivm.b = (ahbe)new agzb((agzi)aivm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivm.a;
            }
            case 4: {
                return new agza((agzi)aivm.a);
            }
            case 3: {
                return new aivm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivm.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
