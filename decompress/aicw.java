import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicw extends ahcz implements aheo
{
    public static final aicw a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aicw.class, a = new aicw());
    }
    
    private aicw() {
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
                if ((b = aicw.b) == null) {
                    synchronized (aicw.class) {
                        if (aicw.b == null) {
                            aicw.b = (ahev)new ahcs((ahcz)aicw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicw.a;
            }
            case 4: {
                return new ahcr((ahcz)aicw.a);
            }
            case 3: {
                return new aicw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicw.a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003\u1409\u0004\u0004\u1409\u0005\b\u1409\b\n\u1409\u0003\u000b\u1409\u0006", new Object[] { "c", "e", "f", "h", "d", "g" });
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
