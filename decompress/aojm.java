import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojm extends ahcz implements aheo
{
    public static final aojm a;
    private static volatile ahev d;
    public aisc b;
    public ahbt c;
    private int e;
    private ahjl f;
    private ajws g;
    private ajws h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aojm.class, a = new aojm());
    }
    
    private aojm() {
        this.i = 2;
        this.c = ahbt.b;
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
                final ahev d;
                if ((d = aojm.d) == null) {
                    synchronized (aojm.class) {
                        if (aojm.d == null) {
                            aojm.d = (ahev)new ahcs((ahcz)aojm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aojm.a;
            }
            case 4: {
                return new ahcr((ahcz)aojm.a);
            }
            case 3: {
                return new aojm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojm.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0004\u1409\u0001\u0005\u100a\u0002\u0006\u1409\u0003\u0007\u1409\u0004", new Object[] { "e", "b", "f", "c", "g", "h" });
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
