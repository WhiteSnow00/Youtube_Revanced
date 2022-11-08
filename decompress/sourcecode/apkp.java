import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkp extends agzi implements ahax
{
    public static final apkp a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private apkq e;
    private aioe f;
    private ajsq g;
    private aioe h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apkp.class, a = new apkp());
    }
    
    private apkp() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = apkp.b) == null) {
                    synchronized (apkp.class) {
                        if (apkp.b == null) {
                            apkp.b = (ahbe)new agzb((agzi)apkp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apkp.a;
            }
            case 4: {
                return new agza((agzi)apkp.a);
            }
            case 3: {
                return new apkp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkp.a, "\u0001\u0006\u0000\u0001\u0004\u000f\u0006\u0000\u0000\u0006\u0004\u1409\u0003\u0006\u1409\u0005\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u000f\u1409\n", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
