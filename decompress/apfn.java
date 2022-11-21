import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfn extends ahcz implements aheo
{
    public static final apfn a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aiet h;
    private aiet i;
    private aiet j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(apfn.class, a = new apfn());
    }
    
    private apfn() {
        this.l = 2;
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
                if ((b = apfn.b) == null) {
                    synchronized (apfn.class) {
                        if (apfn.b == null) {
                            apfn.b = (ahev)new ahcs((ahcz)apfn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfn.a;
            }
            case 4: {
                return new ahcr((ahcz)apfn.a);
            }
            case 3: {
                return new apfn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfn.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\b\u0007\u1409\u000b\n\u1409\u0003\f\u1409\n\r\u1409\t", new Object[] { "c", "d", "e", "f", "h", "k", "g", "j", "i" });
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
