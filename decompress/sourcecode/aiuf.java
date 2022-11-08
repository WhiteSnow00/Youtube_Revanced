import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuf extends agzi implements ahax
{
    public static final aiuf a;
    private static volatile ahbe b;
    private int c;
    private alio d;
    private alin e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aiuf.class, a = new aiuf());
    }
    
    private aiuf() {
        this.f = 2;
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
                if ((b2 = aiuf.b) == null) {
                    synchronized (aiuf.class) {
                        if (aiuf.b == null) {
                            aiuf.b = (ahbe)new agzb((agzi)aiuf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiuf.a;
            }
            case 4: {
                return new agza((agzi)aiuf.a);
            }
            case 3: {
                return new aiuf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuf.a, "\u0001\u0002\u0000\u0001\ufd1c\u209f\uf421\u2202\u0002\u0000\u0000\u0002\ufd1c\u209f\u1409\u0000\uf421\u2202\u1409\u0001", new Object[] { "c", "d", "e" });
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
