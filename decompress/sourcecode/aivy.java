import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivy extends agzi implements ahax
{
    public static final aivy a;
    private static volatile ahbe k;
    public int b;
    public ajsq c;
    public akbf d;
    public aivw e;
    public agyc f;
    public aivx g;
    public aioe h;
    public aoqe i;
    public int j;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(aivy.class, a = new aivy());
    }
    
    private aivy() {
        this.m = 2;
        this.f = agyc.b;
        emptyProtobufList();
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
                final ahbe k;
                if ((k = aivy.k) == null) {
                    synchronized (aivy.class) {
                        if (aivy.k == null) {
                            aivy.k = (ahbe)new agzb((agzi)aivy.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aivy.a;
            }
            case 4: {
                return new agza((agzi)aivy.a);
            }
            case 3: {
                return new aivy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivy.a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1409\u0003\u0005\u100a\u0004\t\u1009\u0007\u000b\u1409\t\f\u1009\n\r\u100c\u000b", new Object[] { "b", "c", "d", "e", "l", "f", "g", "h", "i", "j", aipt.j });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
