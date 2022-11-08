import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibn extends agzi implements ahax
{
    public static final aibn a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public ajsq d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aibn.class, (agzi)(a = new aibn()));
    }
    
    private aibn() {
        this.g = 2;
        this.c = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe e;
                if ((e = aibn.e) == null) {
                    synchronized (aibn.class) {
                        if (aibn.e == null) {
                            aibn.e = (ahbe)new agzb((agzi)aibn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aibn.a;
            }
            case 4: {
                return new agza((agzi)aibn.a);
            }
            case 3: {
                return new aibn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibn.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u041b\u0002\u1409\u0000\u0004\u1409\u0002", new Object[] { "b", "c", aibm.class, "d", "f" });
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
