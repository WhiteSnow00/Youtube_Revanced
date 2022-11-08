import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaj extends agzi implements ahax
{
    public static final aiaj a;
    private static volatile ahbe f;
    public anss b;
    public anss c;
    public anss d;
    public anss e;
    private int g;
    private aioe h;
    private ajsq i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aiaj.class, (agzi)(a = new aiaj()));
    }
    
    private aiaj() {
        this.j = 2;
        emptyProtobufList();
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
                final ahbe f;
                if ((f = aiaj.f) == null) {
                    synchronized (aiaj.class) {
                        if (aiaj.f == null) {
                            aiaj.f = (ahbe)new agzb((agzi)aiaj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiaj.a;
            }
            case 4: {
                return new agza((agzi)aiaj.a);
            }
            case 3: {
                return new aiaj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiaj.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "g", "h", "b", "c", "d", "e", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
