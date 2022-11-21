import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcb extends ahcz implements aheo
{
    public static final akcb a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akcb.class, a = new akcb());
    }
    
    private akcb() {
        this.f = 2;
        emptyProtobufList();
        emptyIntList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = akcb.b) == null) {
                    synchronized (akcb.class) {
                        if (akcb.b == null) {
                            akcb.b = (ahev)new ahcs((ahcz)akcb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcb.a;
            }
            case 4: {
                return new ahcr((ahcz)akcb.a);
            }
            case 3: {
                return new akcb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcb.a, "\u0001\u0002\u0000\u0001\u0006\b\u0002\u0000\u0000\u0002\u0006\u1409\u0003\b\u1409\u0001", new Object[] { "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
