import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwk extends agzi implements ahax
{
    public static final aiwk a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private aibc i;
    private aibc j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aiwk.class, a = new aiwk());
    }
    
    private aiwk() {
        this.k = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = aiwk.b) == null) {
                    synchronized (aiwk.class) {
                        if (aiwk.b == null) {
                            aiwk.b = (ahbe)new agzb((agzi)aiwk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwk.a;
            }
            case 4: {
                return new agza((agzi)aiwk.a);
            }
            case 3: {
                return new aiwk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwk.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0006\u0006\u1409\b\u0007\u1409\t\u000b\u1409\u0005", new Object[] { "c", "d", "e", "f", "h", "i", "j", "g" });
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
