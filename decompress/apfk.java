import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfk extends ahcz implements aheo
{
    public static final apfk a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private amiy g;
    private aofv h;
    private ahjl i;
    private aiet j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(apfk.class, a = new apfk());
    }
    
    private apfk() {
        this.l = 2;
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
                if ((b = apfk.b) == null) {
                    synchronized (apfk.class) {
                        if (apfk.b == null) {
                            apfk.b = (ahev)new ahcs((ahcz)apfk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfk.a;
            }
            case 4: {
                return new ahcr((ahcz)apfk.a);
            }
            case 3: {
                return new apfk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfk.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005\b\u1409\u0007\t\u1409\b\n\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
