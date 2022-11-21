import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptf extends ahcz implements aheo
{
    public static final aptf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private aich f;
    private aich g;
    private aptp h;
    private aptz i;
    private ajws j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aptf.class, a = new aptf());
    }
    
    private aptf() {
        this.l = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aptf.b) == null) {
                    synchronized (aptf.class) {
                        if (aptf.b == null) {
                            aptf.b = (ahev)new ahcs((ahcz)aptf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptf.a;
            }
            case 4: {
                return new ahcr((ahcz)aptf.a);
            }
            case 3: {
                return new aptf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptf.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\t\u1409\u0007\n\u1409\b\f\u1409\u0002\r\u1409\u0003", new Object[] { "c", "d", "e", "h", "i", "j", "k", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
