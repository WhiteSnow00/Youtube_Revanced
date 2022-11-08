import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apoj extends agzi implements ahax
{
    public static final apoj a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private apoz f;
    private appj g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)apoj.class, (agzi)(a = new apoj()));
    }
    
    private apoj() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = apoj.b) == null) {
                    synchronized (apoj.class) {
                        if (apoj.b == null) {
                            apoj.b = (ahbe)new agzb((agzi)apoj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apoj.a;
            }
            case 4: {
                return new agza((agzi)apoj.a);
            }
            case 3: {
                return new apoj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoj.a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\t\u1409\u0005\n\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
