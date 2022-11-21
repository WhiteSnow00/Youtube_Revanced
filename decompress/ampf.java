import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampf extends ahcz implements aheo
{
    public static final ampf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private anxb e;
    private ajws f;
    private anxb g;
    private anxb h;
    private anxb i;
    private anxb j;
    private ahjl k;
    private anxb l;
    private anxb m;
    private aisc n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(ampf.class, a = new ampf());
    }
    
    private ampf() {
        this.o = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ampf.b) == null) {
                    synchronized (ampf.class) {
                        if (ampf.b == null) {
                            ampf.b = (ahev)new ahcs((ahcz)ampf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampf.a;
            }
            case 4: {
                return new ahcr((ahcz)ampf.a);
            }
            case 3: {
                return new ampf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampf.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\n\u1409\t\u000b\u1409\n\f\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
