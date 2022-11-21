import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigj extends ahcz implements aheo
{
    public static final aigj a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private aigl e;
    private anxb f;
    private ahjl g;
    private aisc h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aigj.class, a = new aigj());
    }
    
    private aigj() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aigj.b) == null) {
                    synchronized (aigj.class) {
                        if (aigj.b == null) {
                            aigj.b = (ahev)new ahcs((ahcz)aigj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigj.a;
            }
            case 4: {
                return new ahcr((ahcz)aigj.a);
            }
            case 3: {
                return new aigj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigj.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0005\u0005\u1409\u0002\u0007\u1409\u0003\t\u1409\u0007", new Object[] { "c", "d", "g", "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
