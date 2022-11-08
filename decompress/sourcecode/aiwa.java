import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwa extends agzi implements ahax
{
    public static final aiwa a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public boolean d;
    public aicr e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aiwa.class, a = new aiwa());
    }
    
    private aiwa() {
        this.g = 2;
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
                final ahbe f;
                if ((f = aiwa.f) == null) {
                    synchronized (aiwa.class) {
                        if (aiwa.f == null) {
                            aiwa.f = (ahbe)new agzb((agzi)aiwa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiwa.a;
            }
            case 4: {
                return new agza((agzi)aiwa.a);
            }
            case 3: {
                return new aiwa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwa.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1007\u0001\u0004\u1409\u0003", new Object[] { "b", "c", ajba.a(), "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
