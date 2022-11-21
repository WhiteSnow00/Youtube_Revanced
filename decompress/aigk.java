import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigk extends ahcz implements aheo
{
    public static final aigk a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private anxb f;
    private anxb g;
    private aisc h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aigk.class, a = new aigk());
    }
    
    private aigk() {
        this.j = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aigk.b) == null) {
                    synchronized (aigk.class) {
                        if (aigk.b == null) {
                            aigk.b = (ahev)new ahcs((ahcz)aigk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigk.a;
            }
            case 4: {
                return new ahcr((ahcz)aigk.a);
            }
            case 3: {
                return new aigk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigk.a, "\u0001\u0006\u0000\u0001\u0001\u0015\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\n\b\u1409\u0006\n\u1409\u0004\u0015\u1409\u0002", new Object[] { "c", "d", "e", "i", "h", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
