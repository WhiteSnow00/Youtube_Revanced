import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotk extends agzi implements ahax
{
    public static final aotk a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aotk.class, a = new aotk());
    }
    
    private aotk() {
        this.f = 2;
        emptyProtobufList();
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
                if ((b2 = aotk.b) == null) {
                    synchronized (aotk.class) {
                        if (aotk.b == null) {
                            aotk.b = (ahbe)new agzb((agzi)aotk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aotk.a;
            }
            case 4: {
                return new agza((agzi)aotk.a);
            }
            case 3: {
                return new aotk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotk.a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0005\u1409\u0003", new Object[] { "c", "d", "e" });
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
