import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apca extends agzi implements ahax
{
    public static final apca a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private anss i;
    private anss j;
    private aioe k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(apca.class, a = new apca());
    }
    
    private apca() {
        this.m = 2;
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
                if ((b2 = apca.b) == null) {
                    synchronized (apca.class) {
                        if (apca.b == null) {
                            apca.b = (ahbe)new agzb((agzi)apca.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apca.a;
            }
            case 4: {
                return new agza((agzi)apca.a);
            }
            case 3: {
                return new apca();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apca.a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\f\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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