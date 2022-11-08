import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwm extends agzi implements ahax
{
    public static final aiwm a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ahfw h;
    private ajjd i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aiwm.class, a = new aiwm());
    }
    
    private aiwm() {
        this.j = 2;
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
                if ((b2 = aiwm.b) == null) {
                    synchronized (aiwm.class) {
                        if (aiwm.b == null) {
                            aiwm.b = (ahbe)new agzb((agzi)aiwm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwm.a;
            }
            case 4: {
                return new agza((agzi)aiwm.a);
            }
            case 3: {
                return new aiwm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwm.a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002\u1409\u0000\u0003\u1409\u0001\u0005\u1409\u0006\u0007\u1409\u0003\b\u1409\u0007\t\u1409\u0004", new Object[] { "c", "d", "e", "h", "f", "i", "g" });
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
