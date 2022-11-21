import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apep extends ahcz implements aheo
{
    public static final apep a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private ahjl h;
    private anxb i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apep.class, a = new apep());
    }
    
    private apep() {
        this.j = 2;
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
                if ((b = apep.b) == null) {
                    synchronized (apep.class) {
                        if (apep.b == null) {
                            apep.b = (ahev)new ahcs((ahcz)apep.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apep.a;
            }
            case 4: {
                return new ahcr((ahcz)apep.a);
            }
            case 3: {
                return new apep();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apep.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0003\u0003\u1409\u0004\u0005\u1409\u0006\u0006\u1409\u0001\u0007\u1409\u0002\b\u1409\u0007", new Object[] { "c", "f", "g", "h", "d", "e", "i" });
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
